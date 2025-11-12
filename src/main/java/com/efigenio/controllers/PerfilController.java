package com.efigenio.controllers;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.efigenio.models.*;
import com.efigenio.repositories.*;

import io.javalin.http.Handler;
import io.javalin.http.UploadedFile;

public class PerfilController {
    public Handler getPerfil = ctx -> {
        String username = ctx.pathParam("username");

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        AvaliacaoRepository avaliacaoRepository = new AvaliacaoRepository();
        Usuario usuario = usuarioRepository.buscarPorUsername(username);
        List<Avaliacao> avaliacoes = avaliacaoRepository.listarAvaliacoesPorUsuario(username);

        if (usuario == null) {
            ctx.status(404).result("Usuario nao encontrado");
            return;
        }

        ctx.render("perfil.ftl", Map.of(
            "usuario", usuario,
            "avaliacoes", avaliacoes
        ));
    };

    public Handler getEditarPerfil = ctx -> {
        String username = ctx.pathParam("username");

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Usuario usuario = usuarioRepository.buscarPorUsername(username);

        ctx.render("editar-perfil.ftl", Map.of(
            "usuario", usuario
        ));
    };

    public Handler postEditarPerfil = ctx -> {
        String usernamePath = ctx.pathParam("username");

        String nome = ctx.formParam("nome");
        String username = ctx.formParam("username");

        UploadedFile inputFile = ctx.uploadedFile("foto");

        Path outPath = null;
        String fotoPath = null;

        if (inputFile != null && inputFile.size() > 0 && inputFile.filename() != null && !inputFile.filename().isBlank()) {
            String originalFileName = inputFile.filename();

            String extension = "";
            int i = originalFileName.lastIndexOf('.');
            if (i > 0) {
                extension = originalFileName.substring(i);
            }
            String fileName = username + "-foto" + extension;

            Path uploadDir = Path.of("src/main/resources/public/uploads");
            Files.createDirectories(uploadDir);

            outPath = uploadDir.resolve(Paths.get(fileName).getFileName());

            try (BufferedInputStream bis = new BufferedInputStream(inputFile.content())) {
                Files.copy(bis, outPath, StandardCopyOption.REPLACE_EXISTING);
            }

            fotoPath = fileName;
        }

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Usuario usuario = usuarioRepository.buscarPorUsername(usernamePath);

        usuario.setNome(nome);
        usuario.setUsername(username);

        if (fotoPath != null) {
            usuario.setFoto(fotoPath);
        }

        usuarioRepository.atualizarPerfil(usuario);

        ctx.redirect("/perfil/" + username);
    };

    public Handler postRemoverFoto = ctx -> {
        String username = ctx.pathParam("username");
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Usuario usuario = usuarioRepository.buscarPorUsername(username);

        if (usuario.getFoto() != null && !usuario.getFoto().isBlank()) {
        Path fotoPath = Path.of("src/main/resources/public/uploads", usuario.getFoto());

            try {
                Files.deleteIfExists(fotoPath);
                System.out.println("Foto removida do disco: " + fotoPath);
            } catch (IOException e) {
                System.out.println("Erro ao remover arquivo: " + e.getMessage());
            }
        }

        usuario.setFoto(null);

        usuarioRepository.removerFotoDePerfil(usuario.getId());

        ctx.redirect("/editar-perfil/" + username);
    };

    public Handler getEditarReview = ctx -> {
        ctx.render("editar-review.ftl");
    };

    public Handler postEditarReview = ctx -> {
        ctx.redirect("/perfil/{username}");
    };

}

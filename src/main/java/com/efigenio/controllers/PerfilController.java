package com.efigenio.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.efigenio.models.*;
import com.efigenio.repositories.*;

import io.javalin.http.Handler;

public class PerfilController {
    public Handler getPerfil = ctx -> {
        String username = ctx.pathParam("username");

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        AvaliacaoRepository avaliacaoRepository = new AvaliacaoRepository();
        Usuario usuario = usuarioRepository.buscarPorUsername(username);
        List<Avaliacao> avaliacoes = avaliacaoRepository.listarAvaliacoesPorUsuario(username);

        if (usuario == null) {
            ctx.status(404).result("Usu�rio n�o encontrado");
            return;
        }

        ctx.render("perfil.ftl", Map.of(
            "usuario", usuario,
            "avaliacoes", avaliacoes
        ));
    };

    public Handler getEditarPerfil = ctx -> {
        ctx.render("editar-perfil.ftl");
    };

    public Handler postEditarPerfil = ctx -> {
        ctx.redirect("/perfil/{username}");
    };

    public Handler getEditarReview = ctx -> {
        ctx.render("editar-review.ftl");
    };

    public Handler postEditarReview = ctx -> {
        ctx.redirect("/perfil/{username}");
    };

}

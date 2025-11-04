package com.efigenio.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Map;

import com.efigenio.models.Usuario;
import com.efigenio.repositories.UsuarioRepository;

import io.javalin.http.Handler;

public class UsuarioController {

    public Handler get = ctx -> {
        ctx.render("cadastro.ftl");
    };

    public Handler post = ctx -> {
        String nome = ctx.formParam("nome");
        String username = ctx.formParam("username");
        String email = ctx.formParam("email");
        String senha = ctx.formParam("senha");

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Usuario usuario = new Usuario(null, nome, username, email, senha, null, null);

        Usuario criado = usuarioRepository.criaUsuario(usuario);

        if (criado == null) {
            ctx.render("cadastro.ftl", Map.of("erro", "Usuário ou e-mail já cadastrado!"));
            return;
        }

        ctx.sessionAttribute("usuarioLogado", usuario);
        ctx.redirect("/home");
    };
}

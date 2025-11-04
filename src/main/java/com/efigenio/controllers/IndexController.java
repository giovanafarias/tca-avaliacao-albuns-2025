package com.efigenio.controllers;

import java.util.Map;

import com.efigenio.models.*;
import com.efigenio.repositories.*;

import io.javalin.http.Handler;

public class IndexController {

    public Handler get = ctx -> {
        ctx.render("index.ftl");
    };

    public Handler post = ctx -> {
        String username = ctx.formParam("username");
        String senha = ctx.formParam("senha");

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Usuario usuarioTentandoLogin = new Usuario(null, null, username, null, senha, null, null);

        Usuario usuarioAutenticado = usuarioRepository.loginUsuario(usuarioTentandoLogin);

        if (usuarioAutenticado != null) {
            ctx.sessionAttribute("usuarioLogado", usuarioAutenticado);

            ctx.render("paginaInicial.ftl", Map.of(
                "usuario", usuarioAutenticado
            ));
        } else {
            ctx.render("index.ftl", Map.of(
                "erro", "Usuário ou senha incorretos!"
            ));
        }
    };

}

package com.efigenio.controllers;

import java.util.Map;

import com.efigenio.models.*;
import com.efigenio.repositories.*;

import io.javalin.http.Handler;

public class PaginaInicialController {
    public Handler get = ctx -> {
        Usuario usuarioLogado = ctx.sessionAttribute("usuarioLogado");

        ctx.render("paginaInicial.ftl", Map.of(
            "usuario", usuarioLogado
        ));
    };
}

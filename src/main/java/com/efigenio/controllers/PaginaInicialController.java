package com.efigenio.controllers;

import java.util.List;
import java.util.Map;

import com.efigenio.models.*;
import com.efigenio.repositories.*;

import io.javalin.http.Handler;

public class PaginaInicialController {
    public Handler get = ctx -> {

        AlbumRepository albumRepository = new AlbumRepository();
        Usuario usuarioLogado = ctx.sessionAttribute("usuarioLogado");
        List<Album> albuns = albumRepository.listarTodos();        
        
        ctx.render("pagina-inicial.ftl", Map.of(
            "usuario", usuarioLogado,
            "albuns", albuns
        ));
    };
}

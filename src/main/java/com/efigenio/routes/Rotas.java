package com.efigenio.routes;

import com.efigenio.controllers.*;

import io.javalin.Javalin;

public class Rotas {
    private UsuarioController usuarioController;
    private IndexController indexController;
    private PaginaInicialController paginaInicialController;

    public Rotas(){
        this.usuarioController = new UsuarioController();
        this.indexController = new IndexController();
        this.paginaInicialController = new PaginaInicialController();
    }

    public void registraRotas(Javalin app){
        
        app.get("/", indexController.get);
        app.post("/login", indexController.post);

        app.get("/cadastro", usuarioController.get);
        app.post("/cadastro", usuarioController.post);

        app.get("/home", paginaInicialController.get);
    }

}

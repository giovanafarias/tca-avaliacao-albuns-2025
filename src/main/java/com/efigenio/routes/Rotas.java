package com.efigenio.routes;

import com.efigenio.controllers.UsuarioController;
import com.efigenio.controllers.IndexController;

import io.javalin.Javalin;

public class Rotas {
    private UsuarioController usuarioController;
    private IndexController indexController;

    public Rotas(){
        this.usuarioController = new UsuarioController();
        this.indexController = new IndexController();
    }

    public void registraRotas(Javalin app){
        
        app.get("/", indexController.get);
        app.get("/cadastro", usuarioController.get);
        app.post("/contatos", usuarioController.post);
    }

}

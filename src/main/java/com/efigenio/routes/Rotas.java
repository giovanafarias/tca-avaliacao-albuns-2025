package com.efigenio.routes;

import com.efigenio.controllers.*;

import io.javalin.Javalin;

public class Rotas {
    private UsuarioController usuarioController;
    private IndexController indexController;
    private PaginaInicialController paginaInicialController;
    private PerfilController perfilController;

    public Rotas(){
        this.usuarioController = new UsuarioController();
        this.indexController = new IndexController();
        this.paginaInicialController = new PaginaInicialController();
        this.perfilController = new PerfilController();
    }

    public void registraRotas(Javalin app){
        
        app.get("/", indexController.get);
        app.post("/login", indexController.post);

        app.get("/cadastro", usuarioController.get);
        app.post("/cadastro", usuarioController.post);

        app.get("/home", paginaInicialController.get);

        app.get("/perfil/{username}", perfilController.getPerfil);

        app.get("/editar-perfil/{username}", perfilController.getEditarPerfil);
        app.post("/editar-perfil/{username}", perfilController.postEditarPerfil);
        app.post("/remover-foto/{username}", perfilController.postRemoverFoto);

        app.get("/editar-review/{username}/{titulo}", perfilController.getEditarReview);
        app.post("/editar-review/{username}/{titulo}", perfilController.postEditarReview);
    }

}

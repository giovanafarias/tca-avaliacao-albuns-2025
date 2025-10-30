package com.efigenio.repositories;

import com.efigenio.DAOs.UsuarioDAOImpl;
import com.efigenio.models.Usuario;

public class UsuarioRepository {
    private UsuarioDAOImpl usuarioDAO;

    public UsuarioRepository() {
        this.usuarioDAO = new UsuarioDAOImpl();
    }
}

package com.efigenio.repositories;

import com.efigenio.DAOs.UsuarioDAOImpl;
import com.efigenio.models.Usuario;

public class UsuarioRepository {
    private UsuarioDAOImpl usuarioDAO;

    public UsuarioRepository() {
        this.usuarioDAO = new UsuarioDAOImpl();
    }

    public Usuario criaUsuario(Usuario usuario) {
        Usuario usuarioCriado = this.usuarioDAO.criaUsuario(usuario);
        return usuarioCriado;
    }

    public Usuario loginUsuario(Usuario usuario) {
        return this.usuarioDAO.autenticaUsuario(usuario.getUsername(), usuario.getSenha());
    }

    public Usuario buscarPorUsername(String username) {
        return this.usuarioDAO.buscarPorUsername(username);
    }
}

package com.efigenio.repositories;

import com.efigenio.DAOs.UsuarioDAOImpl;
import com.efigenio.models.Usuario;

public class UsuarioRepository {
    private UsuarioDAOImpl usuarioDAO;

    public UsuarioRepository() {
        this.usuarioDAO = new UsuarioDAOImpl();
    }

    public Usuario criaUsuario(Usuario usuario) {
        return this.usuarioDAO.criaUsuario(usuario);
    }

    public Usuario loginUsuario(Usuario usuario) {
        return this.usuarioDAO.autenticaUsuario(usuario.getUsername(), usuario.getSenha());
    }

    public Usuario buscarPorUsername(String username) {
        return this.usuarioDAO.buscarPorUsername(username);
    }

    public Usuario atualizarPerfil(Usuario usuario) {
        return this.usuarioDAO.atualizarPerfil(usuario);
    }

    public Boolean verificaUsername(Usuario usuario) {
        return this.usuarioDAO.verificaUsername(usuario);
    }

    public Usuario removerFotoDePerfil(Integer id) {
        return this.usuarioDAO.removerFotoDePerfil(id);
    }
}

package com.efigenio.models.interfaces;
import java.util.List;

import com.efigenio.models.Usuario;

public interface UsuarioDAO {
    Usuario criaUsuario(Usuario usuario);

    Usuario autenticaUsuario(String username, String senha);

    Usuario buscarPorUsername(String username);

    Usuario removerConta(Integer id);

    Usuario atualizarPerfil(Usuario usuario);

    Usuario removerFotoDePerfil(Integer id);

    Usuario avaliarAlbum(Usuario usuario, Integer albumId, Integer nota, String comentario);

    Usuario favoritarAlbum(Usuario usuario, Integer albumId);

    Usuario acessarAlbunsFavoritos(Usuario usuario);
}

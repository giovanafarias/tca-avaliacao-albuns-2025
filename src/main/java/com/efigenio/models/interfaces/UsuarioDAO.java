package com.efigenio.models.interfaces;
import com.efigenio.models.Usuario;

public interface UsuarioDAO {
    Usuario criaUsuario(Usuario usuario);

    Usuario autenticaUsuario(String username, String senha);

    Usuario getUsuarioPorId(Integer id);

    Usuario removerConta(Integer id);

    Usuario editarPerfil(Integer id, Usuario usuarioAtualizado);

    Usuario avaliarAlbum(Usuario usuario, Integer albumId, Integer nota, String comentario);

    Usuario favoritarAlbum(Usuario usuario, Integer albumId);

    Usuario acessarAlbunsFavoritos(Usuario usuario);
}

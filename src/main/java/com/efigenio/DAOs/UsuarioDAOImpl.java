package com.efigenio.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
// import java.sql.Exception;
import java.util.List;

import com.efigenio.database.FabricaDeConexao;
import com.efigenio.models.Avaliacao;
import com.efigenio.models.Usuario;
import com.efigenio.models.interfaces.UsuarioDAO;

public class UsuarioDAOImpl implements UsuarioDAO {

    private static Connection conexao;

    public UsuarioDAOImpl() {
        conexao = FabricaDeConexao.getInstancia().getConexao();
    }

    @Override
    public Usuario criaUsuario(Usuario usuario) {
        try {
            String checkQuery = "SELECT COUNT(*) AS total FROM tca_usuario WHERE username = ? OR email = ?";
            PreparedStatement checkStmt = conexao.prepareStatement(checkQuery);
            checkStmt.setString(1, usuario.getUsername());
            checkStmt.setString(2, usuario.getEmail());
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next() && rs.getInt("total") > 0) {
                System.out.println("Usu�rio ou e-mail j� existentes!");
                return null; 
            }

            rs.close();
            checkStmt.close();

            String insertQuery = "INSERT INTO tca_usuario (nome, username, email, senha) VALUES (?, ?, ?, ?)";
            PreparedStatement pstm = conexao.prepareStatement(insertQuery);

            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getUsername());
            pstm.setString(3, usuario.getEmail());
            pstm.setString(4, usuario.getSenha());

            pstm.executeUpdate();
            pstm.close();

            System.out.println("Usu�rio criado com sucesso!");
            return usuario;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
    
    @Override
    public Usuario autenticaUsuario(String username, String senha) {
        String query = "SELECT * FROM tca_usuario WHERE username = ? AND senha = ?";

        try (PreparedStatement pstm = conexao.prepareStatement(query)) {
            pstm.setString(1, username);
            pstm.setString(2, senha);

            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("id_usuario"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setUsername(rs.getString("username"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setSenha(rs.getString("senha"));
                    return usuario;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

       return null;
    }


    @Override
    public Usuario buscarPorUsername(String username) {
        String query = "SELECT * FROM tca_usuario WHERE username = ?";

        try {
            PreparedStatement pstm = conexao.prepareStatement(query);
            pstm.setString(1, username);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id_usuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setUsername(rs.getString("username"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                return usuario;
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

       return null;
    }

    @Override
    public Usuario removerConta(Integer id) {
        try {
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    

        return null;
    }

    @Override
    public Usuario editarPerfil(Integer id, Usuario usuarioAtualizado) {
        try {
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    

        return null;
    }

    @Override
    public Usuario avaliarAlbum(Usuario usuario, Integer albumId, Integer nota, String comentario) {
        try {
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    

        return null;
    }

    @Override
    public Usuario favoritarAlbum(Usuario usuario, Integer albumId) {
        try {
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    

        return null;
    }

    @Override
    public Usuario acessarAlbunsFavoritos(Usuario usuario) {
        try {
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    

        return null;
    }
}

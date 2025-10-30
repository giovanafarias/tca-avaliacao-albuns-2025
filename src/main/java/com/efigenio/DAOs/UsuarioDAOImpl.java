package com.efigenio.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.efigenio.database.FabricaDeConexao;
import com.efigenio.models.Usuario;
import com.efigenio.models.interfaces.UsuarioDAO;

public class UsuarioDAOImpl implements UsuarioDAO {

    private static Connection conexao;

    public UsuarioDAOImpl() {
        conexao = FabricaDeConexao.getInstancia().getConexao();
    }

    @Override
    public Usuario criaUsuario(Usuario usuario) {
        String query = "INSERT INTO usuario_tca (nome, username, email, senha) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement pstm = conexao.prepareStatement(query)) {
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getUsername());
            pstm.setString(3, usuario.getEmail());
            pstm.setString(4, usuario.getSenha());
            
            pstm.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Erro ao criar usuário: " + e.getMessage());
        }
        
        return usuario;
    }
}

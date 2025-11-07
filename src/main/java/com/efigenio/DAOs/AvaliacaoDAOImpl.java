package com.efigenio.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.efigenio.database.FabricaDeConexao;
import com.efigenio.models.Album;
import com.efigenio.models.Avaliacao;
import com.efigenio.models.Usuario;
import com.efigenio.models.interfaces.AvaliacaoDAO;

public class AvaliacaoDAOImpl implements AvaliacaoDAO {

    private static Connection conexao;

    public AvaliacaoDAOImpl() {
        conexao = FabricaDeConexao.getInstancia().getConexao();
    }
    
    @Override
    public List<Avaliacao> listaAvaliacoes(String username) {
        List<Avaliacao> avaliacoes = new ArrayList<>();

        try {
            String query = "SELECT username, foto, titulo, nota, comentario " +
               "FROM vw_avaliacoes_detalhadas " +
               "WHERE username = ?";

            PreparedStatement pstm = conexao.prepareStatement(query);
            pstm.setString(1, username);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNome(rs.getString("username"));
                usuario.setFoto(rs.getString("foto"));

                Album album = new Album();
                album.setTitulo(rs.getString("titulo"));

                Avaliacao avaliacao = new Avaliacao();
                avaliacao.setNota(rs.getInt("nota"));
                avaliacao.setComentario(rs.getString("comentario"));
                avaliacao.setUsuario(usuario);
                avaliacao.setAlbum(album);

                avaliacoes.add(avaliacao);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar avaliações: " + e.getMessage());
        }

        return avaliacoes;
    }

    @Override
    public Avaliacao getTotalAvalicoes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Avaliacao adicionarComentario() {
        return null;
    }

    @Override
    public Avaliacao editarComentario() {
        return null;
    }

    @Override
    public Avaliacao removerComentario() {
        return null;
    }

    @Override
    public Avaliacao adicionarNota() {
        return null;
    }

    @Override
    public Avaliacao editarNota() {
        return null;
    }

    @Override
    public Avaliacao removerNota() {
        return null;
    }
}

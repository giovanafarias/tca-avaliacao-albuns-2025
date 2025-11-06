package com.efigenio.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.efigenio.database.FabricaDeConexao;
import com.efigenio.models.*;
import com.efigenio.models.interfaces.AlbumDAO;

public class AlbumDAOImpl implements AlbumDAO {

    private static Connection conexao;

    public AlbumDAOImpl() {
        conexao = FabricaDeConexao.getInstancia().getConexao();
    }

    public List<Album> listarTodos() {
        List<Album> albuns = new ArrayList<>();
        String query = "SELECT * FROM vw_album_artista";

        try {
            PreparedStatement pstm = conexao.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                    Artista artista = new Artista(
                        rs.getInt("id_artista"),
                        rs.getString("nome_artista")
                    );

                    Album album = new Album(
                        rs.getInt("id_album"),
                        rs.getString("titulo"),
                        rs.getString("capa"),
                        artista
                    );
                albuns.add(album);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

       return albuns;
    }
}

package com.efigenio.repositories;

import com.efigenio.DAOs.AlbumDAOImpl;
import com.efigenio.models.Album;
import java.util.List;

public class AlbumRepository {
    private AlbumDAOImpl albumDAO;

    public AlbumRepository() {
        this.albumDAO = new AlbumDAOImpl();
    }

    public List<Album> listarTodos() {
        return this.albumDAO.listarTodos();
    }
}
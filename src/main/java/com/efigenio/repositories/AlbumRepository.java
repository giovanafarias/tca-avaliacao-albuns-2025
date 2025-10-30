package com.efigenio.repositories;

import com.efigenio.DAOs.AlbumDAOImpl;
import com.efigenio.models.Album;

public class AlbumRepository {
    private AlbumDAOImpl AlbumDAO;

    public AlbumRepository() {
        this.AlbumDAO = new AlbumDAOImpl();
    }
}
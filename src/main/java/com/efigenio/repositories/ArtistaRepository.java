package com.efigenio.repositories;

import com.efigenio.DAOs.ArtistaDAOImpl;
import com.efigenio.models.Artista;

public class ArtistaRepository {
    private ArtistaDAOImpl artistaDAO;

    public ArtistaRepository() {
        this.artistaDAO = new ArtistaDAOImpl();
    }
}
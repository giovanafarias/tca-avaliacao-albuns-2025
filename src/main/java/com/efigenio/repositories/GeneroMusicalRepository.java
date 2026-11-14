package com.efigenio.repositories;

import com.efigenio.DAOs.GeneroMusicalDAOImpl;
import com.efigenio.models.GeneroMusical;

public class GeneroMusicalRepository {
    private GeneroMusicalDAOImpl generoMusicalDAO;

    public GeneroMusicalRepository() {
        this.generoMusicalDAO = new GeneroMusicalDAOImpl();
    }
}

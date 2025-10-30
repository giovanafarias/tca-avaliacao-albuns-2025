package com.efigenio.repositories;

import com.efigenio.DAOs.MusicaDAOImpl;
import com.efigenio.models.Musica;

public class MusicaRepository {
    private MusicaDAOImpl musicaDAO;

    public MusicaRepository() {
        this.musicaDAO = new MusicaDAOImpl();
    }
}

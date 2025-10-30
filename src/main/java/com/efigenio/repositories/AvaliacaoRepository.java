package com.efigenio.repositories;

import com.efigenio.DAOs.AvaliacaoDAOImpl;
import com.efigenio.models.Avaliacao;

public class AvaliacaoRepository {
    private AvaliacaoDAOImpl avaliacaoDAO;

    public AvaliacaoRepository() {
        this.avaliacaoDAO = new AvaliacaoDAOImpl();
    }
}
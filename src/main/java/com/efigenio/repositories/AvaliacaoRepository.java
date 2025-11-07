package com.efigenio.repositories;

import java.util.List;

import com.efigenio.DAOs.AvaliacaoDAOImpl;
import com.efigenio.models.Avaliacao;

public class AvaliacaoRepository {
    private AvaliacaoDAOImpl avaliacaoDAO;

    public AvaliacaoRepository() {
        this.avaliacaoDAO = new AvaliacaoDAOImpl();
    }

    public List<Avaliacao> listarAvaliacoesPorUsuario(String username) {
        return this.avaliacaoDAO.listaAvaliacoes(username);
    }

}
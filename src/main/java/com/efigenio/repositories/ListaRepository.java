package com.efigenio.repositories;

import com.efigenio.DAOs.ListaDAOImpl;
import com.efigenio.models.Lista;

public class ListaRepository {
    private ListaDAOImpl listaDAO;

    public ListaRepository() {
        this.listaDAO = new ListaDAOImpl();
    }
}

package com.efigenio.models;

public class Grupo extends Artista {
    private String[] integrantes;

    public Grupo(Integer id, String nome, Album[] albuns, String[] integrantes) {
        super(id, nome, albuns);
        this.integrantes = integrantes;
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    public String[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String[] integrantes) {
        this.integrantes = integrantes;
    }

    public String toString() {
        return this.getNome() + " - Integrantes: " + this.integrantes;
    }

}

package com.efigenio.models;

public class Artista {
    private Integer id;
    private String nome;
    private Album[] albuns;

    public Artista(Integer id, String nome, Album[] albuns) {
        this.id = id;
        this.nome = nome;
        this.albuns = albuns;
    }

    public Artista(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Album[] getAlbuns() {
        return albuns;
    }

    public void setAlbuns(Album[] albuns) {
        this.albuns = albuns;
    }

    public String toString() {
        return this.nome;
    }
}

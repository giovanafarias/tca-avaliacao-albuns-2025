package com.efigenio.models;

public class Musica {
    private Integer id;
    private String titulo;
    private Integer duracao;
    private Album album;

    public Musica(Integer id, String titulo, Integer duracao, Album album) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.album = album;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String toString() {
        return this.titulo + " - " + this.duracao + "s";
    }
}
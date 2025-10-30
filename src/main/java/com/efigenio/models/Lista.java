package com.efigenio.models;

public class Lista {
    private Integer id;
    private String titulo;
    private Album[] albums;
    private Usuario usuario;

    public Lista(Integer id, String titulo, Album[] albums, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.albums = albums;
        this.usuario = usuario;
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

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String toString() {
        return this.titulo;
    }
}

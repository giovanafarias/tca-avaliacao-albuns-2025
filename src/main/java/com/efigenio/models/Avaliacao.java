package com.efigenio.models;

import java.sql.Date;

public class Avaliacao {
    private Integer id;
    private String comentario;
    private Integer nota;
    private Date dataAvaliacao;
    private Usuario usuario;
    private Album album;

    public Avaliacao(Integer id, String comentario, Integer nota, Date dataAvaliacao, Usuario usuario, Album album){
        this.id = id;
        this.comentario = comentario;
        this.nota = nota;
        this.dataAvaliacao = dataAvaliacao;
        this.usuario = usuario;
        this.album = album;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Date getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(Date dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String toString() {
        return "Avaliação de " + usuario.getNome() + " para o álbum " + album.toString() + ": " + nota + " estrelas. Comentário: " + comentario;
    }

    public void getTotalAvalicoes() {

    }

    public void adicionarComentario() {
        
    }

    public void editarComentario() {
        
    }

    public void removerComentario() {
        
    }

    public void adicionarNota() {
        
    }

    public void editarNota() {
        
    }

    public void removerNota() {
        
    }
}

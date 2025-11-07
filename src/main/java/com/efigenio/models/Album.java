package com.efigenio.models;

import java.sql.Date;

public class Album {
    private Integer id;
    private String titulo;
    private Date dataLancamento;
    private String descricao;
    private Integer duracao;
    private String capa;
    private Artista artista;
    private Musica[] musicas;
    private GeneroMusical generoMusical;
    private Avaliacao[] avaliacoes;

    public Album(Integer id, String titulo, Date dataLancamento, String descricao, Integer duracao, String capa, Artista artista, Musica[] musicas, GeneroMusical generoMusical, Avaliacao[] avaliacoes){
        this.id = id;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.descricao = descricao;
        this.duracao = duracao;
        this.capa = capa;
        this.artista = artista;
        this.musicas = musicas;
        this.generoMusical = generoMusical;
        this.avaliacoes = avaliacoes;
    }

    public Album(Integer id, String titulo, String capa, Artista artista) {
        this.id = id;
        this.titulo = titulo;
        this.capa = capa;
        this.artista = artista;
    }

    public Album() {
        //TODO Auto-generated constructor stub
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

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

    public GeneroMusical getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(GeneroMusical generoMusical) {
        this.generoMusical = generoMusical;
    }

    public Avaliacao[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public String toString() {
        return this.titulo + " - " + this.artista.getNome() + 
               " (" + this.dataLancamento + ")" +
               "\nDescri��o: " + this.descricao +
               "\nDura��o: " + this.duracao + " segundos" +
               "\nG�nero: " + this.generoMusical.getNome() +
               "\nM�sicas: " + java.util.Arrays.toString(this.musicas);
    }
}

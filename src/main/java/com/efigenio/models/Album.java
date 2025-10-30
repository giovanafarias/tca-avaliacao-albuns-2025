package com.efigenio.models;

import java.sql.Date;

public class Album {
    private String id;
    private String titulo;
    private Date dataLancamento;
    private String descricao;
    private Integer duracao;
    private Artista artista;
    private Musica[] musicas;
    private GeneroMusical generoMusical;
    private Avaliacao[] avaliacoes;

    public Album(String id, String titulo, Date dataLancamento, String descricao, Integer duracao, Artista artista, Musica[] musicas, GeneroMusical generoMusical, Avaliacao[] avaliacoes){
        this.id = id;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.descricao = descricao;
        this.duracao = duracao;
        this.artista = artista;
        this.musicas = musicas;
        this.generoMusical = generoMusical;
        this.avaliacoes = avaliacoes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
               "\nDescrição: " + this.descricao +
               "\nDuração: " + this.duracao + " segundos" +
               "\nGênero: " + this.generoMusical.getNome() +
               "\nMúsicas: " + java.util.Arrays.toString(this.musicas);
    }

    public void getDuracaoTotal() {
        int duracaoTotal = 0;
        for (Musica musica : musicas) {
            duracaoTotal += musica.getDuracao();
        }
        System.out.println("Duração total do álbum '" + this.titulo + "': " + duracaoTotal + " segundos");
    }

    public void getListaDeMusicas() {
        System.out.println("Lista de músicas do álbum '" + this.titulo + "':");
        for (Musica musica : musicas) {
            System.out.println("- " + musica.getTitulo() + " (" + musica.getDuracao() + " segundos)");
        }
    }

    public void getMediaAvaliacoes() {
        if (avaliacoes.length == 0) {
            System.out.println("Nenhuma avaliação disponível para o álbum '" + this.titulo + "'.");
            return;
        }
        double somaNotas = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            somaNotas += avaliacao.getNota();
        }
        double media = somaNotas / avaliacoes.length;
        System.out.printf("Média das avaliações do álbum '%s': %.2f estrelas%n", this.titulo, media);
    }
}

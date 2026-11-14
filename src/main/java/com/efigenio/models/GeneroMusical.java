package com.efigenio.models;

public class GeneroMusical {
    private Integer id;
    private String nome;
    private String descricao;

    public GeneroMusical(Integer id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return this.nome + " - " + this.descricao;
    }

    public void getTotalGeneros() {
    }

    public void listarMusicasPorGenero() {
    }
}

package com.efigenio.models;

public class Solo extends Artista {
    private String descricao;

    public Solo(Integer id, String nome, Album[] albuns, String descricao) {
        super(id, nome, albuns);
        this.descricao = descricao;
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return this.getNome() + " - " + this.descricao;
    }
}

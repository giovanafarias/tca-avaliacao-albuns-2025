package com.efigenio.models;
import java.util.ArrayList;
import com.efigenio.Main;

public class Usuario {
    private Integer id;
    private String nome;
    private String username;
    private String email;
    private String senha;
    private Avaliacao[] avaliacoes;
    
    public Usuario(Integer id, String nome, String username, String email, String senha, Avaliacao[] avaliacoes){
        this.id = id;
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.avaliacoes = avaliacoes;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Avaliacao[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public String toString() {
        return this.nome + " - " + this.username;
    }

    public void fazerLogin(Avaliacao contato) {
        
    }

    public void criarConta() {

    }

    public void removerConta() {

    }

    public void editarPerfil() {

    }

    public void avaliarAlbum() {

    }

    public void favoritarAlbum() {

    }

    public void acessarAlbunsFavoritos() {

    }
    
    public void adicionarFavoritosAoPerfil() {

    }
}

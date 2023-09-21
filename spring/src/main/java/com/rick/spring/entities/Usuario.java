package com.rick.spring.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;

    @OneToMany
    private List<Livro> livrosLidos = new ArrayList<Livro>();

    public Usuario(int id, String nome, String email, List<Livro> livrosLidos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.livrosLidos = livrosLidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Livro> getLivrosLidos() {
        return livrosLidos;
    }

}

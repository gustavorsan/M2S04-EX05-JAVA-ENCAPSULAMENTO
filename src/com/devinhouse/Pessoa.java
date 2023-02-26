package com.devinhouse;

public class Pessoa {
    protected String nome;
    protected String sobrenome;

    public String obterNomeCompleto(){
        return this.nome+" "+this.sobrenome;
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}

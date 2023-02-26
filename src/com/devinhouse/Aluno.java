package com.devinhouse;

public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(String nome, String sobrenome, int matricula) {
        super(nome, sobrenome);
        this.matricula = matricula;
    }

    public String registrar(){
        return "Sou o "+this.obterNomeCompleto()+" e minha matrícula é "+ matricula+".";
    }
}

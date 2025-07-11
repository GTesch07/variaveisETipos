package br.com.guilherme.tesch.modelos;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private boolean aluno;

    public Pessoa(String nome, int idade, double altura, boolean aluno){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.aluno = aluno;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }
    public boolean isAluno(){
        return aluno;
    }
}

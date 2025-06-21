package br.com.guilherme.tesch.principal;

import br.com.guilherme.tesch.modelos.Paciente;

public class Principal {
    public static void main(String[]args){
        int quantidadePassos = 500;
        double alturaEmMetros = 1.60;

        String nome = "Jose";
        //conversão explicita
        int alturaEmCentimetros = (int) (alturaEmMetros * 100);
        System.out.println("Altura em centimetros: "+alturaEmCentimetros);
    }
}

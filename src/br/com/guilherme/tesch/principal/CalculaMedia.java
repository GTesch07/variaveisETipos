package br.com.guilherme.tesch.principal;

public class CalculaMedia {
    public static void main(String[] args){
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;

        double media = (nota1 + nota2 + nota3)/3;

        System.out.printf("A média das notas é: %.2f",media
        );
    }
}

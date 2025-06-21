package br.com.guilherme.tesch.principal;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celcius: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9/ 5) + 32;

        System.out.printf("A temperatura em graus Fahrenheit é: %.2f", fahrenheit );


        scanner.close();
    }
}

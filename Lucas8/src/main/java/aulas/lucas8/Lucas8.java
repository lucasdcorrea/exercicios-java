package aulas.lucas8;

/**
 * ALUNO: LUCAS DANIEL CORREA DE SOUZA
 * CPF: 06433611974
 */

import java.util.Scanner;


public class Lucas8 {

    public static void main(String[] args) {
        int inicio = 10;
        int fim = 974;
        int soma = 0;
        int somaPares = 0;
        int qtdPares = 0;
        
        System.out.println("Soma de todos os números entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }
        System.out.println(soma);
        
        System.out.println("\nNúmeros pares entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                somaPares += i;
                qtdPares++;
            }
        }
        
        System.out.println("\n\nSoma dos números pares entre " + inicio + " e " + fim + ":");
        System.out.println(somaPares);
        System.out.println("\nExistem " + qtdPares + " números pares entre " + inicio + " e " + fim + ".");
    }
}
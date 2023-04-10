package aulas.lucas7;

/**
 * ALUNO: LUCAS DANIEL CORREA DE SOUZA
 * CPF: 06433611974
 */

import java.util.Scanner;

public class Lucas7 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio, fim, numero;
        
        // Mostra múltiplos de 5 entre 90 e 200
        System.out.println("Múltiplos de 5 entre 90 e 200:");
        for (int i = 90; i <= 200; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        
        // Pede ao usuário para escolher outro intervalo e um número para mostrar os múltiplos
        System.out.print("\n\nAgora que já sabemos os múltiplos, Digite o início de outro intervalo: ");
        inicio = scanner.nextInt();
        System.out.print("Digite o fim desse novo intervalo: ");
        fim = scanner.nextInt();
        System.out.print("Digite um número para mostrar os múltiplos: ");
        numero = scanner.nextInt();
        
        // Mostra os múltiplos do número escolhido dentro do intervalo informado
        System.out.println("\nMúltiplos de " + numero + " entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (i % numero == 0) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}


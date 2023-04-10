package aulas.lucas6;

/**
 * ALUNO: LUCAS DANIEL CORREA DE SOUZA
 * CPF: 06433611974
 */

import java.util.Scanner;

public class Lucas6 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String opcao;
        
        do {
            System.out.print("Digite um número inteiro (ou digite 'sair' para sair): ");
            opcao = scanner.next();
            
            if (opcao.equalsIgnoreCase("sair")) {
                break;
            }
            
            numero = Integer.parseInt(opcao);
            
            if (numero < 0) {
                System.out.println("O número " + numero + " é negativo.");
            } else if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }
        } while (true);
        
        scanner.close();
    }
}
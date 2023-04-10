
package aulas.lucas5;

/**
 * ALUNO: LUCAS DANIEL CORREA DE SOUZA
 * CPF: 06433611974
 */

import java.util.Scanner;

public class Lucas5 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor;
        String continuar;
        
        do {
            System.out.print("Digite um número: ");
            valor = scanner.nextDouble();
            
            if (valor > 0) {
                System.out.println("O número " + valor + " é positivo.");
            } else if (valor < 0) {
                System.out.println("O número " + valor + " é negativo.");
            } else {
                System.out.println("O número " + valor + " é neutro.");
            }
            
            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));
        
        scanner.close();
    }
}
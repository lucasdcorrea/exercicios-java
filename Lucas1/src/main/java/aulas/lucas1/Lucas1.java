package aulas.lucas1;

/**
 * ALUNO: LUCAS DANIEL CORREA DE SOUZA
 * CPF: 06433611974
 */

import java.util.Scanner;

public class Lucas1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Digite um número (ou digite 'sair' para sair): ");
            String entrada = scanner.nextLine();
            
            if (entrada.equalsIgnoreCase("sair")) {
                continuar = false;
                continue;
            }
            
            double numero = Double.parseDouble(entrada);
            
            if (numero > 0) {
                if (numero % 5 == 0) {
                    System.out.println("O número é positivo e múltiplo de 5.");
                } else {
                    System.out.println("O número é positivo e não é múltiplo de 5.");
                }
            } else if (numero < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            }
        }
        
        scanner.close();
    }
}
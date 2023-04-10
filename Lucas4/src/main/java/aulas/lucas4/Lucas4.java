package aulas.lucas4;

/**
 * ALUNO: LUCAS DANIEL CORREA DE SOUZA
 * CPF: 06433611974
 */

import java.util.Scanner;

public class Lucas4 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Digite a idade do nadador (ou digite 'sair' para sair): ");
            String entrada = scanner.nextLine();
            
            if (entrada.equalsIgnoreCase("sair")) {
                continuar = false;
                continue;
            }
            
            int idade = Integer.parseInt(entrada);
            
            if (idade >= 5 && idade <= 7) {
                System.out.println("Infantil A");
            } else if (idade >= 8 && idade <= 10) {
                System.out.println("Infantil B");
            } else if (idade >= 11 && idade <= 13) {
                System.out.println("Juvenil A");
            } else if (idade >= 14 && idade <= 17) {
                System.out.println("Juvenil B");
            } else if (idade >= 18) {
                System.out.println("Adulto");
            } else {
                System.out.println("Muito novo, volte quando for maior!");
            }
        }
        
        scanner.close();
    }
}

package aulas.lucas2;

/**
 * ALUNO: LUCAS DANIEL CORREA DE SOUZA
 * CPF: 06433611974
 */

    import java.util.Scanner;

public class Lucas2 {

 public static void main(String[] args) {
        System.out.println("Tabuada do 6:");
        for (int i = 6; i <= 6*20; i += 6) {
            System.out.println("6 x " + (i / 6) + " = " + i);
        }
        System.out.println("Agora que já sabemos a tabuada do 6...");
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Digite um número para ver sua tabuada (ou digite 'sair' para sair): ");
            String entrada = scanner.nextLine();
            
            if (entrada.equalsIgnoreCase("sair")) {
                continuar = false;
                continue;
            }
            
            int numero = Integer.parseInt(entrada);
            
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 20; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
        
        scanner.close();
    }
}
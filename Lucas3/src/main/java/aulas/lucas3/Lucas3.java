package aulas.lucas3;

/**
 * ALUNO: LUCAS DANIEL CORREA DE SOUZA
 * CPF: 06433611974
 */

import java.util.Scanner;

public class Lucas3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, z;
        
        do {
            System.out.print("Digite o primeiro valor do triângulo: ");
            x = scanner.nextDouble();
            System.out.print("Digite o segundo valor do triângulo: ");
            y = scanner.nextDouble();
            System.out.print("Digite o terceiro valor do triângulo: ");
            z = scanner.nextDouble();
            
            if (x <= 0 || y <= 0 || z <= 0) {
                System.out.println("Os valores digitados devem ser positivos!");
            } else if (x + y <= z || x + z <= y || y + z <= x) {
                System.out.println("Os valores digitados não formam um triângulo!");
            }
        } while (x <= 0 || y <= 0 || z <= 0 || x + y <= z || x + z <= y || y + z <= x);
        
        if (x == y && y == z) {
            System.out.println("Triângulo equilátero!");
        } else if (x == y || x == z || y == z) {
            System.out.println("Triângulo isósceles!");
        } else {
            System.out.println("Triângulo escaleno!");
        }
        
        scanner.close();
    }
}
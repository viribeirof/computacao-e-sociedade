/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A, B, C, somaAB;

        System.out.println("Digite o valor de A:");
        A = entrada.nextInt();

        System.out.println("Digite o valor de B:");
        B = entrada.nextInt();

        System.out.println("Digite o valor de C:");
        C = entrada.nextInt();

        somaAB = A + B;

        if (somaAB < C) {
            System.out.println("A soma de A com B é menor que C");
        } else if (somaAB == C) {
            System.out.println("A soma de A com B é igual a C");
        } else {
            System.out.println("A soma de A com B é maior que C");
        }
         
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mercadoria1, mercadoria2, mercadoria3, mercadoria11, mercadoria22, mercadoria33, porcentagem1, porcentagem2, porcentagem3, mediaInflacao;

        System.out.println("Digite o valor da primeira mercadoria em 01/01/2022:");
        mercadoria1 = entrada.nextDouble();
        System.out.println("Digite o valor da primeira mercadoria em 01/02/2022:");
        mercadoria11 = entrada.nextDouble();

        System.out.println("Digite o valor da segunda mercadoria em 01/01/2022:");
        mercadoria2 = entrada.nextDouble();
        System.out.println("Digite o valor da segunda mercadoria em 01/02/2022:");
        mercadoria22 = entrada.nextDouble();

        System.out.println("Digite o valor da terceira mercadoria em 01/01/2022:");
        mercadoria3 = entrada.nextDouble();

        System.out.println("Digite o valor da terceira mercadoria em 01/02/2022:");
        mercadoria33 = entrada.nextDouble();
        
        porcentagem1 = ((mercadoria11 - mercadoria1) / mercadoria1) * 100;
        porcentagem2 = ((mercadoria22 - mercadoria2) / mercadoria2) * 100;
        porcentagem3 = ((mercadoria33 - mercadoria3) / mercadoria3) * 100;
        
        mediaInflacao = (porcentagem1 + porcentagem2 + porcentagem3) / 3;
        
        System.out.println("media da inflacao: " + mediaInflacao);
        
        if (mediaInflacao > 0.55) {
            System.out.println("Inflacao acima da media!!");
        } else {
            System.out.println("Inflacao abaixo da media");
        }
        
    }
}

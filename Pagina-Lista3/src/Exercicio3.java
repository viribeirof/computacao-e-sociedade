/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;
        
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quilowatt; 
        double preco, conta, contaAtraso;
        boolean consumoElevado = false;
        System.out.println("Digite o preco do quilowatt: ");
        preco = entrada.nextDouble();
        System.out.println("Digite os quilowatts gastos: ");
        quilowatt = entrada.nextInt();
        
        conta = preco * quilowatt;
        contaAtraso = conta + conta * 0.10;
        
        if(quilowatt > 70) {
            consumoElevado = true;
        }
        System.out.println("Conta a pagar: " + conta);
        System.out.println("Conta com atraso: " + contaAtraso);
         System.out.println("Consumo elevado: " + consumoElevado);
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorCompra, valorPago, valorTroco, notas100 = 0, notas10 = 0, notas1 = 0;

        System.out.println("Digite o valor da compra:");
        valorCompra = entrada.nextInt();
        System.out.println("Digite o valor pago:");
        valorPago = entrada.nextInt();
        
        valorTroco = valorPago - valorCompra;
        System.out.println("valor do troco: " + valorTroco);
        while (valorTroco > 0) {
            if(valorTroco > 100){
                notas100++;
                valorTroco -= 100;
            } else if(valorTroco > 10){
                notas10++;
                valorTroco-=10;
            } else if(valorTroco > 0){
                notas1++;
                valorTroco-=1;
            }
        }
        
        System.out.println("notas de 100: " + notas100);
        System.out.println("notas de 10: " + notas10);
        System.out.println("notas de 1: " + notas1);
    }
}

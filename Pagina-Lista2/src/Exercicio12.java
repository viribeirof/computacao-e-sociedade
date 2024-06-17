/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final double PRATO_VAZIO = 0.45;
        final double PRECO_QUILO = 39.00;
        double pesoPrato, pesoFinal, precoFinal;
        
        System.out.println("Digite o peso total do prato em quilos: ");
        pesoPrato = entrada.nextDouble();
        pesoFinal = pesoPrato - PRATO_VAZIO;
        precoFinal = pesoFinal * PRECO_QUILO;
        
        System.out.printf("O valor a pagar sera:  R$%.2f\n", precoFinal);
    }
}

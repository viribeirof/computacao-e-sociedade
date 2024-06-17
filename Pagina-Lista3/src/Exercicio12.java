/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int A, B;
        
        System.out.println("Digite o valor de A:");
        A = entrada.nextInt();
        
        System.out.println("Digite o valor de B:");
        B = entrada.nextInt();
        
        if (A == B) {
            System.out.println("A e B sao iguais");
        } else {
            System.out.println("A e B sao diferentes");
        }
               
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    int num1, num2, soma, quadrado;
    
    System.out.println("Digite o primeiro numero: ");
    num1 = entrada.nextInt();
    
    System.out.println("Digite o segundo numero: ");
    num2 = entrada.nextInt();
    
    soma = num1 + num2;
    quadrado = soma * soma;
    
    System.out.println("O calculo do quadrado da soma desses numeros é: " + quadrado);
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;
import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);
      int num1, num2, somaQuadrado;
      
      System.out.println("Digite o primeiro numero: ");
      num1 = entrada.nextInt();
      
      System.out.println("Digite o segundo numero: ");
      num2 = entrada.nextInt();
      
      somaQuadrado = (num1 * num1) + (num2 * num2);
      System.out.println("Soma dos quadrados dos numeros digitados = " + somaQuadrado);
      
    }
    
}

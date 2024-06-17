/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
    
    int numero, quociente, resto;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    numero = entrada.nextInt();
    
    quociente = numero / 2;
    resto = numero % 2;
    
    System.out.println("quociente da divisao por 2: " + quociente);
    System.out.println("resto: " + resto);
  
    
   } 
}

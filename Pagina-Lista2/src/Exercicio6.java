/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class Exercicio6 {
    public static void main (String args []) {
        Scanner entrada = new Scanner(System.in);
        double c, f;
        System.out.println("Digite a temperatura em Celsius: ");
        c = entrada.nextDouble();
        f = c * 9 / 5 + 32;
        
        System.out.println("A temperatura em  Fahrenheit é: " + f);
    }
}

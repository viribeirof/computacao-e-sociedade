/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int base, altura, area, perimetro;
    
        System.out.println("Digite o valor da base do retangulo: ");
        base = entrada.nextInt();
        
        System.out.println("Digite o valor da altura do retangulo: ");
        altura = entrada.nextInt();
        
        area = base * altura;
        perimetro = (base * 2) + (altura *2);
        
        System.out.println("Area do retangulo: " + area);
        System.out.println("Perimetro do retangulo: " + perimetro );
        
        
    }
}

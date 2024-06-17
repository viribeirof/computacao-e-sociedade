/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double peso, altura, imc;
        boolean pesoElevado = false;
        
        System.out.println("Digite o seu peso (em kg): ");
        peso = entrada.nextDouble();
        
        System.out.println("Digite a sua altura: ");
        altura = entrada.nextDouble();
        
        imc = peso / (altura * altura);
        if (imc > 25) {
            pesoElevado = true;
        }
        System.out.println("imc: " + imc);
        System.out.println("Acima do peso: " + pesoElevado);
    }
}

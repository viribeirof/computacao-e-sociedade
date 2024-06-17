/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double tamPista;
        int peso, visibilidade, chuva, passageiros;
        boolean sistemaDecolagem, decola = false;

        System.out.println("Digite o tamanho da pista (em km)");
        tamPista = entrada.nextDouble();

        System.out.println("Digite o peso");
        peso = entrada.nextInt();

        System.out.println("Digite a visibilidade");
        visibilidade = entrada.nextInt();

        System.out.println("Digite a quantidade de chuva (em mm)");
        chuva = entrada.nextInt();

        System.out.println("Digite o numero de passageiros");
        passageiros = entrada.nextInt();

        System.out.println("Digite se o sistema de decolagem computadorizado é true ou false");
        sistemaDecolagem = entrada.nextBoolean();

        if (tamPista < 1.5 && peso < 40) {
            decola = true;
        } else if (tamPista > 1.5 && tamPista < 2 && peso < 60) {
            decola = true;
        } else if (tamPista > 2) {
            decola = true;
        }

        if (visibilidade < 20 && sistemaDecolagem == true) {
            decola = true;
        }

        if (chuva > 5) {
            decola = false;
        }
        if (passageiros > 100 && chuva > 0) {
            decola = false;
        }
        
        System.out.println("Decola: " + decola);
    }

}

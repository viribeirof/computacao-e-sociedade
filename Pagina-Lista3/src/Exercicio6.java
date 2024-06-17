/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int prova1, prova2, trabalho, frequencia;
        boolean isAprovado = false;
        
        System.out.print("Digite a sua nota na primeira prova: ");
        prova1 = entrada.nextInt();
        
        System.out.print("Digite a sua nota na segunda prova: ");
        prova2 = entrada.nextInt();
        
        System.out.print("Digite a sua nota no trabalho: ");
        trabalho = entrada.nextInt();
        
        System.out.print("Digite a sua frequencia: ");
        frequencia = entrada.nextInt();
        
        if((prova1 >= 6 || prova2 >= 6) && trabalho >= 7 && frequencia >= 75) {
            isAprovado = true;
        } else if(trabalho == 6 && frequencia >= 90){
            isAprovado = true;
        }
        
        System.out.println("Aprovado: " + isAprovado);
    }
}

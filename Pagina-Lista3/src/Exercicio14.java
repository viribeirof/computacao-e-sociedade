/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notaMatematica, notaConGeral, notaPortugues, media;
        
        System.out.println("Digite a sua nota na prova de Matematica:");
        notaMatematica = entrada.nextDouble();
        
        System.out.println("Digite a sua nota na prova de Portugues:");
        notaPortugues = entrada.nextDouble();
        
        System.out.println("Digite a sua nota na prova de Conhecimentos Gerais:");
        notaConGeral = entrada.nextDouble();
                
        media = (notaMatematica + notaConGeral + notaPortugues) / 3;
        
        System.out.println("Nota na prova de Matematica: " + notaMatematica);
        System.out.println("Nota na prova de Portugues: " + notaPortugues);
        System.out.println("Nota na prova de Conhecimentos Gerais: " + notaConGeral);
        System.out.println("Media das notas: " + media);
        
        if (media > 7 && notaMatematica > 5 && notaConGeral > 5 && notaPortugues > 5) {
            System.out.println("O canditado foi aprovado!");
        } else {
            System.out.println("O canditado nao foi aprovado :(");
        }
       
        }
    }


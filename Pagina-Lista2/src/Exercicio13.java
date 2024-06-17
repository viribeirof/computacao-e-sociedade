/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas, minutos, segundos, horasEmSegundos, minutosEmSegundos, totalSegundos;
        
        System.out.println("Digite as horas: ");
        horas = entrada.nextInt();
        System.out.println("Digite os minutos: ");
        minutos = entrada.nextInt();
        System.out.println("Digite os segundos: ");
        segundos = entrada.nextInt();
        
        horasEmSegundos = horas * 3600;
        minutosEmSegundos = minutos * 60;
        totalSegundos = horasEmSegundos + minutosEmSegundos + segundos;
        System.out.println("O total de segundos passados desde que o dia comecou é: " + totalSegundos);
    
    
    } 
}

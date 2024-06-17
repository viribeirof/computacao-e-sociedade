/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int segundos, minutos = 0, horas = 0;
        
        System.out.println("Digite a quantidade de segundos: ");
        segundos = entrada.nextInt();
        while (segundos >= 60 ) {
            segundos = segundos - 60;
            minutos++;
            if (minutos >= 60) {
                horas++;
                minutos = minutos - 60;
            }
        }
        System.out.println( horas + "h" + minutos +"m" + segundos + "s");
    }
}

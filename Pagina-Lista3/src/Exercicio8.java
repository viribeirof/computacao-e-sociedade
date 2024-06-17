/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double tempo, distancia;
        boolean perigo = false;
        
        System.out.println("Digite o tempo:");
        tempo = entrada.nextDouble();
        
        distancia = tempo * 340;
        
        if(distancia < 200) {
            perigo = true;
        }
        System.out.println("Distancia: " + distancia);
        System.out.println("Perigo: " + perigo);
        
    }
}

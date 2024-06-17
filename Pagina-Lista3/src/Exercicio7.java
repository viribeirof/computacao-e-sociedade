/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int altura, comprimento, largura, areaPiso, volume, areaParedes;
       boolean arPequeno = false , arMedio = false, arGrande = false;
       
        System.out.println("Digite a altura:");
        altura = entrada.nextInt();
        System.out.println("Digite a largura:");
        largura = entrada.nextInt();
        System.out.println("Digite o comprimento:");
        comprimento = entrada.nextInt();
        
        areaPiso = comprimento * largura;
        volume = altura * comprimento * largura;
        areaParedes = (altura * largura + altura * comprimento) * 2;
        
        if(volume < 100) {
            arPequeno = true;
        }
        if (volume > 100 && volume < 500) {
            arMedio = true;
        }
        if (volume >500) {
            arGrande = true;
        }
        
        System.out.println("Area piso: " + areaPiso);
        System.out.println("Volumem: " + volume);
        System.out.println("Area paredes: "  + areaParedes);
        System.out.println("Ar pequeno: " + arPequeno);
        System.out.println("Ar medio: " + arMedio);
        System.out.println("Ar grande: " + arGrande);
    }
}

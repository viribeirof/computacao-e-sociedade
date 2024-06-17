/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class Exercicio7 {
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        int QTipo1, QTipo2, QTipo3; 
        final double TIPO_1 = 1.50;
        final double TIPO_2 = 2.00;  
        final double TIPO_3 = 0.75;
        double VTipo1, VTipo2, VTipo3, total;
        
        System.out.println("Digite a quantidade vendida de picoles do tipo 1: ");
        QTipo1 = entrada.nextInt();
        
        System.out.println("Digite a quantidade vendida de picoles do tipo 2: ");
        QTipo2 = entrada.nextInt();
        
        System.out.println("Digite a quantidade vendida de picoles do tipo 3: ");
        QTipo3 = entrada.nextInt();
        
        VTipo1 = QTipo1 * TIPO_1;
        VTipo2 = QTipo2 * TIPO_2;
        VTipo3 = QTipo3* TIPO_3;
        total = VTipo1 + VTipo2 + VTipo3;
        
        System.out.println("Valor arrecadado do tipo 1: " + VTipo1);
        System.out.println("Valor arrecadado do tipo 2: " + VTipo2);
        System.out.println("Valor arrecadado do tipo 3: " + VTipo3);
        System.out.println("Valor total arrecadado: " + total);
        
    }
}

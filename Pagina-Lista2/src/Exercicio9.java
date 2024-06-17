/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class Exercicio9 {
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        int QCafe, LLeite, BBolacha;
        double CCafe, CLeite, CBolacha, GCafe, GLeite, GBolacha, GTotal ;
        
        System.out.println("Digite a quantidade de quilos de cafe: ");
        QCafe = entrada.nextInt();
        
        System.out.println("Digite o valor do quilo do cafe: ");
        CCafe = entrada.nextDouble();
        
        System.out.println("Digite a quantidade de litros de leite: ");
        LLeite = entrada.nextInt();
        
        System.out.println("Digite o valoer do litro do leite: ");
        CLeite = entrada.nextDouble();
        
        System.out.println("Digite a quantidade de litros de leite: ");
        BBolacha = entrada.nextInt();
        
        System.out.println("Digite o valoer do litro do leite: ");
        CBolacha = entrada.nextDouble();       
        
        GCafe = QCafe * CCafe;
        GLeite = LLeite * CLeite;
        GBolacha = BBolacha * CBolacha;
        GTotal = GCafe + GLeite + GBolacha;
        
        System.out.println("Valor gasto em cafe: " + GCafe);
        System.out.println("Valor gasto em leite: " + GLeite);
        System.out.println("Valor sto em bolacha: " + GBolacha);
        System.out.println("Valor total gasto: " + GTotal);
        
    }
}

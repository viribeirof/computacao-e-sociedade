 
package exercicios;

import java.util.Scanner;
public class Exercicio7{
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cálculo de potencia");
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        
        int quadrado = numero * numero;
        System.out.println("O quadrado deste número e: " + quadrado);
    }

}

 
package exercicios;

import java.util.Scanner;
public class Exercicio8{
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cálculo de potencia");
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = entrada.nextInt();   
       
        System.out.print("Digite o quarto número: ");
        int numero4 = entrada.nextInt();
        
        int resultado = (numero1 * numero1) + (numero2 * numero2) + (numero3 * numero3) + (numero4 * numero4);
        System.out.println("O resultado é: " + resultado);
    }

}


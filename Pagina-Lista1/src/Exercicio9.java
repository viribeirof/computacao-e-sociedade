 
package exercicios;

import java.util.Scanner;
public class Exercicio9{
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cálculo de raiz quadrada");
        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();
        
        double raiz = Math.sqrt(numero);
        System.out.println("A raiz quadrada desse numero é: " + raiz);
    }

}



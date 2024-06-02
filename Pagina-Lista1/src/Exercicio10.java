 
package exercicios;

import java.util.Scanner;
public class Exercicio10{
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conversor Celsius para Fahrenheit");
        System.out.print("Digite a temperatura em celsius: ");
        double celsius = entrada.nextDouble();
        
        double fahrenheit = (9 * celsius + 160) / 5;
         
        System.out.println("A temperatura em fahrenheit é " + fahrenheit);

    }

}


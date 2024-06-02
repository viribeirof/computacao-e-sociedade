 
package exercicios;
import java.util.Scanner;

public class Exercicio5 {
      public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cálculo de y(x)= 3x + 2");
        System.out.print("Digite o valor de x: ");
        double x = entrada.nextDouble();
        double y = 3 * x + 2;
        System.out.println("O valor de y é: " + y);
        
    }

}

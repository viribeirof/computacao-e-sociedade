
package exercicios;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um numero:");
        numero = entrada.nextInt();
        
        if (numero <= 10){
            System.out.println("F1");
        } else if (numero > 10 && numero <= 100) {
            System.out.println("F2");
        } else if (numero > 100) {
            System.out.println("F3");
        }
    }
}


package exercicios;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int angulo;
        
        System.out.println("Digite os graus do angulo:");
        angulo = entrada.nextInt();
        
        if (angulo > 90) {
            System.out.println("Angulo obtuso");
        } else if (angulo == 90) {
            System.out.println("Angulo reto");
        } else {
            System.out.println("Angulo agudo");
        }
    }
}

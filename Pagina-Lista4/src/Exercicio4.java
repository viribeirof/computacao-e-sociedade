
package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Digitee um numero:");
        numero = entrada.nextInt();
        
        if(numero % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}

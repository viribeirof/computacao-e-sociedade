 
package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        int numero = entrada.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("O número digitado foi: " + numero);
        System.out.println("antecessor: " + antecessor);
        System.out.println("sucessor: " + sucessor);

    }

}


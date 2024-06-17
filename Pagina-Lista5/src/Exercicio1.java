
package exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro numero:");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = entrada.nextInt();

        while (num1 != num2) {
            System.out.println("Numeros diferentes!");

            System.out.println("Digite o primeiro numero:");
            num1 = entrada.nextInt();

            System.out.println("Digite o segundo numero:");
            num2 = entrada.nextInt();
        }
        System.out.println("Numeros iguais!");
    }

}

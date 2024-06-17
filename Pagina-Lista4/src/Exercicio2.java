
package exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int prova1, prova2, trabalho;

        System.out.print("Digite a sua nota na primeira prova: ");
        prova1 = entrada.nextInt();

        System.out.print("Digite a sua nota na segunda prova: ");
        prova2 = entrada.nextInt();

        System.out.print("Digite a sua nota no trabalho: ");
        trabalho = entrada.nextInt();

        if ((prova1 >= 6 || prova2 >= 6) && trabalho >= 7) {
            System.out.println("Parabens! voce foi aprovado");
        } else {
            System.out.println("Infelizmente, voce nao foi aprovado");
        }
    }
}

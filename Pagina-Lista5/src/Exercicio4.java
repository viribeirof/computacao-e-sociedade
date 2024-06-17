
package exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cardápio:");
        System.out.println("Especificação\t\tCódigo\tPreço");
        System.out.println("Cachorro Quente\t\t110\tR$4,00");
        System.out.println("X-Salada\t\t101\tR$6,00");
        System.out.println("Bauru com Ovo\t\t102\tR$6,50");
        System.out.println("Refrigerante\t\t103\tR$2,00");

        int codigo, quantidade;
        double total;

        System.out.print("Digite o código do item desejado: ");
        codigo = entrada.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        quantidade = entrada.nextInt();

        for (int i = 100; i == codigo; i++) {
            total = 4 * quantidade;
            System.out.println(quantidade + " Cachorro quente, valor total:" + total);
        }
        for (int i = 101; i == codigo; i++) {
            total = 6 * quantidade;
            System.out.println(quantidade + " X salada, valor total:" + total);
        }
        for (int i = 102; i == codigo; i++) {
            total = 6.50 * quantidade;
            System.out.println(quantidade + " Bauru com ovo, valor total:" + total);
        }
        for (int i = 103; i == codigo; i++) {
            total = 6.50 * quantidade;
            System.out.println(quantidade + " Refrigerante, valor total:" + total);
        }
    }
}

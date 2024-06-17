
package exercicios;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo, credito = 0;
        System.out.println("Digite o valor do saldo");
        saldo = entrada.nextDouble();

        if (saldo > 0 && saldo <= 500.00) {
            System.out.println("Nenhum crédito adquirido");
        }
        if (saldo >= 500.01 && saldo <= 1000.00) {
            credito = saldo * 0.30;
        }
        if (saldo >= 1000.01 && saldo <= 3000.00) {
            credito = saldo * 0.40;
        }
        if (saldo > 3000) {
            credito = saldo * 0.30;
        }
        
        System.out.println("Saldo medio: " + saldo);
        System.out.println("Credito: " + credito);
    }
}

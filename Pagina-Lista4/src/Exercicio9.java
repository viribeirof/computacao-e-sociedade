
package exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String numero;
        double saldoAtual, valor, novoSaldo = 0;
        int operacao;
        
        System.out.println("Digite o numero da sua conta bancaria:");
        numero = entrada.nextLine();

        System.out.println("Digite o seu saldo atual");
        saldoAtual = entrada.nextDouble();

        System.out.println("Digite o tipo de operacao: 1 - depósito, 2 - saque");
        operacao = entrada.nextInt();

        System.out.println("Digite o valor da operacao: ");
        valor = entrada.nextDouble();

        switch (operacao) {
            case 1:
                novoSaldo = saldoAtual + valor;
                break;

            case 2:
                novoSaldo = saldoAtual - valor;

                break;
        }

        if (novoSaldo < 0) {
            System.out.println("Conta estourada");
        }

        System.out.println("Novo saldo: " + novoSaldo);

    }
}

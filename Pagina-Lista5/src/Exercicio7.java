
package exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, tipo;
        int diarias;
        double valorDiaria = 0, valorTotal;
        boolean entradaValida;
        char continuar;
        do {
            System.out.println("Digite o seu nome:");
            nome = entrada.nextLine();
            do {
                System.out.println("Tipo do Apto\t\tValor diaria");
                System.out.println("A\t\t150.00");
                System.out.println("B\t\t100.00");
                System.out.println("C\t\t75.00");

                System.out.println("Digite o tipo de apartamento");
                tipo = entrada.nextLine().toUpperCase();
                entradaValida = true;
                switch (tipo) {
                    case "A":
                        valorDiaria = 150.00;
                        break;
                    case "B":
                        valorDiaria = 100.00;
                        break;
                    case "C":
                        valorDiaria = 75.00;
                        break;
                    default:
                        System.out.println("Tipo inválido. Por favor, digite A, B ou C.");
                        entradaValida = false;
                }
            } while (!entradaValida);
            do {
                System.out.println("Digite o número de diárias utilizadas (deve ser maior que zero):");
                diarias = entrada.nextInt();
                entrada.nextLine();
                if (diarias <= 0) {
                    System.out.println("O numero de diárias deve ser maior que zero.");
                }
            } while (diarias <= 0);

            valorTotal = diarias * valorDiaria;
            System.out.println("Hospede: " + nome);
            System.out.println("Tipo do apartamento: " + tipo);
            System.out.println("Valor total das diárias: R$" + String.format("%.2f", valorTotal));

            do {
                System.out.println("Deseja continuar? (S/N)");
                continuar = entrada.nextLine().toUpperCase().charAt(0);
            } while (continuar != 'S' && continuar != 'N');

       } while (continuar == 'S');

        System.out.println("Cadastro efetuado.");
} 
}


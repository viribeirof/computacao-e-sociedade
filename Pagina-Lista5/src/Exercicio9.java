
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String cpf, classeRenda;
        double rendaMensal, imposto, aliquota;
        do {
            System.out.println("Digite o CPF (Digite 00 para encerrar):");
            cpf = entrada.nextLine();
            if (cpf.equals("00")) {
                break;
            }

            System.out.println("Digite a renda mensal:");
            rendaMensal = entrada.nextDouble();
            entrada.nextLine(); 

            System.out.println("Digite a classe de renda (A, B, C, D, E):");
            classeRenda = entrada.nextLine().toUpperCase();

            switch (classeRenda) {
                case "A":
                    aliquota = 0;
                    break;
                case "B":
                    aliquota = 0.05;
                    break;
                case "C":
                    aliquota = 0.10;
                    break;
                case "D":
                    aliquota = 0.15;
                    break;
                case "E":
                    aliquota = 0.20;
                    break;
                default:
                    System.out.println("Classe de renda inválida.");
                    continue; 
            }

            imposto = rendaMensal * aliquota;
            System.out.printf("CPF: %s\n", cpf);
            System.out.printf("Alíquota aplicada: %.0f%%\n", aliquota * 100);
            System.out.printf("Valor do imposto a ser descontado: R$%.2f\n\n", imposto);

        } while (!cpf.equals("00"));

    }
}

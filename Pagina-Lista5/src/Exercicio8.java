
package exercicios;

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;
        int totalInfantil = 0, totalAdulto = 0;
        String continuar, tipoBilhete;

        do {
            System.out.println("Digite a idade do visitante:");
            idade = entrada.nextInt();
            entrada.nextLine();
            if (idade < 6) {
                tipoBilhete = "Isento de pagamento";
            } else if (idade <= 12) {
                tipoBilhete = "Bilhete de criança";
                totalInfantil++;
            } else if (idade <= 65) {
                tipoBilhete = "Bilhete normal";
                totalAdulto++;
            } else {
                tipoBilhete = "Bilhete de terceira idade";
                totalAdulto++;
            }

            System.out.println("Tipo de bilhete: " + tipoBilhete);

            System.out.println("Deseja ler um novo bilhete? (sim/não)");
            continuar = entrada.nextLine().toLowerCase();

        } while (continuar.equals("sim"));

        System.out.println("Total de bilhetes de criança vendidos: " + totalInfantil);
        System.out.println("Total de bilhetes de adulto vendidos: " + totalAdulto);

}
}
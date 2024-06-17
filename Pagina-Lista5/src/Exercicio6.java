
package exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, numA = 0, idadeD = 0, numD = 0, mediaD = 0, maiorIdade = 0, menorIdade = Integer.MAX_VALUE, diferenca;
        String nota;
        System.out.println("Nota\t\tSignificado");
        System.out.println("A\t\tOtimo");
        System.out.println("B\t\tBom");
        System.out.println("C\t\tRegular");
        System.out.println("D\t\tRuim");

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a sua nota:");
            nota = entrada.nextLine();

            System.out.println("Digite a sua idade");
            idade = entrada.nextInt();
            entrada.nextLine(); 

            if("A".equals(nota)) {
                numA++;
            }
            if ("D".equals(nota)) {
                idadeD += idade;
                numD++;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
        }

        if (numD > 0) {
            mediaD = idadeD / numD;
        }

        diferenca = maiorIdade - menorIdade;

        System.out.println("Respostas otimo: " + numA);
        System.out.println("Media de idade de quem respondeu ruim: " + mediaD);
        System.out.println("Diferenca do mais velho pro mais novo: " + diferenca + " anos");

    }
}

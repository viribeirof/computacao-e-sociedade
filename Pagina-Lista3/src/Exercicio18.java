
package exercicios;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia em que voce nasceu:");
        int diaNasceu = entrada.nextInt();

        System.out.println("Digite o numero do mes em que voce nasceu:");
        int mesNasceu = entrada.nextInt();

        System.out.println("Digite o ano em que voce nasceu:");
        int anoNasceu = entrada.nextInt();

        System.out.println("Digite o dia atual:");
        int diaAtual = entrada.nextInt();

        System.out.println("Digite o numero do mes atual:");
        int mesAtual = entrada.nextInt();

        System.out.println("Digite o ano atual:");
        int anoAtual = entrada.nextInt();

        int anosEmDias = (anoAtual - anoNasceu) * 360;
        int mesesEmDias = (mesAtual - mesNasceu) * 30;
        int dias = diaAtual - diaNasceu;
        int diasTotal = anosEmDias + mesesEmDias + dias;

        System.out.println("Dias vividos: " + diasTotal);
    }
}

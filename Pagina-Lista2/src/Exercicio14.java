package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a hora atual: ");
        int horas = entrada.nextInt();
        System.out.println("Digite os minutos atuais ");
        int minutos = entrada.nextInt();
        System.out.println("Digite os segundos atuais: ");
        int segundos = entrada.nextInt();

        int segsAteFimDoDia = ((23 - horas) * 3600) + ((59 - minutos) * 60) + (59 - segundos);

        System.out.println("Segundos até o fim do dia: " + segsAteFimDoDia);
    }
}

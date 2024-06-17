
package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, sexo;
        int i = 0, idade;
        System.out.println("Digite o seu nome:");
        nome = entrada.nextLine();

        System.out.println("Digite o seu sexo:");
        sexo = entrada.nextLine();

        System.out.println("Digite a sua idade:");
        idade = entrada.nextInt();

        while (idade != 0) {
            i++;
            System.out.println("digite 0 para sair");
            System.out.println("Digite a sua idade:");
            idade = entrada.nextInt();
        }
        System.out.println("Numero de repeticoes: " + i);
    }
}

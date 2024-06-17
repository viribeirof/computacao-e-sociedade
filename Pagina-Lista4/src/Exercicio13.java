
package exercicios;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String produto1, produto2, produto3;
        int quantidade1, quantidade2, quantidade3;

        System.out.println("Digite o nome do primeiro produto");
        produto1 = entrada.nextLine();

        System.out.println("Digite a quantidade em estoque do primeiro produto");
        quantidade1 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o nome do segundo produto");
        produto2 = entrada.nextLine();

        System.out.println("Digite a quantidade em estoque do segundo produto");
        quantidade2 = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Digite o nome do terceiro produto");
        produto3 = entrada.nextLine();
        System.out.println("Digite a quantidade em estoque do terceiro produto");
        quantidade3 = entrada.nextInt();

        if (quantidade1 < 30) {
            System.out.println("O produto " + produto1 + " esta abaixo do estoque minimo");
        }
        if (quantidade2 < 30) {
            System.out.println("O produto " + produto2 + " esta abaixo do estoque minimo");
        }
        if (quantidade3 < 30) {
            System.out.println("O produto " + produto3 + " esta abaixo do estoque minimo");
        }
    }
}

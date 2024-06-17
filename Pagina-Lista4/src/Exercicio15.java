
package exercicios;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int idade = entrada.nextInt();

        if (idade >= 5 && idade <= 10) {
            System.out.println("Categoria infantil");
        }
        if (idade >= 11 && idade <= 17) {
            System.out.println("Categoria juvenil");
        }
        if (idade >= 18 && idade <=60) {
            System.out.println("Categoria adulto");
        }
        if(idade > 60) {
            System.out.println("Categoria senior");
        }
    }
}

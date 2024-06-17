
package exercicios;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double altura, ideal;
        String genero;

        System.out.println("Digite a sua altura:");
        altura = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o seu genero: M - masculino, F - feminino");
        genero = entrada.nextLine(); 

        switch (genero) {
            case "M" -> {
                ideal = 72.7 * altura - 58;
                System.out.println("Peso ideal: " + ideal);
            }

            case "F" -> {
                ideal = 62.1 * altura - 44.7;
                System.out.println("Peso ideal: " + ideal);
            }

            default -> System.out.println("Erro! gênero inválido");
        }
    }
}

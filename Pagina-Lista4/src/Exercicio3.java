
package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Digite o seu peso (em kg): ");
        peso = entrada.nextDouble();

        System.out.println("Digite a sua altura: ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("imc: " + imc);
        if (imc < 20) {
            System.out.println("Magro");
        } else if (imc > 20 && imc < 24.99) {
            System.out.println("normal");
        } else if (imc > 25 && imc < 30) {
            System.out.println("sobrepeso");
        } else {
            System.out.println("obeso");
        }
    }
}

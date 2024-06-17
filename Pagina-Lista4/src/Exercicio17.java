
package exercicios;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso, pesoNovo;
        int codigo;

        System.out.println("Digite o peso no planeta Terra");
        peso = entrada.nextDouble();

        System.out.println("Digite o numero do planeta para a conversao:");
        System.out.println(" 1. Mercúrio");
        System.out.println(" 2. Vênus");
        System.out.println(" 3. Terra");
        System.out.println(" 4. Marte");
        System.out.println(" 5. Júpiter");
        System.out.println(" 6. Saturno");
        System.out.println(" 7. Urano");
        System.out.println(" 8. Netuno");
        codigo = entrada.nextInt();

        switch (codigo) {
            case 1:
                pesoNovo = peso * 0.37;
                System.out.println("Peso em Mercurio: " + pesoNovo);
                break;
            case 2:
                pesoNovo = peso * 0.88;
                System.out.println("Peso em Venus: " + pesoNovo);
                break;
            case 3:
                pesoNovo = peso * 1;
                System.out.println("Peso na Terra: " + pesoNovo);
                break;
            case 4:
                pesoNovo = peso * 0.37;
                System.out.println("Peso em Marte: " + pesoNovo);
                break;
            case 5:
                pesoNovo = peso * 2.47;
                System.out.println("Peso em Jupiter: " + pesoNovo);
                break;
            case 6:
                pesoNovo = peso * 1.04;
                System.out.println("Peso em Saturno: " + pesoNovo);
                break;
            case 7:
                pesoNovo = peso * 0.88;
                System.out.println("Peso em Urano: " + pesoNovo);
                break;
            case 8:
                pesoNovo = peso * 1.11;
                System.out.println("Peso em Netuno: " + pesoNovo);
                break;
        }

    }
}

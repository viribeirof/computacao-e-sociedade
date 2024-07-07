
package exercicios;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro entre 0 e 999:");
        int numero = entrada.nextInt();
        int soma = 0;

            while (numero > 0) {
                soma += numero % 10;
                numero /= 10; 
            }
            System.out.println("A soma dos dígitos desse numero é" + soma);
        }

    }


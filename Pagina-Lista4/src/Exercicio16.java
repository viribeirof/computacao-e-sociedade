
package exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x, y;
        
        System.out.print("Digite a coordenada x: ");
        x = entrada.nextDouble();
        System.out.print("Digite a coordenada y: ");
        y = entrada.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("O ponto está na origem");
        } else if (x == 0) {
            System.out.println("O ponto está sobre o eixo y");
        } else if (y == 0) {
            System.out.println("O ponto está sobre o eixo x");
        } else if (x > 0 && y > 0) {
            System.out.println("O ponto está no primeiro quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no segundo quadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no terceiro quadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("O ponto está no quarto quadrante");
        }
    }
}


package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int X, Y, Z;
        
        System.out.println("Digite o valor de X");
        X = entrada.nextInt();
        
        System.out.println("Digite o valor de Y");
        Y = entrada.nextInt();
        
        System.out.println("Digite o valor de Z");
        Z = entrada.nextInt();
        
        if ( X == Y && X == Z && Y == Z) {
            System.out.println("Equilátero");
        } else if ( X == Y || X == Z || Y == Z) {
            System.out.println("Isócele");
        } else if ( X + Y > Z && X + Z > Y && Y + Z > X) {
            System.out.println("Escaleno");
        } else {
            System.out.println("Nao e triangulo");
        }
    }
}

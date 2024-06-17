
package exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[3];
        
        System.out.println("Digite o valor do primeiro numero");
        numeros[0] = entrada.nextInt();
        
        System.out.println("Digite o valor do segundo numero");
        numeros[1] = entrada.nextInt();
        
        System.out.println("Digite o valor do terceiro numero");
        numeros[2] = entrada.nextInt();
        
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
     }
}

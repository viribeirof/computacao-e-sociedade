
package exercicios;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2, numero3, menor = 0; 
        
        System.out.println("Digite o primeiro numero");
        numero1 = entrada.nextInt();
        
        System.out.println("Digite o segundo numero");
        numero2 = entrada.nextInt();
        
        System.out.println("Digite o terceiro numero");
        numero3 = entrada.nextInt();
        
        
        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
        } else  if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
        } else  if (numero3 <= numero1 && numero3 <= numero2) {
            menor = numero3;
        }
        
        System.out.println(menor);
    }
}

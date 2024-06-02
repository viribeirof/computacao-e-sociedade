 
package exercicios;
import java.util.Scanner;
public class Exercicio6 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cálculo de consumo medio");
        System.out.print("Digite a distância percorrida (em KM): ");
        double distancia = entrada.nextDouble();
        
        System.out.println("Digite a quantidade de combustível consumido (em litros): ");
        double volume = entrada.nextDouble();
        
        double consumo = distancia / volume;
        
        System.out.println("O consumo médio do automóvel foi de " + consumo + " km/l");
    }

}


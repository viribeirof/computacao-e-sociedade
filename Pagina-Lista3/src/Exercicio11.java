
package exercicios;

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double distancia, consumo, preco, precoTotal;
        
        System.out.println("Digite a distancia percorrida (em km):");
        distancia = entrada.nextDouble();
        
        System.out.println("Digite o consumo medio de gasolina por litro:");
        consumo = entrada.nextDouble();
        
        System.out.println("Digite o preco do combustivel:");
        preco = entrada.nextDouble();
        
        precoTotal = distancia / consumo * preco;
        
        System.out.println("VAlor gasto em combustivel: " + precoTotal);
    }
}

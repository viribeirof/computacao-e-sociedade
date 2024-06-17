package exercicios;

import java.util.Scanner;

public class Exercicio15 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa: ");
        double peso = entrada.nextDouble();

        double pesoEngordar = peso + (peso * 0.15);
        double pesoEmagrecer = peso - (peso * 0.20);

        System.out.println("peso se a pessoa engordar: " + pesoEngordar);
        System.out.println("peso se a pessoa emagrecer: " + pesoEmagrecer);


    }
}

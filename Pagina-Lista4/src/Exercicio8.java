
package exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String categoria, nome;
        double salario, novoSalario;

        System.out.println("Digite o seu nome:");
        nome = entrada.nextLine();

        System.out.println("Digite a sua categria:");
        categoria = entrada.nextLine();

        System.out.println("Digite o valor do seu salario");
        salario = entrada.nextDouble();

        switch (categoria) {
            case "A", "H":
                novoSalario = salario + (salario * 0.10);
                break;

            case "B", "D", "E":
                novoSalario = salario + (salario * 0.15);
                break;
                
            case "C", "F" :
                novoSalario = salario + (salario * 0.25);
                break;
                
            default:
                novoSalario = salario + (salario * 0.30);
                break;

        }
        
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Salario: " + novoSalario);

    }
}

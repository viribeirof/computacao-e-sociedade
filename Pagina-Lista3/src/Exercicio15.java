
package exercicios;

import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, salarioLiquido, auxilio; 
        int dependentes;
        
        System.out.println("Digite o valor bruto do salario: ");
        salarioBruto = entrada.nextDouble();
        
        System.out.println("Digite o numero de dependentes: ");
        dependentes = entrada.nextInt();
        
        salarioLiquido = salarioBruto - ((salarioBruto * 0.11) + (salarioBruto * 0.15));
        
        if (dependentes > 0) {
            auxilio = dependentes * 150;
            salarioLiquido = salarioLiquido+ auxilio;
        }
        System.out.println("Salario liquido: "+ salarioLiquido);
    }
}

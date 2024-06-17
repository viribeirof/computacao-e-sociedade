/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        double salarioMinimo, valorTotalVendas, salarioFixo, comissaoCarro, comissaoVendas, salarioTotal;
        int carrosVendidos;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do salário-mínimo: ");
        salarioMinimo = entrada.nextDouble();

        System.out.print("Digite a quantidade de carros vendidos: ");
        carrosVendidos = entrada.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        valorTotalVendas = entrada.nextDouble();
        
        salarioFixo = 2 * salarioMinimo;
        comissaoCarro = carrosVendidos * 150.00;

        comissaoVendas = valorTotalVendas * 0.05;

        salarioTotal = salarioFixo + comissaoCarro + comissaoVendas;

        System.out.println("O salário total do vendedor é: " + salarioTotal);
        
    }
}

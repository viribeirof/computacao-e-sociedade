/
package exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalParcelas, parcelasPagas, parcelasRestantes;
        double valorParcela, valorRestante, valorPago;
        
        System.out.println("Digite o total de parcelas:");
        totalParcelas = entrada.nextInt();
        
        System.out.println("Digite a quantidade de parcelas pagas:");
        parcelasPagas = entrada.nextInt();
        
        System.out.println("Digite o valor de cada parcela:");
        valorParcela = entrada.nextDouble();
        
        parcelasRestantes = totalParcelas - parcelasPagas;
        valorRestante = parcelasRestantes * valorParcela;
        valorPago = parcelasPagas * valorParcela;
        
        System.out.println("total ja pago: " + valorPago);
        System.out.println("Total a pagar: " + valorRestante);
        
    }
}

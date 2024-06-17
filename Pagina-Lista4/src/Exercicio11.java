
package exercicios;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int hora, minuto, segundo, segundoNovo;
        
        System.out.println("Digite a hora (de 0 a 23");
        hora = entrada.nextInt();
        
        System.out.println("Digite o minuto (de 0 a 59");
        minuto = entrada.nextInt();
        
        System.out.println("Digite o segundo (de 0 a 59");
        segundo = entrada.nextInt();
        
        segundo++;
        
        if(segundo > 59) {
            segundo = 0;
            minuto++;
        } 
        
        if (minuto > 59) {
            minuto = 0;
            hora++; 
        } 
        
        if (hora > 23) {
            hora = 0;
            
        }
        System.out.printf("Novo horário: %02d:%02d:%02d\n", hora, minuto, segundo);
        
    }
}

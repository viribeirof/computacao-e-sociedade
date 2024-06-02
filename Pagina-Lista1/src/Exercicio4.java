 
package exercicios;

import java.util.Scanner;
public class Exercicio4 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite o seu endereço: ");
        String endereco = entrada.nextLine();
        
        System.out.print("Digite o seu telefone(apenas números): ");
        int telefone = entrada.nextInt();
        
        System.out.println("nome: "+ nome);
        System.out.println("endereço: " + endereco);
        System.out.println("telefone: " + telefone);
        
    }

}



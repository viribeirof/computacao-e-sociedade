
package exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sexo, f = 0;
        double altura, mediaTurma, maiorTurma = 0, alturaFem = 0, mediaFem, alturaTotal = 0;
        for (int i = 0; i <= 3; i++) {
            System.out.println("Digite a altura");
            altura = entrada.nextDouble();

            System.out.println("Digite o sexo (1 - masculino, 2 - feminino)");
            sexo = entrada.nextInt();
            
            alturaTotal += altura;
            if (altura > maiorTurma) {
                maiorTurma = altura;   
            }
            if (sexo == 2) {
                alturaFem += altura;
                f++;
            }
        }
        mediaFem = alturaFem / f;
        mediaTurma = alturaTotal / 4;
        
        System.out.println("Maior altura: " + maiorTurma);
        System.out.println("Media de altura das mulheres: " + mediaFem);
        System.out.println("Media de altura da turma: " + mediaTurma);
        
    }
}

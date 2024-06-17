package exercicios;

public class Exercicio16 
{
    public static void main(String[] args) 
    {
        double salario = 1500.0;
        double conta1 = 200.0;
        double conta2 = 120.0;

        double totalPagar = (conta1 + (conta1 * 0.02)) + (conta2 + (conta2 * 0.02));
        double restoSalario = salario - totalPagar;

        System.out.println("Restará do salário de João: R$ " + restoSalario);
    }    
}

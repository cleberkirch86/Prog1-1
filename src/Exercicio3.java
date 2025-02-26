import java.util.Scanner;

public class Exercicio3 {
    /**
     Escreva um algoritmo para ler o salário mensal atual de um funcionário
     * e o percentual de reajuste. Calcular e escrever o valor do novo salário
     */
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os dados
        float salarioMensal;
        float percentualReajuste;
        float salarioReajustado;

        // Leitura dos dados
        System.out.print("Digite o salario mensal atual do funcionario: ");
        salarioMensal = scanner.nextFloat();
        System.out.print("Digite o % de reajuste a ser aplicado: ");
        percentualReajuste = scanner.nextFloat();

        //Cálculos
        salarioReajustado = salarioMensal * (1+((percentualReajuste)/100));

        //Exibir novo valor
        System.out.println("Novo Salario :" + salarioReajustado);
    }

}
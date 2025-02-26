import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Criando o scanner para ler os dados
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados de entrada
        System.out.print("Digite o número de carros vendidos: ");
        int qtdeCarros = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor que o vendedor recebe por carro vendido: ");
        double comissaoPorCarro = scanner.nextDouble();

        // Cálculo da comissão percentual (5% do valor total das vendas)
        double comissaoPercentual = 0.05 * valorTotalVendas;

        // Cálculo do salário final
        double salarioFinal = salarioFixo + (comissaoPorCarro * qtdeCarros) + comissaoPercentual;

        // Exibindo o salário final
        System.out.printf("O salário final do vendedor é: R$ %.2f\n", salarioFinal);

        // Fechando o scanner
        scanner.close();
    }
}

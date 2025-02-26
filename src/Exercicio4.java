import java.util.Scanner;

public class Exercicio4 {
    /**
     O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor
     e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28%
     e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever
     o custo final ao consumidor.
     */
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Constantes
        double percDistribuidor = 0.28;
        double impostos = 0.45;
        double custoFabrica;
        double valorFinal;
        double custoSomado;

        // Leitura dos dados
        System.out.print("Digite o custo de fabricação do carro: ");
        custoFabrica = scanner.nextDouble();

        // Verifica se o custo de fábrica é positivo
        if (custoFabrica <= 0) {
            System.out.println("O custo de fabricação deve ser um valor positivo.");
            return;
        }

        // Cálculos
        custoSomado = custoFabrica + (custoFabrica * percDistribuidor);
        valorFinal = custoSomado * (1 + impostos);

        // Exibir novo valor com duas casas decimais
        System.out.printf("Valor de venda: R$ %.2f\n", valorFinal);
    }
}

import java.util.Scanner;

public class Exercicio2 {
    /**
     * Escreva um algoritmo para ler o número total 
     * de eleitores de um município, o número de votos brancos, 
     * nulos e válidos. Calcular e escrever o percentual que cada um 
     * representa em relação ao total de eleitores. 
     */
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os dados dos eleitores
        int totalEleitores;
        int votosBrancos;
        int votosNulos;
        int votosValidos;

        // Leitura dos dados dos eleitores
        System.out.print("Digite o número total de eleitores: ");
        totalEleitores = scanner.nextInt();
        System.out.print("Digite o número de votos brancos: ");
        votosBrancos = scanner.nextInt();
        System.out.print("Digite o número de votos nulos: ");
        votosNulos = scanner.nextInt();
        System.out.print("Digite o número de votos válidos: ");
        votosValidos = scanner.nextInt();

        if (votosBrancos + votosNulos + votosValidos <= totalEleitores) {
            double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
            double percentualNulos = (votosNulos * 100.0) / totalEleitores;
            double percentualValidos = (votosValidos * 100.0) / totalEleitores;

            System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
            System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
            System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
        } else {
            System.out.println("A soma dos votos não pode ser maior que o número total de eleitores.");
        }
    }

}
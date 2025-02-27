import java.util.Scanner;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler as notas da 1a. e 2a. avaliações
        System.out.print("Digite a nota da primeira avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda avaliação: ");
        double nota2 = scanner.nextDouble();

        // Calcular a média aritmética simples
        double media = (nota1 + nota2) / 2;

        // Verificar se o aluno foi aprovado ou não
        if (media >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

        // Escrever a média calculada
        System.out.println("Média: " + media);

        scanner.close();
    }
}

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double valor1, valor2;

        while (true) { // Loop para garantir que os valores sejam diferentes
            System.out.print("Digite o primeiro valor: ");
            valor1 = leitor.nextDouble();

            System.out.print("Digite o segundo valor: ");
            valor2 = leitor.nextDouble();

            if (valor1 != valor2) { // Verifica se os valores são diferentes
                break; // Sai do loop se forem diferentes
            } else {
                System.out.println("Os valores não podem ser iguais. Tente novamente.");
            }
        }

        if (valor1 < valor2) {
            System.out.println("Os valores em ordem crescente são: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Os valores em ordem crescente são: " + valor2 + ", " + valor1);
        }

    }
}

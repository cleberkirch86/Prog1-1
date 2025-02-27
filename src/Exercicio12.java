import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        // Vamos criar um "leitor" para pegar os números que a pessoa digitar
        Scanner leitor = new Scanner(System.in);

        // Agora, vamos perguntar o primeiro número e guardar na variável "valor1"
        System.out.print("Digite o primeiro valor: ");
        double valor1 = leitor.nextDouble();

        // E agora, perguntar o segundo número e guardar na variável "valor2"
        System.out.print("Digite o segundo valor: ");
        double valor2 = leitor.nextDouble();

        // Agora, vamos verificar qual dos dois é o maior
        if (valor1 > valor2) {
            // Se o valor1 for maior que o valor2, vamos mostrar o valor1
            System.out.println("O maior valor é: " + valor1);
        } else {
            // Se não, o valor2 é maior (ou igual, mas como não podem ser iguais, é maior)
            System.out.println("O maior valor é: " + valor2);
        }


    }
}
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
      //  Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor");
        double valorDigitado = scanner.nextDouble();

        if (valorDigitado < 0)
        {
            System.out.println("Valor é negativo");
        }
        else
        {
            System.out.println("Valor é positivo");
        }

    }
}

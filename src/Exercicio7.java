import java.util.Scanner;

public class Exercicio7 {
    /**
     * Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10,
     * caso contrário escrever NÃO É MAIOR QUE 10!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valorDigitado = scanner.nextDouble();


        if (valorDigitado > 10)
        {
            System.out.println("É MAIOR QUE 10!");
        } else
        {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }


}

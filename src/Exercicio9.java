import java.util.Scanner;


public class Exercicio9 {

    public static void main(String[] args) {
        /**
         * As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze.
         * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
         */

        Scanner scanner = new Scanner(System.in);

        double valorMacaDuzia = 1;
        double valorMacaUnitario = 1.30;
        double valorCompra = 0;

        System.out.println("Informe a quantidade de maçãs que deseja comprar:");
        double valorDigitado = scanner.nextDouble();

        if (valorDigitado < 12) {
            valorCompra = valorDigitado * valorMacaUnitario;
        }
        else valorCompra = valorDigitado * valorMacaDuzia;

        System.out.println("Valor da Compra:" + String.format("%.2f",valorCompra ));
    }
}

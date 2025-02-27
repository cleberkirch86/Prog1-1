import javax.swing.*;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usuário vai digitar a temperatura em farenheit
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Passo 3: Converter em Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Passo 4: Exibir a temperatura em Celsius
                                                          //  Formatfloat('#.2',celsius)
        System.out.println("A temperatura em Celsius é: " + String.format("%.2f", celsius) + "°C");

                scanner.close();
    }
}

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da P1: ");
        double p1 = scanner.nextDouble();

        System.out.print("Digite a nota da E1: ");
        double e1 = scanner.nextDouble();

        System.out.print("Digite a nota da E2: ");
        double e2 = scanner.nextDouble();

        System.out.print("Digite a nota da API: ");
        double api = scanner.nextDouble();

        System.out.print("Digite a nota da X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite a nota da SUB: ");
        double sub = scanner.nextDouble();

        double mediaParcial = p1 * 0.6 + ((e1 + e2) / 2) * 0.4;
        double ajuste = Math.max(mediaParcial - 5.9, 0) / (mediaParcial - 5.9);

        if (Double.isNaN(ajuste)){
            ajuste = 0;
        }

        double media = (mediaParcial * 0.5) + (ajuste * api * 0.5) + x + (sub * 0.3);

        // Garante que a média esteja entre 0 e 10
        media = Math.max(0, Math.min(10, media));

        System.out.printf("A média de LP1 é: %.2f%n", media);

        scanner.close();
    }
}
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pedir para o usuário digitar o número de horas trabalhadas no mês
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadasMes = input.nextInt();

        // Pedir para o usuário digitar o salário por hora
        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = input.nextDouble();

        // Calcular o número de horas extras
        int horasExtras = 0;
        if (horasTrabalhadasMes > 160) { // 40 horas por semana * 4 semanas
            horasExtras = horasTrabalhadasMes - 160;
        }

        // Calcular o salário das horas normais
        double salarioNormal = 160 * salarioPorHora;

        // Calcular o salário das horas extras
        double salarioExtra = horasExtras * (salarioPorHora * 1.5); // 50% de acréscimo

        // Calcular o salário total
        double salarioTotal = salarioNormal + salarioExtra;

        // Mostrar o salário total para o usuário
        System.out.println("O salário total do funcionário é: R$" + salarioTotal);

    }
}
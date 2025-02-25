import java.util.Scanner;



public class Exercicio1 {

    public static void main(String[] args) {

        Scanner inputUsuario = new Scanner(System.in);


        // Leitura da idade em anos, meses e dias
        System.out.println("Digite a quantidade de anos: ");
        int anos = inputUsuario.nextInt();
        System.out.println("Digite a quantidade de meses: ");
        int meses = inputUsuario.nextInt();
        System.out.println("Digite a quantidade de dias: ");
        int dias = inputUsuario.nextInt();

        // Calculo da idade em dias
        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        // Exibição da idade em dias
        System.out.println("A idade em dias é: " + idadeEmDias);
    }
}

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Hora de início do jogo: ");
        int horaInicio = leitor.nextInt();

        System.out.print("Hora de fim do jogo: ");
        int horaFim = leitor.nextInt();

        int duracao = 0;

        if (horaInicio < horaFim) {
            // Se a hora de fim for maior que a hora de início, o jogo terminou no mesmo dia
            duracao = horaFim - horaInicio;
        } else {
            // Se a hora de fim for menor ou igual à hora de início, o jogo terminou no dia seguinte
            duracao = (24 - horaInicio) + horaFim;
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas.");

    }
}
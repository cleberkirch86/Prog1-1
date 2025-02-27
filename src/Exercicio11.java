import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        //  criar um leitor para pegar os números que a pessoa digitar
        Scanner leitor = new Scanner(System.in);

        // Guardar o ano atual em uma variavel pra poder fazer a conta

        int anoAtual = 2025;

        // perguntar o ano de nascimento e guardar na variável "anoNascimento"
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = leitor.nextInt();

        // calcular a idade da pessoa
        int idade = anoAtual - anoNascimento;

        // ver se a pessoa pode votar
        if (idade >= 16) {
            // Se a idade for 16 ou mais, a pessoa pode votar!
            System.out.println("Você pode votar este ano!");
        } else {
            // Se não, a pessoa ainda não pode votar
            System.out.println("Você ainda não pode votar este ano.");
        }


    }
}
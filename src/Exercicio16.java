public class Exercicio16 {

    public static void main(String[] args) {

        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int total = janeiro + fevereiro + marco;

        System.out.println("Gasto total no trimestre: R$" + total);

        double media = total / 3.0;

        String mediaFormatada = String.format("Média mensal de gastos: R$%.2f", media);

        System.out.println(mediaFormatada);
    }
}
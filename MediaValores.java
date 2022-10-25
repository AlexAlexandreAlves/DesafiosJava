import java.util.Scanner;

public class MediaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade a ser inserida?");
        int tamArray = sc.nextInt();

        double[] listaNumeros = new double[tamArray];

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º numero");
            listaNumeros[i] = sc.nextInt();
        }

        double maiorNumero = MaiorNumero(listaNumeros);
        double media = Media(listaNumeros);

        System.out.println("O maior numero da lista é: " + maiorNumero);
        System.out.println("A media dos numeros da lista é: " + media);

        sc.close();
    }

    public static double Media(double[] listaNumeros) {

        double soma = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            soma = soma + listaNumeros[i];
        }

        return soma / listaNumeros.length;
    }

    public static double MaiorNumero(double[] listaNumeros) {

        double maiorNumero = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            if (i == 0) {
                maiorNumero = listaNumeros[i];
            }

            if (listaNumeros[i] > maiorNumero) {
                maiorNumero = listaNumeros[i];
            }
        }

        return maiorNumero;
    }
}

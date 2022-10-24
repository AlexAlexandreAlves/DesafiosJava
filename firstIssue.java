import java.util.Scanner;

/**
 * first-issue
 */
public class firstIssue {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = 0;
        double valorDois;

        System.out.println("Insira o dividendo: ");
        double valorUm = sc.nextDouble();
        double resultado = 0;

        do {
            System.out.println("Insira o divisor: ");
            valorDois = sc.nextDouble();
            if (valorDois == 0) {
                System.out.println("O divisor não pode ser 0. Tente novamente!");
            } else {
                x = 1;
                resultado = valorUm / valorDois;
                System.out.println("O resultado é: " + resultado);
            }
        } while (x == 0);

        sc.close();
    }

}
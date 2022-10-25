import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os lados do triângulo:");
        double ladoA = sc.nextDouble();
        double ladoB = sc.nextDouble();
        double ladoC = sc.nextDouble();

        VerificaTriangulo(ladoA, ladoB, ladoC);

        sc.close();
    }

    public static void VerificaTriangulo(double a, double b, double c) {
        if ((a < (b + c)) && (b < (a + c)) && (c < (b + a))) {
            System.out.println("É um triângulo!");
        }
    }
}

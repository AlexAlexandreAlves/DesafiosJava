import java.util.Scanner;

public class VerificaNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pessoas = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o nome da " + (i + 1) + " pessoa: ");
            pessoas[i] = sc.next();
        }

        System.out.println("Insira um nome para consultar:");
        String nomeConsulta = sc.next();

        VerificaPessoa(pessoas, nomeConsulta);

        sc.close();
    }  
    
    public static void VerificaPessoa(String[] pessoas, String nomeVerificar) {
        for (String pessoa : pessoas) {
            if (pessoa.contains(nomeVerificar)) {
                System.out.println("A pessoa existe na listagem!");
            }
        }
    }
}

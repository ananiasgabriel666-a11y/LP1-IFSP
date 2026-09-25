import java.util.Scanner;

public class FichaCadastro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome:");
        String nome = teclado.nextLine();
        System.out.print("Idade:");
        int idade = teclado.nextInt();
        System.out.print("Altura:");
        double altura = teclado.nextDouble();
        System.out.printf("Nome: %s, Idade: %d, Altura: %.2fn");

    }
}
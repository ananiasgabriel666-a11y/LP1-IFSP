import java.util.*;

public class MediaNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota:");
        int n1 = teclado.nextInt();

        System.out.print("Digite a segunda nota:");
        int n2 = teclado.nextInt();

        System.out.print("Digite a terceira nota:");
        int n3 = teclado.nextInt();

        double media = (n1 + n2 + n3) / 3.0;
        System.out.printf("Média: %.2f", media);
    }
}
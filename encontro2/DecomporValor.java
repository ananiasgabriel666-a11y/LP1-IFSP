import java.util.*;

public class DecomporValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número de três digitos: ");
        int numero = teclado.nextInt();
        int unidade = numero % 10;
        int dezena = (numero / 10) % 10;
        int centena = numero / 100;

        System.out.printf("Centena: %d, Dezena: %d, Unidade: %d%n", centena, dezena, unidade);
    }
}
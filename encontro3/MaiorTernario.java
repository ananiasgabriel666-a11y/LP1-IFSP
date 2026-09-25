importjava.util.*;

public class Maior {
    public static voidmain(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um inteiro:");
        int n1 = teclado.nextInt();
        System.out.print("Digite um inteiro:");
        int n2 = teclado.nextInt();

        String resultado = (n1 >= n2) ? "Maior": "Menor";
        System.out.print (resultado);
    }
}
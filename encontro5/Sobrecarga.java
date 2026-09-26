import java.util.Scanner;

public class Sobrecarga {

    public static double media(double a, double b) {
        return (a + b) / 2.0;
    }

    public static double media(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static double media(double a, double b, double c, double d){
        return (a + b + c + d) / 4.0;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("============Você pode fazer media de 2 valores, 3 valores e 4 valores.==========\n");

        System.out.print("Digite o primeiro valor:");
        double n1 = teclado.nextDouble();
        System.out.print("Digite o segundo valor:");
        double n2 = teclado.nextDouble();

        double valor = media(n1, n2);
        System.out.println("A media de 2 é:" + valor);

        System.out.println("================================================================================");


        System.out.print("Digite o primeiro valor:");
        n1 = teclado.nextDouble();
        System.out.print("Digite o segundo valor:");
        n2 = teclado.nextDouble();
        System.out.print("Digite o terceiro valor:");
        double n3 = teclado.nextDouble();

        valor = media(n1, n2, n3);
        System.out.println("A media de 3 é:" + valor);

        System.out.println("================================================================================");

        System.out.print("Digite o primeiro valor:");
        n1 = teclado.nextDouble();
        System.out.print("Digite o segundo valor:");
        n2 = teclado.nextDouble();
        System.out.print("Digite o terceiro valor:");
        n3 = teclado.nextDouble();
        System.out.print("Digite o quarto valor:");
        double n4 = teclado.nextDouble();

        valor = media(n1, n2, n3, n4);
        System.out.println("A media de 4 é:" + valor);
        
        System.out.println("================================================================================");
    }
}
import java.util.*;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius:");
        double celsius = teclado.nextDouble();

        double fahrenheit = celsius * (9.0/ 5.0) + 32;

        System.out.printf("temperatura em Fahrenheit: %2fºF%n", fahrenheit);
    }
}
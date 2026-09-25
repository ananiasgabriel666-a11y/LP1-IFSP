import java.util.*;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Converta seus segundos:");
        int totalSegundos = teclado.nextInt();

        int horas = totalSegundos / 3600;
        int segundosRestantes = totalSegundos % 3600;
        int minutos = segundosRestantes / 60;
        int segundos = segundosRestantes % 60;

        System.out.printf("%d segundo(s) equivale a: %dh %dm %ds%n", totalSegundos, horas, minutos, segundos);
    }
}
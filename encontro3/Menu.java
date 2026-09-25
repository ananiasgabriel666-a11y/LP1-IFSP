import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Primeiro número:");
        double num1 = teclado.nextInt();
        System.out.println("Segundo número:");
        double num2 = teclado.nextInt();

        System.out.println("Escolha a operação:");
        System.out.println("1 Somar\n");
        System.out.println("2 Subtrair\n");
        System.out.println("3 Multiplicar\n");
        System.out.println("4 Dividir\n");
        int opcao = teclado.nextInt();

        double resultado ;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("Resultado: %.2f\n", resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("Resultado: %.2f\n", resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("Resultado: %.2f\n", resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.printf("Erro: Divisão por zero não é permitido!");
                } else {
                    resultado = num1 / num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                }
                break;
            default:
                System.out.printf("Opção invalida! Escolha um numero entre 1 e 4.");
        }

    }
}
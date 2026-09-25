importjava.util.*;

public class DiaMes {
    public static voidmain(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o ano para consultar:");
        int ano = teclado.nextInt();

        boolean bissexto;

        bissexto = (ano % 4== 0) && (!(ano % 100== 0) || (ano % 400== 0));

        System.out.println("Digite o mês para consultar");
        int mes = teclado.nextInt();
        int dias = switch(mes) {
            case 1, 3, 5, 7, 8, 10, 12-> 31;
            case 4, 6, 9, 11-> 30;
            case 2-> bissexto ? 29: 28;
            default-> 0;
        };
        System.out.printf("Dias do mês %d", dias);
    }
}
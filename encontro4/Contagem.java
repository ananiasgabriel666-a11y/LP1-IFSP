import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ordem Crescente:\n");

        // cona os numero na ordem crescente 
        for (int i = 1; i <= 50; i++) {

            // formata em quatro espaços de largura
            System.out.printf("%4d", i);

            // verifica se já foram impressos 10 numeros
            if ( i % 10 == 0 ) {
                System.out.println();
            };
        }
        System.out.println("Ordem Descrescente:\n");
        // conta quantos numero ja foram umpressos na linha
        int contador = 0;
        // laço em ordem decrescente
        for (int i = 50; i >= 1; i--) {

            System.out.printf("%4d", i);
            contador++;

            // verifica se atingiu a marca de 10 numeros na linha
            if ( contador % 10 == 0 ) {
                System.out.println();
                contador = 0;
            };
        }
    }
}
/*Contagem. Exiba os númerosde 1 a 50, dez por linha. Depois exiba de 50 a 1,
 em ordem decrescente*/
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // laço externo controla a linha da tabuada
        for (int linha = 1; linha <= 10; linha++) {
            // laço interno controla a coluna da tabuada
            for (int coluna = 1; coluna <= 10; coluna++) {
                // multiplica linha e coluna e imprime com 4 espaços de largura
                System.out.printf("%d x %d = %4d", linha, coluna, linha * coluna);
            }
            //quebra da linha só depois que todas as colunas dessa linha foram impressas
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class ValidacaoReutilizavel {

    //método usado anteriomente para validar nota
    public static boolean notaValida(double nota) {
        return nota >= 0 && nota <= 10; // verifica se a nota esta dentro da faixa
    }
    
    // novo método para repetir a solicitação
    public static double lerNotaValida( Scanner teclado) {
        double nota = 0;
        do {
            System.out.print("Digite uma nota entre 0 e 10:");
            nota = teclado.nextDouble();
        } while (!notaValida(nota)); // roda o laço enquanto a nota não for valida
        return nota;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        lerNotaValida(teclado); // chama o método para a nota digitada
    }
}
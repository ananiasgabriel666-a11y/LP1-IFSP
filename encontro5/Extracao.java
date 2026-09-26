import java.util.Scanner;

public class Extracao {

    // Verifica se a nota está dentro da faixa permitida (0 a 10)
    public static boolean notaValida(double nota) {
        return nota >= 0 && nota <= 10;
    }

    // Verifica se uma nota é suficiente para aprovação (>= 6.0)
    public static boolean foiAprovado(double nota) {
        return nota >= 6.0;
    }

    // Calcula a média da turma a partir da soma das notas e da quantidade de notas válidas
    public static double calcularMediaTurma(double soma, int quantidade) {
        return (quantidade > 0) ? soma / quantidade : 0.0; // evita divisão por zero
        /* O código acima é equivalente ao de baixo:
        if (quantidade > 0) {
            return soma / quantidade;
        }

        return 0; */
    }

    // Exibe o resultado final: a média da turma e a quantidade de aprovados
    public static void exibirResultado(double media, int aprovado) {
        System.out.printf("Média é: %.2f\n", media);
        System.out.printf("Quantidade de Aprovados: %d\n", aprovado);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a nota:");
        double nota = teclado.nextDouble();

        double soma = 0;      // acumulador da soma das notas válidas
        int quantidade = 0;   // contador de notas válidas
        int aprovado = 0;     // contador de aprovados

        while (nota != -1) {
            // usa o método notaValida no lugar do if direto
            if (notaValida(nota)) {
                soma += nota;
                quantidade++;

                // usa o método foiAprovado no lugar do if direto
                if (foiAprovado(nota)) {
                    aprovado++;
                }
            }
            // lê a próxima nota no final do laço
            System.out.print("Digite a nota:");
            nota = teclado.nextDouble();
        }

        // cálculo e a exibição para os métodos extraídos
        double media = calcularMediaTurma(soma, quantidade);
        exibirResultado(media, aprovado);
    }
}
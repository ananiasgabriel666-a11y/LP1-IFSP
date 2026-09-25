importjava.util.*;

public class Aluno {
    public static voidmain(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite Nota 1:");
        int n1 = teclado.nextInt();
        System.out.print("Digite Nota 2:");
        int n2 = teclado.nextInt();

        System.out.print("Frequência:");
        double fre = teclado.nextDouble();

        double nota = (n1 + n2) / 2.0;
        System.out.printf("Media: %.2f", nota);

        if(nota >= 6.0) {
            System.out.print("\n Aprovado");
        } else{
            System.out.print("\n Reprovado por nota");
        }

        if(fre >= 75) {
            System.out.print("\n Aprovado");
        } else{
            System.out.print("\n Reprovado por Frequência");
        }
    }
}
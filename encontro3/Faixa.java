importjava.util.*;

public class Faixa {
    public static voidmain(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a média:");
        double media = teclado.nextDouble();

        if(media >= 9.0) {
            System.out.println("Conceito A");
        } else if(media >= 7.0) {
            System.out.println("Conceito B");
        } else if(media >= 6.0) {
            System.out.println("Conceito C");
        } else{
            System.out.println("Conceito D - reprovado");
        }
    }
}
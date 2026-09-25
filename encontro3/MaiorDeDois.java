importjava.util.*;

public Class MaiorDeDois {
    public static voidmain(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um inteiro:");
        int n1 = teclado.nextInt();
        System.out.print("Digite um inteiro:");
        int n2 = teclado.nextInt();

        if(n1 >= n2 ) {
            System.out.print("Maior");
        } else if(n1 == n2) {
            System.out.print("Os dois são iguais");
        } else{
            System.out.print("Menor");
        }
    }
}
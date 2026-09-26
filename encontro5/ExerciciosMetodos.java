import java.util.Scanner;

public class ExerciciosMetodos {

    //entam os metodos
    public static double calcularMedia(double n1, double n2) {
        double media = (n1 + n2) / 2.0;   //calcula a media somando os valores e dividindo por 2
        return media;                     // retorna o valor da media.
    }
    public static int maiorDeTres( int a, int b, int c) {
        int maior = a;          // começa assumindp que o primeiro é o maior
        if (b > maior) {        // se o segundo for maior, atualiza o maior
            maior = b;          //atualiza o maior
        }
        if (c > maior) {       // repete o ciclo
            maior = c;
        }
        return maior;          // devolve o maior valor
    }
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;   // pega o numero e divide, se o resultado for 0 é Par, se for 1 é impar.
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // testes dos metodos
        //priemiro método CAlcular Média
        System.out.print("===========Digiste os numero para saber a Média.===========\n");
        System.out.println("Digite o Primeiro Número:");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite o Segundo Número:");
        double nota2 = teclado.nextDouble();

        double media = calcularMedia(nota1, nota2);       // daclara uma variavel para executar o método.
        System.out.println("A media é:" + media);         // exibe o valor da variavel declarada anteriormente.
        System.out.print("====================================================================\n");


        //Segundo Método Maior de 3
        System.out.printf("==========Digite os 3 valores para comparar.==========\n");
        System.out.println("Digite o Primeiro numero:");
        int numero1 = teclado.nextInt();
        System.out.println("Digite o Segundo numero:");
        int numero2 = teclado.nextInt();
        System.out.println("Digite o Terceiro numero:");
        int numero3 = teclado.nextInt();

        int maior = maiorDeTres(numero1, numero2, numero3); //declara uma variavel para executar o metodo
        System.out.println("O Maior numero é:"+ maior);     // exibe o valor da variavel declarada anteriormente.
        System.out.print("====================================================================\n");


        //Terceiro Método é Par?
        System.out.println("=====Digite um numero para saber se é Impar ou Par:=====");
        int valor = teclado.nextInt();

        boolean numero = ehPar(valor);  // é declarada uma variavel "global" para ser usada dentro do laço ja executando o medtodo
        if(numero) {
            System.out.printf("O número é Par.\n", numero);    // devolver o valor se for par
        } else{
            System.out.printf("O número é.\n", numero); // devolve o valor se for impar
        }
        System.out.print("====================================================================\n");

        teclado.close();
    }
}
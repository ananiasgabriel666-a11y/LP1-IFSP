importjava.util.Scanner;

public classSoma {
    public static voidmain(String[] args) {
        Scanner teclado = newScanner(System.in);

        System.out.print("Digite  os 10 números:");
        int numero = teclado.nextInt();
        int maior = numero;
        int menor = numero;
        int soma = numero;

        // laço de repetição para ler os numeros restantes do 2º ao 10º
        for(int i = 1; i <= 9; i++) {
            numero = teclado.nextInt();
            // acumula o valor na soma total
            soma += numero;
            
            // verifica se o numero atual é maior até agora
            if(numero > maior) {
                maior = numero;
        }
        // verifica se o numero atual é o menor aé agora
            if(numero < menor) {
                menor = numero;
            }
        }
        // calcula a media dividindo para garantir o ponto flutuante
        double media = soma / 10.0;
        System.out.printf("Soma igua á:%d\n", soma);
        System.out.printf("Média é igual á:%.2f\n", media);
        System.out.printf("Maior e Menor são:%d e %d\n", maior, menor);
    }
}
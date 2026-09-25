importjava.util.Scanner;

public classNumeroPrimo {
    public static voidmain(String[] args) {
        Scanner teclado = newScanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = teclado.nextInt();

        // Variável sinalizadora assume que o numero é primo
        boolean ehPrimo = true;

        // Números menores ou iguais a 1 não são primos
        if(numero <= 1) {
            ehPrimo = false;
        } else{
            // Laço testando divisores de 2 até (numero - 1)
            for(inti = 2; i < numero; i++) {

                // Se o resto da divisão for 0, encontramos um divisor
                if(numero % i == 0) {
                    ehPrimo = false; // Altera a flag para indicar que não é primo
                    break;           // Interrompe o laço imediatamente 
                    }
            }
        }

        // mostra o resultado com base na variável 
        if(ehPrimo) {
            System.out.printf("O número %d é PRIMO.\n", numero);
        } else{
            System.out.printf("O número %d NÃO é primo.\n", numero);
        }
    }
}
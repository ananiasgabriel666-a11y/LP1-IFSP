importjava.util.*;

public classMenuCompleto {
    public static voidmain(String[] args) {
        Scanner teclado = newScanner(System.in);
        int opcao;

        // repete até o ususario digitar 0 (Encerrar)
        do{
            System.out.println("Primeiro número:");
            doublenum1 = teclado.nextInt();
            System.out.println("Segundo número:");
            doublenum2 = teclado.nextInt();

            System.out.println("Escolha a operação:");
            System.out.println("1 Somar\n");
            System.out.println("2 Subtrair\n");
            System.out.println("3 Multiplicar\n");
            System.out.println("4 Dividir\n");
            System.out.println("0 Encerrar!\n");
            // lê a opção do menu
            opcao = teclado.nextInt();

            double resultado;

            // valida a opção selecionada pelo ususario
            switch(opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;
                case 4:
                    if(num2 == 0) {
                        System.out.printf("Erro: Divisão por zero não é permitido!");
                    } else{
                        resultado = num1 / num2;
                        System.out.printf("Resultado: %.2f\n", resultado);
                    }
                    break;
                case 0:
                    System.out.printf("Encerrar!");
                    break;
                default:
                    System.out.printf("Opção invalida! Escolha um numero entre 1 e 0.");
            }
            // repete enquanto a opção não for igua a 0 
        } while(opcao != 0);

    }
}
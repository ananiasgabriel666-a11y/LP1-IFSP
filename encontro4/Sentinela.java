importjava.util.Scanner;

public classSentinela {
    public static voidmain(String[] args) {
        Scanner teclado = newScanner(System.in);

        // leitura de prevenção, lê um nota para testar a condição
        System.out.print("Digite a nota:");
        double nota = teclado.nextDouble();

        double soma = 0;    // acumulador, soma todas as notas validas
        int quantidade = 0; // contador, quantas notass validaas foram digitadas
        int aprovado = 0;   // contador, quantas notas foram >= 6.0        
        // sentinela pedindo um valor de parada
        while(nota != -1) {
            // processa a nota se ela estiver numa faixa valida
            if(nota >= 0 && nota <= 10) {
                soma += nota;
                quantidade++;

                if(nota >= 6.0)
                    aprovado++;
            }             
           //lê a proxima nota no final do laço
            System.out.print("Digite a nota:");
            nota = teclado.nextDouble();
        }
        // operador ternario evita divisão por zero se nenhuma nota valida for digitada
        double media = (quantidade > 0) ? soma / quantidade : 0.0;
        System.out.printf("Média é: %.2f\n", media);
        System.out.printf("Quantidade de Aprovados:%d", aprovado);
    }
}
importjava.util.*;

public classLer Idade {
    public static voidmain(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma Idade entre 15 e 80 anos:");
        int idade = teclado.nextInt();
        System.out.println("Digite uma nota:");
        int nota = teclado.nextInt();

        if(idade >= 15 && idade <= 80) {
            System.out.printf("Idade valida\n");
        } else{
            System.out.printf("Idade fora da faixa!\n");
        }
        if(nota >= 0 && nota <= 10) {
            System.out.printf("Nota Valida\n");
        } else{
            System.out.printf("Nota invalida\n");
        }

        System.out.printf("Escolha o turno dentre as opções:\n");
        System.out.printf("M\n");
        System.out.printf("V\n");
        System.out.printf("N\n");
        String opcao = teclado.next();

        switch(opcao) {
            case"M":
                System.out.println("Turno Matutino");
            break;
            case"V":
                System.out.println("Turno Vespertino");
                break;
            case"N":
                System.out.println("Turno Noturno");
                break;
            default:
                System.out.println("Opção invalida!");
        }

    }
}
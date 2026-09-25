import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        // contador de tentativas do usuario
        int tentativa = 0;
        int idade ;
        boolean naoValido;

        // laço que garante que o cógigo execute ao menos uma vez
        do{
            System . out. print ( " Digite uma idade (0 a 120) : ") ;
            idade = teclado . nextInt() ;

            // valida se a idade esta na faixa
            naoValido = idade < 0 || idade > 120;
            // incrementa a quantidade de tentativas
            tentativa++;
            
            // aparece se o numero difitado for invalido
            if( naoValido ) {
                System . out. println ( " Valor invalido . Tente novamente . ") ;
            }
        } while( naoValido) ;
        
        // imrime a quantidade total de tentativas
        System.out.printf("Foram necessarias: %d Tentativas", tentativa);
    }
}
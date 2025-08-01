import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in );

        System.out.println("Informe o ano de nascimento: ");
        int ano = sc.nextInt();
        int idade = 2025 - ano;

        if ( ( idade >= 16 && idade < 18 ) || ( idade <= 70 ) ){ 
            System.out.println("Voto Opcional");
        } else {
            System.out.println("Voto Obrigatório");
        }

        sc.close();
    }
}

        // String nome1 = "fulano";
        // String nome2 = "fulano";
        // String nome3 = new String( "ciclano"); 
        // String teste = ( nome1.equals( nome3 ) ) ? " parecido " : " diferente ";
        // System.out.println( teste );

        // int num1 = 5;
        // int num2 = 10;
        // int soma = ( num1 > num2 ) ? ( num1 + num2 ) : ( num1 - num2 ) ;
        // System.out.println( soma );
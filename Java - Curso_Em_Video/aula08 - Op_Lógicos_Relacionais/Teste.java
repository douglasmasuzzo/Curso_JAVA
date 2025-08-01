
import java.util.Scanner;
import java.lang.Math;

public class Teste{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("Escolha um número de 0 - 10: ");
        int number = sc.nextInt();
        int aleatorio = ( int ) ( Math.random() * 11 );

        if ( number == aleatorio ){
            System.out.println("Acertou");
        } else {
            System.out.println("Errou. Tente Novamente.");
        }

        sc.close();
    }
}
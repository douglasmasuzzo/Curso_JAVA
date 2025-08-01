import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in );

        System.out.println("Informe o valor de A: ");
        int A = sc.nextInt();
        System.out.println("Informe o valor de B: ");
        int B = sc.nextInt();
        System.out.println("Informe o valor de C: ");
        int C = sc.nextInt();

        int delta = ( B * B ) - 4 * A * C ;
        int x1 = 0, x2 = 0;
        String sit = null;

        if ( delta > 0 ) {
            x1 = ( int )(( -B + Math.sqrt( delta ) ) / ( 2 * A ));
            x2 = ( int )(( -B - Math.sqrt( delta ) ) / ( 2 * A ));
        } else if ( delta == 0 ){
            x1 = (int)( ( -B ) / ( 2.0 * A ) );
        } else {
            System.out.print("A equação não possui raízes! ");
        }

        if ( delta >=0 ) {
            System.out.println("VALOR DA 1ª RAÍZ: " + x1 );
            if ( delta > 0 ) {
                System.out.println("VALOR DA 2ª RAÍZ: " + x2 );
            }
        } else {
            System.out.println( sit );
        }

        System.out.println("----------------------------");
        System.out.println("Equação do 2º Grau: ");
        System.out.print("VALOR DE A: " + A + " | VALOR DE B: " + B + " | VALOR DE C: " + C + "\n");
        System.out.println("DELTA 🔼: " + delta );
        System.out.println("VALOR DA 1ª RAÍZ: " + x1 );
        System.out.println("VALOR DA 2ª RAÍZ: " + x2 );

        sc.close();
    }
}
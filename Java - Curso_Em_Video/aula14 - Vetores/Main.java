import java.util.Arrays;
public class Main {
    public static void main(String[] args){

        int number[] = new int[ 5 ];
        Arrays.fill( number, 10 );
        // preenche os índices com o mesmo valor;

        for ( int valor: number ){
            System.out.println( valor + " * 5 " + ( valor * 5 ));
        }

        // int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // for ( int cont = 0; cont < number.length; cont++ ){
        //     System.out.println( cont + "º ÍNDICE: " + number[  cont ] );
        // }


        // ( LEITURA DE MÊS E NÚMERO COM FOR );
        //  String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", 
        //               "Ago", "Set", "Oct", "Nov", "Dec"};
        // int num_Mes[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    
        // for ( int cont = 0; cont < mes.length; cont++ ){
        //     System.out.println("MÊS: " + mes[ cont ] + "( " + num_Mes[ cont ] + "º" + " )");
        // }
    }
}

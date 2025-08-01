public class Main{
    public static void main(String[] args){

        int fator = 0;
        int cont = 1;

        while ( fator < 12 ){
            ++ fator;
            cont *= fator;
            System.out.println('!' + fator + " = " + cont );
        }
        
        // int cont = 0;
        // while ( cont < 10 ){
        //     cont++;

        //     if ( cont % 2 == 0 ){ // ( cont == 5 )
        //         continue; // ( break )
        //     } else {
        //         System.out.println( cont );
        //     }
        // }
    }
}
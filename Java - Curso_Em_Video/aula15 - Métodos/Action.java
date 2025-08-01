public class Action{
    public static String Controlador( int i , int num ){
        String contagem = ""; // CONTAGEM DOS VALORES
        for ( int cont = i; cont <= num ; cont++ ){
            contagem += cont + "";
        }
        return contagem;

    }
}
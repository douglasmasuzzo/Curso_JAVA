// MAIN -> FATORIAL 
public class Principal {
    public static void main(String[] args){
        Fatorial fat = new Fatorial();
        fat.setValor( 5 );
        System.out.print( fat.getFormula() );
        System.out.print( fat.getFatorial() );
    }
}

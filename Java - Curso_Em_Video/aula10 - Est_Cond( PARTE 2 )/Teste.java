public class Teste{
    public static void main(String[] args){
        Triangulo forma = new Triangulo( 3, 3, 5 );

        forma.calcularTriangulo();

        System.out.println("------------------------------");
        System.out.println("VALOR X: " + forma.getValorX() );
        System.out.println("VALOR Y: " + forma.getValorY() );
        System.out.println("VALOR Z: " + forma.getValorZ() );
        System.out.println("SOMA: " + forma.getSoma() );
        System.out.println("SITUAÇÃO: " + forma.getSit() );
    }
}
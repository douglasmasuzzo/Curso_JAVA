import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in );

        System.out.println("Informe um valor: ");
        int number = sc.nextInt();

        System.out.println("----------------------------------");
        System.out.println("Resto da divisão: " + ( number % 2 ));
        System.out.println("Elevado ao Cubo: " +  (int) Math.pow( number, 2 ));
        System.out.println("Raiz Quadrada: " + Math.sqrt( number ));
        System.out.println("Raíz Cúbica: " + Math.cbrt( number ));
        System.out.println("Valor Absoluto: " + Math.abs( number ));
        sc.close();
    }
}
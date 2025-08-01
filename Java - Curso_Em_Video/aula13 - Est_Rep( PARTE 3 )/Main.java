import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor inicial (cont): ");
        int cont = sc.nextInt();

        System.out.print("Valor final (iteracao): ");
        int iteracao = sc.nextInt();

        System.out.print("Passo: ");
        int passo = sc.nextInt();

        System.out.print("Operação (+, -, *, /): ");
        String operacao = sc.next();

        int i = cont;

        while (true) {
            System.out.println("Valor atual: " + i);

            switch (operacao) {
                case "+":
                    i += passo;
                    break;
                case "-":
                    i -= passo;
                    break;
                case "*":
                    i *= passo;
                    break;
                case "/":
                    if (passo == 0) {
                        System.out.println("Divisão por zero não permitida.");
                        return;
                    }
                    i /= passo;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;
            }

            if ((operacao.equals("+") || operacao.equals("*")) && i > iteracao) break;
            if ((operacao.equals("-") || operacao.equals("/")) && i < iteracao) break;
        }

        sc.close();
    }
}

// public class Main{
//   public static void main(String[] args){
//     for ( int i = 0; i <= 5; i++ ){
//       for ( int j = 0; j <= 2; j++ ){
//         System.out.print( i );
//         System.out.println( j );
//       }
//     }
//   }
// }
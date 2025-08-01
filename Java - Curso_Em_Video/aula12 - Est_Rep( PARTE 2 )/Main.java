import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){

        int number;
        int quant = 0;
        int soma = 0;
        int par = 0;
        int imp = 0;

        do {
            number = Integer.parseInt( JOptionPane.showInputDialog( null, "Escolha um número: " ));

            if ( number % 2 == 0){ par++;
            } else { imp++;
            }
            quant++;
            soma += number;

        } while ( number != 0 );

        JOptionPane.showMessageDialog( null, "<html>---------------------------------------------" +
                "<br>QUANTIDADE DE NÚMEROS: <br>" + quant +
                "<br>NÚMEROS PARES: " + par +
                "<br>NÚMEROS ÍMPARES: " + imp +
                "<br>SOMA DOS VALORES: " + soma + "</html>");
    }
}
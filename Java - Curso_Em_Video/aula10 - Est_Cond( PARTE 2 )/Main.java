import java.util.Scanner;
public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner ( System.in );
      
    System.out.println("Escolha um número entre ( 1 - 7 ) : ");
    int num  = sc.nextInt();
    String dia_semana = "";
    
    if ( num > 0 || num <= 7 ) {
      
      switch ( num ) {
        case 1:
          dia_semana = "Hoje é: Domingo ";
          break;
          
        case 2:
          dia_semana = "Hoje é: Segunda ";
          break;
          
        case 3: 
          dia_semana = "Hoje é: Terça ";
          break;
          
        case 4:
          dia_semana = "Hoje é: Quarta ";
          break;
          
        case 5:   
          dia_semana = "Hoje é: Quinta ";
          break;
          
        case 6: 
          dia_semana = "Hoje é: Sexta ";
          break;
          
        case 7:
          dia_semana = "Hoje é: Sábado ";
          break;
          
        default:
          System.out.print("Dia da semana não informado.");
          break;
      }
      
    } else {
      System.out.print("Informe o valor novamente. ");
    }
    
    System.out.println( dia_semana );
    sc.close();
  }
}
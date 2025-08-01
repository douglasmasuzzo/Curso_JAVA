/*
 Referência em Vídeo - Estruturas Condicionais ( PARTE 2 ) 
 canal: Curso em Vídeo ( SITE ) - EP00 ( Playlist: Introdução a Java )
 https://youtu.be/oNSrBld06qs
 
    // COMENTÁRIO //

 A aula anterior apresentou o concceito das estruturas de controle, ao introduzir os modelos de estruturas condicionais
 simples e compostas, representadas pela estruturas " IF / ELSE ". Prosseguindo com a ideia, esta aula buscar ampliar a
 metodologia ensinada, incluindo novo conceitos sobre o tema abordado, incorporando o encadeamento de condições e de 
 múltiplas escolhas para a resolução de problemas.
 
 Analisando um exemplo prático do conteúdo, obtemos o seguinte código:

   -> Main{}
   -> psvm{}
    -sys.out(" escolha um número entre ( 1 - 7 ): ");
    - int num = sc.nextInt();
    - Str dia_semana = "";
   -> if ( num > 0 && num <= 7 ){}
    -> switch ( num ) {}
    -> dia_semana = "Domingo";
    -> dia_semana = "Segunda";
    -> dia_semana = "Terça";
    -> dia_semana = "Quarta";
    -> dia_semana = "Quinta";
    -> dia_semana = "Sexta";
    -> dia_semana = "Sábado";
    -> default
   -> sysout ( dia_semana );
*/

/*
 Referência em Vídeo - EXERCÍCIOS
 canal: Curso em Vídeo ( SITE ) - EP01 ( Playlist: Introdução a Java )
 https://youtu.be/d-2E7c2Kfcc
 
   // EXERCÍCIOS //

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
  }
 }
 * 
 * 
 * 
*/
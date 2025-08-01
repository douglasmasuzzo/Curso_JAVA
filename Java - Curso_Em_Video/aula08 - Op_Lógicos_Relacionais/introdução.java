/*
 Referência em Vídeo - Operadores Lógicos e Relacionais
 canal: Curso em Vídeo ( SITE ) - EP00 ( Playlist: Introdução a Java )
 https://youtu.be/xHgnlic7fj8

   // COMENTÁRIOS // 

 Prosseguindo com os conceitos de Operadores, esta aula dá continuidade ao conteúdo citado anteriormente: os Operadores Lógicos e Relacionais.
 Os operadores servem com base para a aplicabilidade de programas e softwraes, incorporando conceitos básicos de operações aritméticas durante 
 a execução de específicas funções. Exxplorando mais sobre os diferentes tipos de operadores, estes operadores são essênciais para ilustrar possíveis 
 cenários que necessitam de habilidades técnicas.
 
 Antes de prosseguir, podemos analisar a metodologia desses operadores e suas funcionalidades, 
 compreendendo como os operadores executam o processo lógico e racional utiliznado conceitos
 Lógicos, Relacionais e Ternário.

    -> maior = num1 > num2 ? num1 : num2;
     - primeior operador: interrogação
     - segundo operador: valor atribuido ( true ) 
     - terceiro operador: valor atribuído ( false )
 
    -> Operadores Relacionais
     - ( > ) = maior que
     - ( < ) = menor que 
     - ( >= ) = maior ou igual que
     - ( <= ) = menor ou igual que
     - ( = ) = atribuição
     - ( == ) = igualdade
     - ( != ) = diferença 
     
    -> Operadores Lógicos 
     - && ( true && true // false && false )
     - || ( true || false  // false || true )     
     - ^ ( true ^ true // false ^ false )
     - ! ( !false // !true )

    -> Tabela Verdade
     - && ( true && true )
     - || ( false || true )
     - ^ ( true ^ false // false ^ true )
     - ! ( !true // !false )
    -> Operadores Lógicos 
     - && ( true && true // false && false )
     - || ( true || false  // false || true )     
     - ^ ( true ^ true // false ^ false )
     - ! ( !false // !true )

    -> Tabela Verdade
     - && ( true && true )
     - || ( false || true )
     - ^ ( true ^ false // false ^ true )
     - ! ( !true // !false )
    -> Operadores Lógicos 
     - && ( true && true // false && false )
     - || ( true || false  // false || true )
     - ^ ( true ^ true // false ^ false )
     - ! ( !false // !true )

    -> Tabela Verdade
     - && ( true && true )
     - || ( false || true )
     - ^ ( true ^ false // false ^ true )
     - ! ( !true // !false )
*/

/*
 Referência em Vídeo - EXERCÍCIOS
 canal: Curso em Vídeo ( SITE ) - EP01 ( Plyalist: Introdução a Java )
 https://youtu.be/LNECh9RplE0

   // EXERCÍCIOS //

   
 import java.util.Scanner;
 import java.lang.Math;

 public class Teste{
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

        System.out.println("Escolha um número de 0 - 10: ");
        int number = sc.nextInt();
        int aleatorio = ( int ) ( Math.random() * 11 );

        if ( number == aleatorio ) {
            System.out.println("Acertou");
        } else {
            System.out.println("Errou. Tente Novamente.");
        }

        sc.close();
    }
 }
*/
/*
 Referência em Vídeo - Estruturas Condicionais ( PARTE 1 ) 
 canal: Curso em Vídeo ( SITE ) - EP00 ( Playlist: Introdução a Java )
 https://youtu.be/wW3eve4vTMc
 
   // COMENTÁRIOS // 

 As estruturas servem para controlar o fluxo de um programa, permitindo que os mecanismos sejam 
 executáveis por condições determinadas sobre valores booleanos ( true or false ). A condição simples
 avalia se os requisitos de um bloco são verdadeiros, caso contrário, o funcionamento executará de 
 forma ordenada. Fazendoa leitura dos fluxosgramas de códigos, os comandos são interpretados como:
  
      fluxograma:
       - losangulo = condição ( if )
        - entrada de dados = executado por uma função 
         - entrada de dados = executados por uma condicional oposta ( else )
          - saída de dados = ação realizada pela condição final
  
      tipo de condição simples:
        if ( a > b ) {
          - leia a 
        }   
  
      tipos de condição composta
       if ( a > b ) {
          - leia a 
       } else {
          - leia b 
       }

 Dando continuidade a esta aula, o conteúdo presente busca demonstrar a aplicação dos conceitos de operadores dentro de estruturas condicionais, 
 do qual exige breve métodos lógicos para verificar determinada condição. Este conceito pode ser exemplificado utilizando a ferramenta " Markdown ":
 
  -> inicio 
    - leia number1, number2 ( inteiro ) | media ( decimal )
    - media <- ( number1 + number2 ) / 2;
    -> se ( media > 7  ) entao {} 
    -  escreva ("parabéns")
    -> fimse
  -> fim_algoritmo   

 Dando continuidade ao conteúdo anterior, a segunda parte do conteúdo de " Condicções Simples e Compostas "
 observa-se que a utilização de estruturas condicionais servem para diferentes finalidades, tendo o funcionamento
 de comandos e execuções de ações aplicadas em diferentes contextos. Um exemplo prático dessa junção de diversas 
 condções chama-se de " Condições Aninhadas ", onde uma condição é aplicada dentro de outra, permitindo que o código seja
 executado de forma mais complexa. Essa estrutura é utilizada para criar lógicas mais elaboradas, onde as condições
 são interligadas e dependem das demais condições.

 Aplicando este código usando a metodologia em Java, obtemos a seguinte estrutura: 
 
 -> public class Main{}
 - psvm(String[] args){}
 - Scanner sc = new Scanner( system.in );
 
 - double number1 = sc.nextDouble();
 - double number2 = sc.nextDouble();
 - double media = ( number1 + number2 ) / 2;
 -> if ( media > 6.0 ){ else }
 - System.out.print("aprovado");
 - System.out.print("reprovado");   
 
 A funcionalidade de uma Condição Composta, baseada em java, é da seguinte forma:
 
  -> public class Main{}
  - psvm(String[] args){}
  - Scanner sc = new Scanner( system.in );
  
  - s.out.print(" informe o ano de nascimento ")
  - int anoNasc = sc.nextInt();
  - int idade = 2025 - anoNasc
  - s.out.println( `você tem ${ idade } anos `);  
  -> if ( idade >= 18 ){ else }
  - s.out.print(" você é maior de idade ";
  - s.out.print(" você é menor de idade ");
*/
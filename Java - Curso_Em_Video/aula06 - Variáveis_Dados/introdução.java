/*
 Referência em Vídeo - Tipos Primitivos e Manipulação de Dados 
 canal: Curso em Vídeo ( SITE ) - EP00 ( Playlist: Introdução à Java )
 https://youtu.be/JEAQeT7YGs4

   // COMENTÁRIOS //

 Prosseguindo com o conteúdo apresentado, a aula ressalta os conceitos iniciais de Lógica de Programação, também 
 conhecido como Introdução à Algoritmo, que possui 4 tipos primitivos de valores: inteiro, decimal, caractere e lógico.
 Os tipos primitivos de variáveis podem sofrer modificações conforme a linguagem, nesta linguagem, os modelos possuem 
 diferenciações que executam o procesos de entrada e saída de dados. 
 
 Porém, para facilitar a condificação em um programa, utiliza-se sinais que notificam a presença de texto dentro do código, 
 sem interferir durante o processo de compilação ou interpretação. Neste caso, o conceito é presente em duas formas:
 
  -> //
   - uso em uma única linha

  -> / + * || * + /
   - uso em múltiplas linhas  
 
  -> / + ** || * / 
   - uso de marcas específicas em múltiplas linhas

 O curso de Algoritmo abordava conceitos de inicialização de variáveis, destacando a área em que as variáveis são declaradas 
 e a área que estas declarações são aplicadas e processadas em um programa. Na linguagem Java, os tipos de variáveis presentes 
 são definidas de diferentes formas:
 
  ex 
  
  -> convencional
   - int idade = "";
   - float sal = 00000f;
   - char let = 'A';
   - boolean se = false
   
  -> typecast 
   - int idade = ( int ) "";
   - float sal = ( float ) 0000;
   - char let = ( char ) 'A';
   - boolean se = ( boolean ) !false;
  
  -> wrapper class | objeto / classe
   - Integer id = new Integer( "" );
   - float sal = new float();
   - character let = new character();
   - boolean se = new boolean();

 Os tipos primitivos na linguagem Java possuem famílias e gêneros que são definidos de 
 acordo com sua compartibilidade e portabilidade com as demais variáveis, por exemplo:

  -> familia
   - lógico ( boolean )
   - literais ( char )
   - inteiros ( byte / short / int / long )
   - reais ( float / double )

  -> tipo primitivo
   - booelan 
   - char
   - byte / short / int / long
   - long
   - float / double

  -> classe invólucra
   - boolean 
   - character / string
   - byte / short / integer / long 
   - float / double 

  -> tamanho 
   - 1 bit
   - 1 byte / 1 byte ( cada )
   - 1 byte / 2 bytes / 4 bytes / 8 bytes 
   - 4 bytes / 8 bytes 

  -> exemplo 
   - true 
   - ' A ' / JAVA 
   - 127 / 32.767 / 2.147.483 / 2 ^ ( 63 ) 
   - 3. 4e+ ^ ( 38 ) / 1.8e+ ^ ( 308 )
   
   
 Para aplicar os conceitos de saída de dados, utilize os comandos de impressão de mensagem fornecidos 
 pelo sistema: 

  -> flaot nota = 150f;
   - system.out.print( nota )
   - system.out.println( nota )
   - system.out.printf( "%.2f \n", nota)
   - system.out.format( "%.2f \n", nota)

 Agora, analisando o processo de entrada de dados, é recomendado utilizar os comandos integrados 
 por bibliotecas que são importadas diretamente do pacote java. A compartibilidade de variáveis é limitada
 de acordo com os tipos envolvidos:

  -> entrada de dados 
   - import java.util.Scanner 

  -> Compartibilidade
   - String valor = Integer.ToString( int );
   - int idade = Integer.parseInt( valor ); 
*/

/*
 Referência em Vídeo - EXERCÍCIOS
 canal: Curso em Vídeo ( SITE ) - EP01 ( Playlist: Introdução à Java )
 https://youtu.be/7XPR-v1Fzjw
 
   // EXERCÍCIOS //

  -> em relação aos tipos básicos de dados, assinale a opção incorreta 
   
   - vetor: estrutura que suporta X posições de mesmo tipo
 
  -> marque 1 para dados inteiros e marque 2 para outros dados
   
   - 2 ( string )
   - 2 ( string )
   - 1 ( int )
   - 1 ( int )
   - 2 ( string )
   - 2 ( string )
   - 2 ( double )

  -> assinale a alternativa que tenha somente nomes corretos de variáveis

   - nome1 , sobrenome2, senha3 
   
  -> assinale a alternativa que completa corretamente: "são caracterizados como tipos .... "

   - tipo inteiros ( positivos e negativos )

  -> 
*/
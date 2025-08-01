/*
 Referência em Vídeo - Vetores e Array 
 canal: Curso em Vídeo ( SITE ) - EP00 ( Playlist: Introdução a Java )
 https://youtu.be/KAS94-Lcboc
 
    \\ COMENTÁRIO \\ 

 Compreender o conceito das Estruturas de Repetição é necessário para introduzir os fundamentos
 de Variáveis Compostas. As Variáveis compostas são estruturas capazes de armazenar mais de um valor
 ao mesmo tempo, do mesmo tipo ou de tipos diferentes, dentro de uma única variável.

 Estes fundamentos definem a execução de um array, do qual armazena múltiplos valores do mesmo tipo em diferentes
 posições, e cada um desses valores é acessado por um índice, que inicia naturalmente em 0. Na linguagem Java, o processo 
 de declaração de um vetor ocorre de uma forma diferente: a criação de um vetor é interpretado como uma coleção de valores que
 aplicam em métodos ou atributos, classificando-a como um novo " objeto ". Então, primeiro você define o tipo da variável, nomei-e,
 e defina como um novo objeto com classificação da variável.
 
   ex )
    -> int number = new int[];
    -> String mounth = new String[]
    -> double average = new double[]


 Para definir um valor em um vetor, você possui diferentes tipos: definir diretamente através da variável
 pelo índice e o valor, e definir em implícito por chaves;
 
   -> int num[] = {3, 5, 8, 3}
     - num[0] <- 3
     - num[2] <- 1 
     - num[1] <- 2
 * 
 Além do uso de Estruturas Condicionais, as Variáveis Compostas também possuem sua modificação em relação 
 ao uso de laço de repetição. O ForEach ( PARA CADA UM ) é uma forma mais achatada de utilizar coleções de valores em um vetor.
 O conceito deste modelo é que, invés de uma repetição de todas as variáveis e seus valores, o comando especifica 
 como ocorrerá a execução do processo.
 
    -> int num[] {0, 1, 2, 3, 4, 5}

    for ( int valor: num ){
      sysout( valor );
    }

 Dentro desta execução, você pode importar funcionalidades adicionais do pacote java. Utilizando o pacote " java.util.Arrays ", 
 você pode incluir recursos funcionais de um vetor:

    -> Arrays.sort( ) 
      - organiza os valores do decrescente ao crescente

    -> Arrays.BinnarySearch
      - ler o vetor e faz uma análise sob ordem binária dos valores

    -> Arrays.fill()
      - preenche os índices com o mesmo vetor
   

 
*/
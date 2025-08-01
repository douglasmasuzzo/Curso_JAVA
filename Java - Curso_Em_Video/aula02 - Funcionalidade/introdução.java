/*
 Referência em Vídeo - Funcionalidade da Linguagem JAVA 
 canal: Curso em Vídeo ( SITE ) - EP00 ( Playlist: Introdução à Java )
 https://youtu.be/v_ZCtgwbS3o

   // COMENTÁRIOS // 

 Dando continuidade a diferenciação da linguaugem Java, precisamos retomar alguns fatores que foram mencionados no assunto anterior.
 Observando todo o material, pudemos compreender que o uso de uma ferramenta que se comunique com os  demais dispositivos / programas, 
 impactaria fortemente na evolução da tecnologia. Neste contexto, a linguagem C desempenhou um papel fundamental durante o desenvolvimento de 
 programas, ao introduxir o uso de compiladores para realizar a leitura de códigos fontes, gerando outros códigos exectuáveis com novos 
 micro-instruções. 
 Seguindo a referência de " multiplataforma ", a linguagem consegue criar outros códigos fontes para incorporar aos seus respectivos tipos de plataformas, 
 como: " MS DOS - WINDOWS " / " IOS - IOS " / " LINUX - LINUX ". Utilizando os compiladores fornecidos por cada sistema, a leitura de códigos executáveis só 
 será realizada de acordo com o local e a portabilidade existente, necessitando de " pré - compiladores " para 
 analisar e interpretar os códigos recebidos. 
 
 Tendo a mesma semelhância a C, a leitura de um bloco de código constrído pela linguagem Java sofre do mesmo problema: a análise do código fonte não ocorre sem 
 uso de um compilador. A linguagem possui seu próprio compilador para realizar a interpretação de um código fonte, nomeadas como " JavaC ( Java Compiler ) ".
 O compilador recebe a produção do código fonte, modificando o tipo do documento de um código fonte para códigos em byte ( 1 / 0 ), que por sua vez, encaminha o
 código reformulado para o dispositivo, tornando-se um ByteCode. Apesar de seu paratêsco com o modelo do compilador, o arquivo pode não ser lido conforme o tipo do 
 sistema ou modelagem parecida, exigindo um software que interligue o arquivo criado ao local de envio: a Java Virtual Machine.
 
 Contudo, com o aplciação de outra ferramenta, o processo de compilação se tornou mais eficiente, evitando etapas que poderiam complicar a compilação dos códigos fontes,
 oferecendo uma portabilidade eficaz conforme a comunicação da máquina virtual com os respectivos sistemas operacionais. Este processo de compilação única formalizou um 
 termo chamado " WORA ": " Write Once, Run Anywhere ". A criação deste acrônico definiu a funcionalidade desta linguaguem, resumindo-se em fundamentos símplistas, porém, 
 com leve toque de complexidade.
 
 Aprofundando este mundo de termologias desta linguagem, é importante visualizar a aplicabilidade da ferramenta, definindo o uso para fins profisisonais ou apenas para uso próprio.
 Assim, as termologias encontradas neste mundo são:

    * desenvolvedores
     -> JDK ( Java Development Kit )
      - JRE
      - JavaLang 
      - JavaTools
       - JAVAC ( compilador java )
       - DEBUGGER ( verificador de debugs )
        - API's ( grupo de bibliotecas )
        - IDE 

    * usuários
     -> JRE ( Java Runtime Enviroment )
      - JVM ( Java Virtual Machine )
        - LOADER ( parte interna que carrega o bitcode à maquina virtual)
        - VERIFICADOR ( verifica se o código pode ser compilado )
        - INTERPRETADOR ( transforma o bitcode para o código de instrução )
        - GERENCIADOR ( gerencia como a memória vai ser distribuida na máquina )
        - COMPILADOR JIT ( compilação em tempo real )
*/

/*
 Referência em Vídeo - Exercícios
 canal: Curso em Vídeo ( Site ) - EP01 ( Playlits: Introdução à Java )
 https://youtu.be/bIXDystGxj0
 
  // EXERCÍCIOS //

    -> em relação à linguagem Java, complete as lacunas abaixo:  
     
     I - o comando JAVA do Java Development Kit executa um aplicativo java
     II - o comando JAVAC do Java Development Kit compila um programa java
     III - um arquivo java deve terminar com a extensão de arquivo .JAVA
     IV - quando um programa é compilado, o arquivo produzido pelo compilador termina 
      com a extensão de arquivo CLASS 
     V - o arquivo produzido pelo compilador contém BYTECODES que são executáveis pela JVM

    -> determine questões falsas e verdadeiras de acordo com as opções

     - a área de memória requerida para operar um programa compilado é menor que a requerida
      pela a interpretação ( F )

     - um programa interpretado requer uma área de memória menor do que a do compilado ( V )
    
     - o tempo para execução interpretada é maior do que o tempo de execução compilada ( V )

     - um programa compilado requer um tempo de execução maior do que um interpretado ( F ) 

    -> em um algoritmo, como pode representar o cálculo da multiplicação da base pela altura e a 
     divisão pela constante de 2 

      - A = ( B * AL ) / 2 ;
      
    -> assinale a alternativa à fórmula correta para calcular a média aritmética entre 4 notas

      - ( n1 + n2 + n3 + n4 ) / 4;

    -> COMENTÁRIO
     
      - " um PROGRAMA pode existir em três níveis: FONTE ( simbólico ), RELOCÁVEL e OBJETO ( executável ) "
      - " o COMPILADOR vai verificar a sintaxe dos comandos, buscar por erros, realizar a tradução do código 
         simbólico em múltiplas instruções essenciais "
      - " o MONTADOR ou ASSEMBLER realiza cálculos de endereçamento e transforma as instruções relocáveis em
         linguagem de máquina"
      - " o INTERPRETADOR realiza todos esses recursos de forma rápida e precisa "

*/
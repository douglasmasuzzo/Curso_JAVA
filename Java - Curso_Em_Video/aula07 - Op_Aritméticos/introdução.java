/*
 Referência em Vídeo - Operadores Aritméticos e Método Math
 canal: Curso em Vídeo - EP00 ( Playlist: Introdução à Java )
 https://youtu.be/W9V5wtOOZHs

   // COMENTÁRIOS // 
 
 Após obter conhecimentos sobre os tipos de variáveis utilizados em Java,  
 aplicaremos as funcionalidades de operadores aritméticos e os conceitos de 
 método Math. O uso tradicional dos operadores aritméticos podem ser descritos da
 seguinte forma:

  -> adição ( + ) 
  -> subtração ( - ) 
  -> multiplicação ( * )
  -> divisão ( / )
  -> módulo ( % )

 Neste mesmo contexto, possuimos também o conceito aplicável de Operadores Unários , 
 este método é marcado pelo uso de sinais que executam funções de decremento e incremento.
 Além disso, a funcionalidade varia conforme o posicionamento da variável e a ordem da qual 
 o programa exige.

 A explicação deste conceito deve-se, como citado anteriormente, ao posicionamento dos sinais. Caso
 a varíavel possua X valor, e o programa exige que este valor seja acrescentado após a definição da variável,
 o resulado apresenta que a variável sofreu um " pós - incremento " ( X ++ ). Por outro lado, caso se o programa
 exigir que o número acrescente seu valor antes de retornar a leitura do código, a variável X sofre um " pré - incremento " ( ++ X ).
 Independentemente da necessidade do programa, este conceito pode ser aplicado tanto para acrescentar, quanto para 
 diminuir algum valor.

  -> incremento ( ++ )
   - pré-incremento ( ++X )
   - pós-incremento ( X++ )

  -> decremento ( -- )
   - pré-decremento( ++Y )
   - pós-decremento( Y++ )
 
 Além destes operadores, possuímos outro operador que é utilizado constante em vários programa:
 o Operador de Atribuição. Conforme o pretexto, esta operação aplica a função de realizar uma
 determinada operação, incluindo sua atribuição após o processo de calcular. 

  -> somar e atribuir ( += )
  -> subtrair e atribuir ( -= )
  -> multiplicar e atribuir ( *= )
  -> dividir e atribuir ( /= )
  -> restar e atribuir ( %= )

 O uso destas operações podem impactar fortemente durante o desenvolvimento de um programa, otimizando recursos 
 e agilizando processos. Mas, em específicos casos, utilizar somente essas operações podem trazer resultados sem 
 eficácia e operações sem eficiências, exigindo um conhecimento avançado sobre tal necessidade. Com isto, o pacote Java
 possui funcionalidades voltadas para resoluções complexas de operações, das quais podem ser incorporadas e importadas de
 bibliotecas que armazenam recursos especiais, através de um comando nomeado como " class Math ".
 
  -> PI ( Math.PI )
    - constante 

  -> POW ( Math.pow() )
   - exponenciação 

  -> SQRT ( Math.sqrt() )
   - raiz quadrada

  -> CBRT ( math.cbrt() )
   - raíz cúbica

  -> ARREDONDAMENTOS
    -> abs 
     - valor absoluto ( math.abs() )
   
    -> floor 
     - arredondar para baixo ( math.floor() )
     
    -> ceil 
     - arredondar para cima ( math.ceil() )

    -> round
     - arredondar aritmeticamene ( math.round() )

  -> Random ( math.randoM() )
   - número aleatório   
*/

/*
 Referência em Vídeo - EXERCÍCIOS
 canal: Curso em Vídeo ( SITE ) - EP01 ( Playlist: Introdução à Java 
 https://youtu.be/dEuQBmHXRnY

   // EXERCÍCIOS //

  -> considerando o trecho do código em Java, assinale a alternativa correta: 

    - executando as linhas, o valor exibirá O VALOR ATUAL DA VARIÁVEL ( n ) e o valor final 
    APÓS O PÓS INCREMENTO ( n++ )

  -> considernado o tratamento de variáveis em java, analise o código e o que será impresso

    - 2.0 ( double resultado = num1 / num2 )
  
  -> execute três instruções em JAVA e marque a opção que contém o valor que será impresso
    
   - 7 | 1 | 3 ( v1 = 7 / v2 = v1 % 2 / v3 = 2 + ( v2++ ) )
*/
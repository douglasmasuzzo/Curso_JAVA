/*
 Referência em Vídeo - Métodos
 canal: Curso em Vídeo ( SITE ) - EP 00 ( Playlist: Introdução a Java )
 https://youtu.be/EuxmbXZCFVQ

    \\ COMENTÁRIOS \\

 Após passar por todos os conceitos e fundamentos básicos da linguage, esta aula apresenta os conceitos referentes 
 as Rotinas, métodologia apresentada sob fundamentos básicos de raciocínio lógico. As rotinas, também conhecidas como 
 " MÉTODOS ", são comandos que possuem ações responsivas ou estáticas que podem incluir parâmetro de valores. Na linguagem 
 JAVA, o comando " VOID " permite que o procedimento possua alguma funcionalidade ou que não retornem algum resultado.
 
    ex)
     -> void Somar( int A, int B ){}
            int soma = A + B;
            sysout( soma );

            Somar( 10 , 10 ) = 20;

   Descrevendo palavras - chaves incorporadas no cabeçalho do Java, obtemos:

    -> classe ( class )
    -> public ( acesso público ) 
    -> static ( estático )
    -> void ( procedimento " principal ") 
    -> main ( método )
    -> String[] args ( coleção de argumentos )

 Na linguagem JAVA, os métodos " NÃO-ESTÁTICOS " ( void ) são formados por instâncias de uma classe. Aplicá-las sob um
 contexto estático ( main ) não permite acessaar os valores atribuídos àquela classe, impedindo a execução do procedimento
 criado. Com isto, o comando deverá instanciar a classe que, a partir de um objeto criado, importará o método criado.
 
    -> public void Somar ( int A , int B ){ int soma = A + B }
    -> public static void Somar ( int A , int B ){ Somar( 10, 10 ) }

 O uso de funções responsivas dentro da linguagem possui semelhança a metodologia apresentada em Algoritmo e aos conceitos
 aplicado em JavaScript. O retorno de um valor precisa, antecipadamente, ser definida junto com as definições das variáveis.

    -> public static int Somar( int A , int B )
    -> int soma = A + B;
    -> return soma;

    -> public static void main{ int res = Somar( 10 , 10 ) }
    -> sysout( res )
*/
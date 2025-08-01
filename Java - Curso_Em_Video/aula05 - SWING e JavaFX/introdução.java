/*
 Referência em Vídeo - Unidade Gráfica ( Java SWING / FX ) 
 canal: Curso em Vídeo ( SITE ) - EP00 ( Playlist: Introdução à Java )
 https://youtu.be/cYMruFKwqf0 

   // COMENTÁRIO //

 Continuando com os assuntos da matéria, esta aula busca apresentar os conceitos presentes do pacote 
 Java SWING / FX. Estes pacotes são extraídos por bibliotecas e ferramentas que aplicam o uso de efeitos 
 gráficos dentro do programa, o uso destes recursos são funcionais ao importar / adicionar recursos externos
 para tais necessidades. Resumidamente, a linguagem java já possui funcionalidades básicas incorporadas ao pacote
 " JAVA . LANG ", porém, pode comportar recursos extras fora do pacote ao solicitar o comando: IMPORT.
 
 Outros comandos que podem ser incluídos dentro do pacote são:

   -> pacote JAVA.lang
     - JAVA.awt ()
     - JAVA.applet ( criar aplicativos )
     - JAVA.util ( utilitários )
     - JAVA.math ( funções matemáticas )
     - JAVA.net ( redes )
     - JAVA.sound ( extensões de aúdio )
     - JAVA.media ( extensões de mídias )
     - JAVAx.swing ( funcionalidades gráficas )
     - JAVA FX.xml ( )

 O JAVA.swing é uma bilbioteca que possibilita a criação de interfaces gráficas para diferentes 
 tipos sistemas. A sua criação antecede o surgimento da ' AWT ' ( Abstract Window Tooltik ), que obtia 
 o feito de ser a única ferramenta que criasse interfaces gráficas aos programas, porém, os recursos que
 eram utilizados não possuiam um padrão, comprometendo o desempenho e a navegação de acordo com cada tipo 
 de sistema operacional. Buscando solucionar este problema, os desenvolvedores criaram uma bilioteca que
 oferecesse um layout de interface gráfica padronizado, independentemente da versão dos S.O, e nomea-la 
 de JAVAx.swing.
 

    ** EXEMPLO - CÓDIGO
     -> import javax.swing.JOptionePane;
     -> public class Main{}
     -> psvm{}
     -> String nome = JOptionPane.showInputDialog ( " informe o nome ");
     -> JOptionPane.showMessageDialog ( null, " seu nome : " + nome );
    
 O caso ilustrado do vídeo apresenta a utilidade dos recursos adotados das bibliotecas, permitindo a criação
 de efeitos gráficos ao importar as funcionalidades, sem codificá-las. A classe criada importa os efeitos gráficos
 e herda as funcionalidades programadas, através de comandos interligados ao conceito de progrmação orientada à 
 objetos: " extends " ( HERANÇA ) / " private " ( ENCAPSULAMENTO ) / " implements ( INTERFACE )". 

    -> public class " bla bla bla " EXTENDS javax.swing.JFrame;
    -> private javax.swing.JButton;
    -> private javax.swing.JLabel;
    -> private void btnClickActionPerformed(){}
    
 Com a evolução da tecnologia, o surgimento da Plataforma JAVAX FX permitiu que houvesse mais variedade em 
 aplicações gráficas sem restrição a uma única funcionalidade, assim, expande tais interatividades para outras 
 áreas automaticamente. Analisando o código estruturado, podemos identificar alguns pontos importantes durante 
 o uso do pacote JAVA.FX:
 
    -> import javafx.fxml.FXML;
    -> public class " bla bla bla "
    -> IMPLEMENTS Initializable
    -> @FXML
     - private button btnClick;
     - private label lblMessage;

    -> @FXML
     - private void clicarBotao(){}
     - lblMessag()
      
*/

/*
 Referência em Vídeo - EXERCÍCIOS
 canal: Curso em Vídeo ( SITE ) - EP01 ( Playlist: Introdução à Java )
 https://youtu.be/UaTZTP50i08

   // EXERCÍCIOS //
   
    -> segundo a linguagem JAVA, assinale
     - a palavra chave new introduz uma declaração de classe 
       seguida pelo nome da classe;
    
    -> uma pilha é versão limitada de uma lista encadeada, ao adicionar um novo produto, 
       precisa iniciar pelo topo, na classe Stack, está definida por qual biblioteca?

     - java.util.Stack 

    -> em JAVA, que palavra cria um objeto de uma classe específica
     - object obj = NEW object;
     
    -> 
      
*/
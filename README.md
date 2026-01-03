# **Projeto ' Sistema de Gestão Escolar ' - SpringBoot** #

## Visão Geral ##

Este projeto consiste em uma aplicação Java Spring Boot desenvolvida com o objetivo de consolidar conceitos fundamentais de arquitetura em camadas, persistência de dados com JPA/Hibernate e integração com banco de dados relacional. Inicialmente estruturado utilizando o banco em memória H2, o projeto evoluiu para utilizar MySQL, simulando um cenário mais próximo de ambientes reais de desenvolvimento. O foco principal é o gerenciamento de registros acadêmicos, servindo como base para estudo e expansão futura.

## Objetivos ## 
  - Aplicar o padrão arquitetural **Controller → Service → Repository**
  - Utilizar **SpringBoot** para configuração e inicialização simplificada
  - Implementar persistência com **Spring Data JPA**
  - Migrar de um Banco de Memória ( **H2** ) para um Banco Relacional ( **MySQL** )
  - Trabalhar com versionamento de código ( **Git** )
  - Consolidar boas práticas de árvores de arquivos

--------------------------------------------------------------------
### _Ferramentas_ ###
  - Java 17
  - SpringBoot
  - Spring Data JPA
  - Hibernate
  - MySQL
  - H2 DB
  - Maven
  - IntelliJ IDEA
  - MySQL WorkBench
  - Git

### _Estrutura do Projeto_ ###

- **_src/main/java/br/com/projeto/GestaoEscolar/GestaoEscolarApplication_**

 Controller | Service | Repository | Model | Model.Enums
  --- | --- | --- | --- | --- | 
  _ControllerRegistro_ | _ServiceRegistro_ | _RegistroRepository_ | _Registro_ | _Periodo_ / _Modelo_

### _Arquitetura_ ###

- **Controller**
  - Responsável por expor API REST e receber as requisições
  - Mapear endpoints
  - Receber e retornar dados no formato JSON
  - Delegar a lógica de negócio para a camada de serviço

- **Service**
  - Camada responsável pela regra de negócio
  - Centralizar lógica da aplicação
  - Evitar acesso direto ao repositório por ccontrollers
  - Facilitar teste e futuras alterações
 
- **Repository**
  - Camada de acesso aos dados
  - Interagir com o DB
  - Utilizar o SD JPA
  - Abstrair operações CRUD

### _Persistência de Dados_ ###

A persitência é realizada através da JPA/Hibernate, utilizando anotações para mapear entidades Java para tabelas do DB

- Uso do `` @Entity ``
- Mapeamento de tabela com `` @Table ``
- Enumerações com `` @Enumerated( EnumType.STRING ) ``

### _Banco de Dados_ ### 

- **H2**
  - Inicialização rápida
  - Execução em memória
  - Facilidade de teste 

- **MySQL**
  - Simulação de um ambiente real de produção
  - Uso de persistências e dumps  

A administração do banco passou a ser feita através do MySQL Workbench, enquanto o IntelliJ é utilizado como cliente SQL auxiliar para consultas e inspeção de dados.

---------------------------------------------------------------

## **Considerações Finais** ##

O projeto Gestão Escolar representa uma evolução prática no aprendizado de Spring Boot, indo além de exemplos básicos e abordando problemas reais como migração de banco, organização de pacotes e versionamento. Ele serve como base sólida para projetos mais complexos e profissionais.
 


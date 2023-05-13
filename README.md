# projeto API de Cadastro Médico

**Este é um projeto de API para cadastrar, listar, atualizar e deletar informações de médicos em um banco de dados MySQL. A API foi desenvolvida com Spring Boot e Java.**

## Quick Start:


**Para rodar o projeto é necessário seguir os seguintes passos:**

1.  Clone o código fonte do projeto em: [https://github.com/Ricardoporfiriovieira/medicos-api](https://github.com/Ricardoporfiriovieira/medicos-api)
    
2.  Crie um banco de dados MySQL e uma tabela com o seguinte nome: `med_aplication.med_aplication`
    
3.  Execute o seguinte script para criar a tabela com o schema correto:
    

Comando SQL:

``CREATE TABLE `med_aplication` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `crm` varchar(6) NOT NULL,
  `especialidade` varchar(100) NOT NULL,
  `logradouro` varchar(100) NOT NULL,
  `bairro` varchar(100) NOT NULL,
  `cep` varchar(9) NOT NULL,
  `complemento` varchar(100) DEFAULT NULL,
  `numero` varchar(20) DEFAULT NULL,
  `uf` char(2) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `crm` (`crm`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;`` 

4.  Verifique se o Java e o Spring estão instalados na sua máquina. Se não estiverem, faça o download e a instalação em seus respectivos sites oficiais.
    
5.  Abra o projeto em sua IDE de preferência. O arquivo principal é o `ApiApplication.java`.
    
6.  Execute o projeto através do comando `./mvnw spring-boot:run` ou através da sua IDE.
    

Recomendamos o uso do IntelliJ IDEA para executar o projeto, mas outros editores de código também podem ser utilizados. Certifique-se de que todas as dependências do projeto estejam instaladas corretamente antes de executá-lo.

# Endpoints

 1. **Healthcheck**

    Verifica se a aplicação está em funcionamento. Este endpoint retorna uma mensagem simples: "Olá mundo!".
    
    Endpoint: GET "/"

 2. **Cadastro de médico**

    Cria um novo registro de médico no banco de dados.
    
    POST "/medicos"
    
    Recebe um objeto JSON com as seguintes propriedades:
    
    nome: Nome completo do médico.
    email: Endereço de email do médico.
    crm: Número do registro médico.
    especialidade: Especialidade médica do profissional.
    logradouro: Rua ou avenida do endereço.
    bairro: Bairro do endereço.
    cep: CEP do endereço.
    complemento: Complemento do endereço.
    numero: Número da residência.
    uf: Unidade Federativa do endereço (ex: SP, RJ, etc.).
    cidade: Cidade do endereço.
    telefone: Número de telefone do médico.

 3. **Listagem de médicos**

    Retorna uma lista paginada dos médicos cadastrados.
    
    GET "/medicos"
    
    Parâmetros:
    
    page: Página desejada.
    size: Quantidade de registros por página.

 4. **Atualização de médico**

    Atualiza as informações de um registro de médico existente no banco de dados.
    
    PUT "/medicos"
    
    Recebe um objeto JSON com as seguintes propriedades:
    
    id: ID do registro a ser atualizado. nome: Nome completo do médico. email: Endereço de email do médico. crm: Número do registro médico. especialidade: Especialidade médica do profissional. logradouro: Rua ou avenida do endereço. bairro: Bairro do endereço. cep: CEP do endereço. complemento: Complemento do endereço. numero: Número da residência. uf: Unidade Federativa do endereço (ex: SP, RJ, etc.). cidade: Cidade do endereço. telefone: Número de telefone do médico.

 5. **Remoção de médico**

    Remove um registro de médico do banco de dados.
    
    DELETE "/medicos/{id}"
    
    Parâmetros:
    
    id: ID do registro a ser removido.

 6. **Criando Banco de Dados**

    O projeto utiliza um banco de dados MySQL com a seguinte tabela:
    
    sql
    Copy code
    CREATE TABLE med_aplication (
      id BIGINT NOT NULL AUTO_INCREMENT,
      nome VARCHAR(100) NOT NULL,
      email VARCHAR(100) NOT NULL UNIQUE,
      crm VARCHAR(6) NOT NULL UNIQUE,
      especialidade VARCHAR(100) NOT NULL,
      logradouro VARCHAR(100) NOT NULL,
      bairro VARCHAR(100) NOT NULL,
      cep VARCHAR(9) NOT NULL,
      complemento VARCHAR(100),
      numero VARCHAR(20),
      uf CHAR(2) NOT NULL,
      cidade VARCHAR(100) NOT NULL,
      telefone VARCHAR(14),
      active BOOLEAN,
      PRIMARY KEY(id)
    );
    Também são realizadas as seguintes alterações na tabela:
    
    sql
    Copy code
    ALTER TABLE med_aplication ADD COLUMN telefone VARCHAR(14);
    
    ALTER TABLE med_aplication ADD COLUMN active BOOLEAN;
    
    UPDATE med_aplication SET active = true;

 7. **Configuração**

    Para conectar a aplicação backend com o MySQL é necessário criar um arquivo application.properties na pasta src/main/resources e adicionar as seguintes configurações:

    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.url=jdbc:mysql://localhost/vollmed_api
    spring.datasource.username=root
    spring.datasource.password=root

 8. **Executando o Projeto**

    Para executar o projeto, é necessário ter o Java e o MySQL instalados. Clone o repositório para sua máquina, crie o banco de dados e configure o arquivo application.properties. Depois disso, execute o comando ./mvnw spring-boot:run na pasta raiz do projeto.
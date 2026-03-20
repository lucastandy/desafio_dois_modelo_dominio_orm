# Segundo Desafio da Formação Desenvolvedor Moderno (DEVSUPERIOR)
## DESAFIO: Modelo de domínio e ORM

## 📦 Descrição:

Este projeto foi desenvolvido como parte do desafio do módulo de Back-end da formação DevSuperior, com o objetivo de implementar um modelo de domínio completo utilizando Spring Boot, JPA/Hibernate e banco de dados H2.

A aplicação simula um sistema de gerenciamento de atividades de um evento acadêmico, permitindo o cadastro e relacionamento entre participantes, atividades, categorias e blocos de horários.

## 🎯 Objetivo:

Garantir que:

* O projeto execute sem erros;
* O banco de dados seja criado corretamente;
* Os relacionamentos estejam devidamente mapeados;
* Os dados iniciais estejam presentes.

## 🧠 Modelo de domínio:

O sistema foi estruturado com base nas seguintes entidades:

* Participante;
* Atividade;
* Categoria;
* Bloco.

## 🔗 Relacionamentos:
* Participante ↔ Atividade: Many-to-Many;
* Atividade → Categoria: Many-to-One;
* Atividade ↔ Bloco: Many-to-Many.

## ⚙️ Tecnologias Utilizadas:

* Java 17+;
* Spring Boot;
* Spring Data JPA;
* Hibernate;
* H2 Database;
* Maven.

## 💾 Banco de dados:

O projeto utiliza o banco de dados em memória H2, com criação automática das tabelas e carga inicial de dados através do arquivo:

import.sql

## ▶️ Como executar o projeto:

### Pré-requisitos:

* Java 17 ou superior;
* Maven.

### Passos:

Clonar o repositório:

```
git clone <URL_DO_REPOSITORIO>
```

Acessar a pasta do projeto:
```
cd nome-do-projeto
```

Executar a aplicação:
```
./mvnw spring-boot:run
```

## 🧪 Acessando o banco H2:

Após iniciar a aplicação, acesse:

```
http://localhost:8080/h2-console
```
Configurações:

* JDBC URL: jdbc:h2:mem:testdb;
* User: sa;
* Password: (vazio).

## ✅ Funcionalidades implementadas:

* Mapeamento completo de entidades com JPA;
* Relacionamentos entre entidades (1 e N);
* Criação automática do schema;
* Inserção de dados iniciais via import.sql;
* Integração com banco H2.


## 👨‍💻 Autor:

Lucas Tandy do Nascimento Silva
 https://www.linkedin.com/in/lucas-tandy/

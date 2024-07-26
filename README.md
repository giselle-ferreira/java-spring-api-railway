## About
Repositório criado para envio de desafio de RestfulAPI, para o Bootcamp Santander de Java na DIO.

<br/>

## Tecnologias e Ferramentas
- Java 17
- Spring Boot
- Swagger
- H2
- PostgreSQL
- Railway
- IntelliJ

<br/>

## Diagrama de Classes

```mermaid
classDiagram
    class Link {
        +UUID id
        +String url
        +String description
        +Category category
    }

    class Category {
        +UUID id
        +String name
        +Set~Link~ links
    }

    Link --> Category
    Category "1" --> "*" Link : contains

```

<br/>

## Swagger
![image](https://github.com/user-attachments/assets/de2ab3a8-b675-4f12-a156-7f728f8f89ea)

<br/>

## 

<div align="center">
<p>Made with ❤️ by Giselle Ferreira.</p>
  <p>
    <a href="https://linkedin.com/in/giselleferreiras" target="_blank" >
      <img align="center" height="35" src="https://cdn-icons-png.flaticon.com/512/174/174857.png" alt="Giselle Ferreira Linkedin" />
    </a>
  </p>
</div>

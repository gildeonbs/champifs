# 🏆 ChampIFS - Gerenciador de Jogos Internos do IFS

**ChampIFS** é um sistema web acadêmico desenvolvido para gerenciar os jogos internos do Instituto Federal de Sergipe (IFS). Este repositório refere-se à **Parte 1 do projeto**, focado exclusivamente no **back-end** da aplicação.

---

## 🎯 Objetivo

Permitir o gerenciamento completo de competições esportivas internas do IFS, incluindo:
- Cadastro de atletas, técnicos, coordenadores e árbitros
- Criação e inscrição de equipes por curso e esporte
- Sorteio e organização de grupos
- Registro e gerenciamento de jogos
- Geração da fase eliminatória com regras específicas

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia        | Descrição                                      |
|-------------------|-----------------------------------------------|
| **Java 21**       | Linguagem principal                           |
| **Spring Boot**   | Framework para desenvolvimento web            |
| **Maven**         | Gerenciador de dependências e build           |
| **JPA / Hibernate** | ORM para persistência de dados              |
| **PostgreSQL**    | Banco de dados relacional principal           |
| **H2 Database**   | Banco em memória para testes                  |
| **RESTful API**   | Comunicação entre cliente e servidor          |
| **JSON**          | Formato de comunicação entre back e front     |

---

## 📁 Estrutura do Projeto

- `controller/` → Camada de controle (REST)
- `service/` → Lógica de negócio
- `repository/` → Interfaces JPA para persistência
- `entities/` → Entidades JPA
- `dto/` → Objetos de transferência de dados
- `config/` → Configurações gerais do projeto

---

## Diagrama DER (Entidade-Relacionamento) ChampIFS

<img width="1753" height="1240" alt="champifs-model" src="https://github.com/user-attachments/assets/0ebc8bd1-ae1f-4c3d-9005-bf4bb9593292" />

---

## 📄 Trechos de código

### Plug-in Maven

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version> <!--$NO-MVN-MAN-VER$ -->
</plugin>
```

---

## 🌐 Endpoints de Testes

Abaixo estão listados os endpoints disponíveis para testes locais:

- Lista todos os registros por tipo:

```http
GET http://localhost:8080/atletas
GET http://localhost:8080/equipes
GET http://localhost:8080/esportes
GET http://localhost:8080/cursos
GET http://localhost:8080/campi
GET http://localhost:8080/coordenadores
GET http://localhost:8080/grupos
GET http://localhost:8080/eventos
GET http://localhost:8080/jogos
GET http://localhost:8080/arbitros
```

- Insere objeto por tipo:

```http
POST http://localhost:8080/atletas
```
```json
{
  "nomeCompleto": "João Andrade",
  "apelido": "João",
  "matricula": "2023123001",
  "telefone": "79999999999",
  "senhaHash": "senha123",
  "tipo": "tecnico",
  "equipe": {
    "id": 1
  }
}
```


```http
POST http://localhost:8080/atletas
```
```json
{
  "nomeCompleto": "João Andrade",
  "apelido": "João",
  "matricula": "2023123001",
  "telefone": "79999999999",
  "senhaHash": "senha123",
  "tipo": "tecnico",
  "equipe": {
    "id": 1
  }
}
```

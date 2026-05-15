# Storage Cloud API 🚀

API REST desenvolvida com Kotlin e Spring Boot para upload e gerenciamento de arquivos, utilizando PostgreSQL para persistência de metadados e AWS S3 para armazenamento de objetos.

O projeto simula uma arquitetura cloud utilizando Docker e LocalStack, permitindo desenvolvimento e testes locais sem necessidade de uma conta AWS real.

---

# 📌 Objetivo do Projeto

Este projeto foi desenvolvido com foco em estudos de:

- Backend com Spring Boot
- Integração com serviços AWS
- Armazenamento de arquivos no S3
- Persistência de dados com PostgreSQL
- Containers com Docker
- Arquitetura baseada em APIs REST
- Simulação de ambiente cloud local com LocalStack

---

# 🛠 Tecnologias Utilizadas

## Backend
- Kotlin
- Spring Boot 3
- Spring Data JPA
- Hibernate

## Banco de Dados
- PostgreSQL

## Cloud & Storage
- AWS S3
- LocalStack

## DevOps
- Docker
- Docker Compose

## Build Tool
- Gradle

---

# ☁️ Arquitetura do Projeto

Fluxo da aplicação:

1. O usuário envia um arquivo via endpoint REST
2. A API recebe o arquivo
3. O arquivo é enviado para o bucket S3 (LocalStack)
4. Os metadados são persistidos no PostgreSQL
5. A API retorna os dados do upload em JSON

---

# 🚀 Como Executar o Projeto

## Pré-requisitos

- Docker
- Java 17+
- Gradle

---

## Subir containers

```bash
docker compose up -d
```

---

## Executar aplicação

```bash
./gradlew bootRun
```

A aplicação ficará disponível em:

```text
http://localhost:8080
```

---

# 📂 Endpoint Disponível

## Upload de Arquivos

### POST

```http
POST /api/files/upload
```

### Form-data

| Key  | Type |
|------|------|
| file | File |

---

# ✅ Exemplo de Resposta

```json
{
  "id": 1,
  "fileName": "arquivo.txt",
  "fileType": "text/plain",
  "s3Key": "uuid_arquivo.txt",
  "uploadDate": "2026-05-15T18:06:40"
}
```

---

# 📚 Conceitos Aplicados

- API REST
- Upload Multipart
- Integração com S3
- Persistência com JPA
- Containers Docker
- Cloud Simulation
- Arquitetura Backend
- Injeção de Dependência

---

# 🎯 Melhorias Futuras

- Download de arquivos
- Deleção de arquivos
- Swagger/OpenAPI
- Autenticação JWT
- Deploy na AWS
- Testes automatizados
- CI/CD com GitHub Actions

---

# 👩‍💻 Desenvolvido por

Ivana Miranda

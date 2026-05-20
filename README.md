# ☁️ Storage Cloud API

API REST desenvolvida com Kotlin + Spring Boot para upload e gerenciamento de arquivos utilizando armazenamento S3 e persistência de metadados em PostgreSQL.

O projeto simula uma arquitetura cloud utilizando Docker + LocalStack, permitindo desenvolvimento local sem necessidade de uma conta AWS real.

---

## 🚀 Tecnologias

### Backend
- Kotlin
- Spring Boot 3
- Spring Data JPA
- Hibernate

### Banco de Dados
- PostgreSQL

### Cloud & Storage
- AWS S3
- LocalStack

### DevOps
- Docker
- Docker Compose

### Build Tool
- Gradle

---

# 📌 Funcionalidades

- Upload de arquivos
- Armazenamento de arquivos em S3
- Persistência de metadados no PostgreSQL
- Containers Docker
- Simulação local da AWS com LocalStack

---

# ☁️ Arquitetura

```text
Cliente
   ↓
Spring Boot API
   ↓
┌───────────────┐
│ LocalStack S3 │
└───────────────┘
   ↓
PostgreSQL
```

---

# 🚀 Como executar o projeto

## Pré-requisitos

- Docker
- Docker Compose

---

## Clonar repositório

```bash
git clone https://github.com/ivanamiranda/storage-api.git
```

```bash
cd storage-api
```

---

## Subir aplicação

```bash
docker compose up --build
```

Aplicação disponível em:

```text
http://localhost:8080
```

---

# 📂 Endpoint disponível

## Upload de arquivos

### POST

```http
POST /api/files/upload
```

### Body (form-data)

| Key  | Type |
|------|------|
| file | File |

---

# ✅ Exemplo de resposta

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

# 📚 Conceitos aplicados

- REST API
- Upload Multipart
- Integração com AWS S3
- Persistência com JPA/Hibernate
- Containers Docker
- Arquitetura Backend
- Cloud Simulation
- Dependency Injection

---

# 🎯 Melhorias futuras

- Download de arquivos
- Deleção de arquivos
- Swagger/OpenAPI
- Autenticação JWT
- Deploy AWS
- Testes automatizados
- CI/CD com GitHub Actions

---

# 👩‍💻 Desenvolvido por

Ivana Miranda

- LinkedIn: www.linkedin.com/in/ivana-miranda-736b4022
- GitHub: https://github.com/ivanamiranda

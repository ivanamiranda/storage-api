# ☁️ Storage Cloud API

API REST desenvolvida com Kotlin + Spring Boot para upload e gerenciamento de arquivos utilizando AWS S3 e persistência de metadados em PostgreSQL.

O projeto simula uma arquitetura cloud real utilizando Docker + LocalStack, permitindo desenvolvimento e testes locais sem necessidade de uma conta AWS.

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

### Documentação
- Swagger / OpenAPI

### Ferramentas
- Git
- GitHub
- Gradle

---

## 📌 Funcionalidades

- Upload de arquivos
- Armazenamento de arquivos em S3
- Persistência de metadados no PostgreSQL
- API REST documentada com Swagger
- Containers Docker
- Simulação local da AWS com LocalStack

---

## ☁️ Arquitetura

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
## 📁 Estrutura do projeto

```text
src
└── main
    └── kotlin
        └── com.ivanamiranda.storage_api
            ├── controller
            │   └── FileController.kt
            │
            ├── service
            │   └── FileService.kt
            │
            ├── repository
            │   └── FileRepository.kt
            │
            ├── model
            │   └── FileMetadata.kt
            │
            ├── config
            │   └── S3Config.kt
            │
            └── StorageApiApplication.kt
```

### Organização das camadas

| Camada | Responsabilidade |
|---|---|
| Controller | Receber requisições HTTP |
| Service | Regras de negócio |
| Repository | Acesso ao banco de dados |
| Model | Entidades e objetos persistidos |
| Config | Configurações AWS/S3 |
---

## 🚀 Como executar o projeto

### Pré-requisitos

- Docker
- Docker Compose
- Java 17

---

### Clonar repositório

```bash
git clone https://github.com/ivanamiranda/storage-api.git
cd storage-api
```

---

### Subir aplicação

```bash
docker compose up --build
```

---

### Aplicação disponível em

| Serviço | URL |
|---|---|
| API | http://localhost:8080 |
| Swagger | http://localhost:8080/swagger-ui/index.html |

---

## 📂 Endpoints

### Upload de arquivos

```http
POST /api/files/upload
```

### Request

multipart/form-data

| Campo | Tipo |
|---|---|
| file | File |

---

## ✅ Exemplo de resposta

```json
{
  "id": 1,
  "fileName": "arquivo.txt",
  "fileType": "text/plain",
  "s3Key": "uuid_arquivo.txt",
  "uploadDate": "2026-05-21T02:16:29"
}
```

---

## 📚 Conceitos aplicados

- REST API
- Upload Multipart
- AWS S3 Integration
- Persistência com JPA/Hibernate
- Dockerização
- Arquitetura Backend
- Cloud Computing
- Dependency Injection
- Documentação com Swagger/OpenAPI
- Versionamento com Git

---

## 🎯 Melhorias futuras

- Download de arquivos
- Deleção de arquivos
- Autenticação JWT
- Testes automatizados
- CI/CD com GitHub Actions
- Deploy AWS
- Monitoramento e observabilidade

---

## 👩‍💻 Desenvolvido por

Ivana Miranda

- LinkedIn: www.linkedin.com/in/ivana-miranda-736b4022
- GitHub: https://github.com/ivanamiranda

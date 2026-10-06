# Patient Management

A learning project built with **Java 21** and **Spring Boot** to practice backend structure, REST APIs, persistence, validation, and service separation.

## Current Implementation

The repository currently contains two modules:

- **patient-service** — the main implemented REST service for patient management
- **billing-service** — a separate service that is still being developed

## Patient Service

The patient service currently includes:

- Create, read, update, and delete patient operations
- Request DTOs and response DTOs
- Input validation
- Duplicate-email checks
- Global exception handling
- Spring Data JPA persistence
- PostgreSQL runtime support
- H2 support
- OpenAPI / Swagger documentation
- Dockerfile for containerizing the patient service

## Tech Stack

- Java 21
- Spring Boot 3
- Spring Web
- Spring Data JPA
- PostgreSQL
- H2
- Bean Validation
- Lombok
- OpenAPI / Swagger
- Maven

## Project Structure

```text
patient-management/
├── patient-service/
│   ├── controller/
│   ├── dto/
│   ├── exception/
│   ├── mapper/
│   ├── model/
│   ├── repository/
│   └── service/
│
└── billing-service/
```

## Patient Service Flow

```text
HTTP Request
    |
    v
Controller
    |
    v
Service
    |
    v
Repository
    |
    v
Database
```

## Billing Service Status

The repository also contains a separate billing-service module. Some gRPC-related code and configuration exist inside that module, but the complete patient-to-billing integration is not yet implemented.

Because of that, this repository should be viewed as a **work-in-progress learning project**, not as a completed microservices platform.

## What I Practiced

- Structuring a Spring Boot backend into controller, service, repository, and DTO layers
- Mapping between entities and DTOs
- Validating incoming requests
- Handling application exceptions centrally
- Working with JPA repositories
- Building REST CRUD operations
- Separating responsibilities into different services

## Purpose

The purpose of this repository is to strengthen my understanding of Spring Boot backend development and gradually expand it into a multi-service application.

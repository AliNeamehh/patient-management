# Patient Management Microservices System

A **learning-focused Spring Boot microservices project** that simulates a patient management and healthcare billing platform.

The repository explores how multiple backend services can communicate using REST, gRPC, and Kafka, while authentication is handled with Spring Security and JWT.

> This project is primarily for learning and practicing microservices and distributed-system concepts.

## Architecture

| Service | Responsibility |
|---|---|
| `patient-service` | Patient CRUD, validation, secured endpoints, Kafka producer, gRPC client |
| `billing-service` | Billing-related gRPC service |
| `analytics-service` | Consumes patient events from Kafka |
| `auth-service` | User login, JWT generation, and token validation |
| `api-gateway` | Request routing and JWT filtering |
| `infrastructure` | Cloud infrastructure templates and local infrastructure setup |

## Technologies Explored

- Java
- Spring Boot 3
- Spring Security
- JWT authentication
- REST APIs
- gRPC
- Kafka
- Docker and Docker Compose
- OpenAPI / Swagger
- AWS CloudFormation concepts
- LocalStack
- JUnit and Testcontainers are present in the project as part of the learning implementation

## Request Flow

```text
Client
  |
  v
API Gateway
  |
  +--> Auth Service
  |
  +--> Patient Service
          |
          +--> Billing Service (gRPC)
          |
          +--> Kafka
                 |
                 v
          Analytics Service
```

## What I Practiced

- Structuring services around separate responsibilities
- Securing endpoints with JWT
- Service-to-service communication using gRPC
- Event-driven communication using Kafka
- Containerizing services with Docker
- Understanding API Gateway responsibilities
- Exploring infrastructure-as-code and local cloud simulation

## Running the Project

Because this repository contains multiple services and infrastructure components, start by reviewing the configuration for each service and the Docker Compose setup.

Typical local development flow:

```bash
docker compose up
```

Then run or inspect the individual Spring Boot services as needed.

## Purpose

The goal of this repository is to build practical understanding of microservices architecture and the trade-offs involved in distributed backend systems.

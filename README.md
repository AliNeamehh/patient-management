# 🏥 Patient Management Microservices System

This project implements a full **Spring Boot Microservices Architecture** that simulates a real-world patient management and healthcare billing system. It includes modular services with modern features such as **gRPC**, **Kafka**, **JWT Authentication**, **Dockerized Deployment**, and **Cloud Infrastructure** with **AWS CloudFormation**.

---

## 🔧 Technologies Used

- **Spring Boot 3** (REST APIs, Controllers, Services)
- **gRPC** (Service-to-service communication)
- **Kafka** (Event-driven architecture)
- **Spring Security + JWT** (Authentication & Authorization)
- **Docker + Docker Compose**
- **CloudFormation (IaC)** for provisioning AWS services
- **LocalStack** for local AWS simulation
- **JUnit** + **TestContainers** for integration testing
- **OpenAPI (Swagger)** for API documentation

---

## 🧱 Microservices Overview

| Service          | Description                                                                 |
|------------------|-----------------------------------------------------------------------------|
| `patient-service`| CRUD for patients, validation, JWT-secured endpoints, Kafka producer, gRPC  |
| `billing-service`| gRPC server for billing integration                                         |
| `analytics-service`| Kafka consumer for analytics on patient events                          |
| `auth-service`   | Handles user login, JWT generation and validation                           |
| `api-gateway`    | Routes requests, applies JWT filters, serves Swagger docs                   |
| `infrastructure` | AWS VPC, RDS, ECS, MSK, Load Balancer (CloudFormation templates)            |

---

## 🚀 How to Run

```bash

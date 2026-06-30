# AWS Architecture Recommendation Engine

## Overview

AWS Architecture Recommendation Engine is a full-stack application that recommends AWS architecture patterns based on user requirements.

Users answer a series of application-related questions such as:

- High Availability required?
- Expected traffic volume?
- Number of users?
- Database type?
- File upload/download requirements?
- Monitoring requirements?
- Notification services required?

Based on the inputs provided, the application generates an AWS architecture recommendation and explains the AWS services that best fit the use case.

---

## Architecture

Frontend (React)
        ↓
Spring Boot REST API
        ↓
Architecture Recommendation Engine
        ↓
AWS Architecture Response

---

## Technology Stack

### Frontend
- React
- HTML5
- CSS3
- JavaScript

### Backend
- Java 17
- Spring Boot
- REST APIs
- Maven

### DevOps & Cloud
- Git
- GitHub
- Docker (Upcoming)
- AWS (Upcoming Deployment)

---

## Features

- Interactive questionnaire
- Architecture recommendation generation
- AWS service recommendations
- Clean and responsive UI
- Extensible recommendation rules

---

## Sample Inputs

| Question | Example |
|-----------|---------|
| High Availability | Yes |
| High Traffic | Yes |
| Users | 100,000 |
| Database | Relational |
| File Uploads | Yes |
| Notifications | Yes |

---

## Sample Recommendation

Recommended Architecture:

- Application Load Balancer (ALB)
- Auto Scaling Group
- EC2 Instances (Multi-AZ)
- Amazon RDS Multi-AZ
- Amazon S3
- Amazon CloudFront
- Amazon Route 53
- Amazon CloudWatch
- Amazon SNS

Benefits:

- High Availability
- Scalability
- Fault Tolerance
- Cost Optimization
- Monitoring and Observability

---

## Project Structure

```text
aws-architecture-recommendation-engine
│
├── frontend
│   ├── src
│   └── public
│
├── backend
│   ├── src
│   └── pom.xml
│
├── screenshots
├── README.md
└── .gitignore
```

## Running Locally

### Backend

```bash
cd backend
mvn spring-boot:run
```

Backend runs on:

```text
http://localhost:8080
```

### Frontend

```bash
cd frontend
npm install
npm start
```

Frontend runs on:

```text
http://localhost:3000
```

---

## Future Enhancements

- Rule Engine Implementation
- Docker Containerization
- AWS Deployment
- Architecture Diagram Generation
- Cost Estimation
- AI-Powered Recommendations
- Terraform Infrastructure Deployment

---

## Learning Objectives

This project was created to strengthen hands-on experience with:

- React Development
- Spring Boot APIs
- Git & GitHub
- Docker
- AWS Architecture Design
- Cloud-Native Application Development

---

## Author

Dipti Uppal

AWS Certified Solutions Architect – Associate

Portfolio:
https://diptiuppal.com

GitHub:
https://github.com/uppaldipti
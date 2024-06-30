# E-Commerce Project

## Overview
This project is an e-commerce application developed as part of a bootcamp. It includes features such as user management, product management, order management, cart management, payment processing, real-time notifications, and more.

## Technologies Used
### Backend
- Java 22
- Spring Boot 3.3.1
- PostgreSQL
- Prometheus Micrometer
- Zipkin
- Kafka
- RabbitMQ
- Redis
- Elasticsearch
- Swagger (Springfox)
- Lombok
- Json Web Token (JJWT)
- Testcontainers
- JUnit 5

### Frontend
- React
- Tailwind CSS
- Redux Toolkit
- React Router DOM
- Axios
- Headless UI
- Heroicons

## Features
- User Management: Register, login, profile update, role management
- Product Management: Add, update, delete products and categories
- Order Management: Create, update, track orders
- Cart Management: Add, remove, update cart items
- Payment System: Process and track payments
- Favorites and Wish List: Add and manage favorite products
- Stock Management: Manage product stock and alerts
- Discount and Coupon Management: Create and manage discount codes
- Real-Time Notifications: Notify users about order status and campaigns
- Multi-Language and Currency Support: Support for multiple languages and currencies
- Real-Time Cart Analysis: Provide personalized recommendations based on cart items
- Monitoring and Tracing: Prometheus, Grafana, Zipkin integration
- CI/CD and Deployment: Docker, Docker Compose

## Installation and Running
### Prerequisites
- Docker
- Docker Compose

### Steps
1. Clone the repository:
    ```sh
    git clone https://github.com/PehlivanMert/e-commerce-project.git
    ```
2. Navigate to the project directory:
    ```sh
    cd e-commerce-project
    ```
3. Build and run the application using Docker Compose:
    ```sh
    docker-compose up --build
    ```
4. Access the application:
    - Backend: `http://localhost:8080`
    - Frontend: `http://localhost:3000`

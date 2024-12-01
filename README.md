# Fitness Tracker Application

Welcome to the Fitness Tracker Application! This project is designed to help users plan and track their fitness workouts effectively.

## Technologies Used

### Backend
- **Java**: The primary programming language used for backend development.
- **Spring Boot**: A powerful framework for building web applications and microservices. It simplifies the setup and development process.
- **RESTful API**: The architectural style used for communication between the frontend and backend. It ensures scalability and flexibility.
- **GraphQL**: Utilized for efficient data querying and manipulation.
- **Hibernate**: An Object-Relational Mapping (ORM) tool that simplifies database interactions.
- **PostgreSQL**: The relational database management system used for storing data.

### Frontend
- **Angular**: The framework used for building the dynamic and interactive user interface.
- **HTML & SCSS**: Used for structuring and styling the frontend.

### Testing and Documentation
- **JUnit**: A testing framework used for ensuring the correctness of the code.
- **Postman**: A tool used for testing and documenting the RESTful API endpoints.

## Docker Setup

The backend part of this application can be containerized using Docker. Follow the steps below to build and run the application using Docker:

1. **Build the Docker Image**:
    ```sh
    docker build -t fitness-app .
    ```
2. **Build the Service with Two Containers**:
    ```sh
    docker-compose build
    ```
3. **Run the Spring Boot Application**:
    ```sh
    docker-compose up
    ```
4. **Stop and Remove Containers**:
    ```sh
    docker-compose down
    ```


## Conclusion

The Fitness Tracker Application is built using a robust technology stack to ensure scalability, performance, and ease of use. By leveraging Spring Boot, Angular, and Docker, we have created a modern and efficient application for fitness enthusiasts. Happy tracking!

---

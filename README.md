# Uber Backend Project

This project is a backend implementation of an Uber-like ride-booking application using **Spring Boot**. It allows users to book rides online, providing a complete flow from ride requests by riders to ride acceptance by drivers, and payment processing via wallets.

## **Project Overview**

### **Key Features:**
- **Authentication & Authorization:**
  - Implemented using Spring Security with JWT-based authentication.
  
- **Ride Booking Workflow:**
  - Rider requests a ride.
  - Available drivers are located using a **strategy design pattern**, optimizing ride allocation and reducing waiting times by up to 50%.
  - Driver accepts the ride.
  - Payment is processed using an integrated wallet system.
  
- **Ride Status Management:**
  - Tracks ride progress through statuses such as `STARTED`, `ONGOING`, `COMPLETED`, and `CANCELLED`.
  - Managed using enums to maintain clear ride state transitions.
  
- **Admin Panel:**
  - Provides control over riders and drivers.
  - View and manage rides and payments.
  - Role-based access control (RBAC) using roles like `ADMIN`, `RIDER`, and `DRIVER`.
  - Secure access for admin users with elevated privileges.

- **Payment System:**
  - Supports multiple payment methods such as `CASH` and `WALLET`.
  - Payment processing implemented using the **Strategy Design Pattern**.
  - Payment tracking and status updates.

- **Logging Mechanism:**
  - Application-wide logging using SLF4J for debugging and monitoring.

- **Email Notification System:**
  - Automated email notifications sent to users for ride confirmations, cancellations, and payment receipts.
  - Implemented using Spring Boot's email capabilities via `JavaMailSender`.

- **RESTful APIs with OpenAPI Documentation:**
  - API documentation available at `http://localhost:8080/swagger-ui/index.html` for easy testing and integration.

- **Database Integration:**
  - PostgreSQL used for data persistence.
  - JPA and Hibernate Spatial for geolocation-based operations.

---

## **Spring Boot Concepts Covered**

The project incorporates the following key Spring Boot concepts:

1. **Spring Boot Starter Web:**
   - Develop RESTful APIs and handle HTTP requests efficiently.

2. **Spring Boot Starter Security:**
   - Secure endpoints with JWT authentication and authorization.

3. **Spring Boot Starter Data JPA:**
   - Perform CRUD operations using JPA and PostgreSQL.

4. **Spring Boot Starter Actuator:**
   - Monitor and manage application health and performance.

5. **ModelMapper:**
   - Simplify object mapping between DTOs and entities.

6. **Hibernate Spatial:**
   - Handle geolocation-based queries efficiently.

7. **Spring Boot Email:**
   - Send transactional emails using `JavaMailSender`.

8. **Exception Handling:**
   - Implemented using `@ControllerAdvice` for centralized exception management.

9. **Logging:**
   - Implemented using SLF4J to log key actions and errors for better tracking.

---

## **System Design Overview**

### **Database Schema**

#### Entities:
1. **Rider:** Stores user profile, ride history, and wallet balance.
2. **Driver:** Stores driver profile, availability status, and vehicle details.
3. **Ride:** Tracks ride requests, status, and payment details.
4. **Wallet:** Handles balance and transaction history.
5. **User:** Manages login credentials and roles (Admin, Rider, Driver).
6. **Payment:** Handles multiple payment methods and tracks transactions.

### **Flow of the Backend System**

1. **User Authentication:**
   - Riders and drivers authenticate using JWT-based security.

2. **Ride Request Flow:**
   - Rider sends a ride request via API.
   - A suitable driver is identified using the **strategy design pattern.**
   - Notification is sent to the driver.

3. **Ride Acceptance:**
   - Driver accepts the ride request.
   - Ride status is updated in the database.

4. **Ride Status Updates:**
   - As the ride progresses, statuses are updated from `STARTED` to `ONGOING` and eventually `COMPLETED` or `CANCELLED`.
   - Ride status transitions are handled within the business logic.

5. **Payment Handling:**
   - Rider's wallet balance is deducted.
   - Payment records are stored.

6. **Admin Monitoring:**
   - Admin can view and manage all ride and payment details.
   - Admin has elevated privileges for managing users and ride data.

---

## **Design Patterns Used**

1. **Strategy Design Pattern:**
   - Used to dynamically select the best ride-matching algorithm based on factors like driver availability, distance, and rider preferences.
   - Also used for payment processing to support multiple payment methods.

2. **Singleton Pattern:**
   - Ensures a single instance of services like ride-matching and payment processing.

3. **Factory Pattern:**
   - Used to instantiate JWT services and location utilities dynamically.

---

## **Project Setup**

### **Prerequisites**
- Java 11 or higher
- Maven
- PostgreSQL Database

### **Installation Steps**
1. Clone the repository:
   ```bash
   git clone https://github.com/KAMRANKHANALWI/Uber-Backend.git
   ```
2. Configure database settings in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/uberdb
   spring.datasource.username=yourusername
   spring.datasource.password=yourpassword
   ```
3. Build and run the project:
   ```bash
   mvn spring-boot:run
   ```

---

## **API Documentation**

The OpenAPI documentation for the project can be accessed at:
```
http://localhost:8080/swagger-ui/index.html
```
This provides a user-friendly interface to test all available API endpoints.

---

## **Contributing**
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a feature branch.
3. Commit changes and submit a pull request.

---

## **License**
This project is licensed under the MIT License.




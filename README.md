# Spring & Hibernate Tutorial

Projects from the Udemy course **"Spring & Hibernate for Beginners"**.

## Technologies

- Java 8
- Spring Framework / Spring Boot
- Spring MVC, Spring Security, Spring Data JPA, Spring REST
- Hibernate / JPA
- Thymeleaf
- MySQL
- Maven

## Project Structure

| Module | Description |
|---|---|
| `01-spring-boot-demo` | Basic Spring Boot application |
| `02-dev-tools-demo` | Spring Boot DevTools |
| `03-actuator-demo` | Spring Boot Actuator |
| `04-command-line-demo` | CommandLineRunner |
| `05-properties-demo` | Custom application.properties |
| `hibernate-tutorial` | Basic Hibernate CRUD |
| `hb_01-one-to-one-uni` | Hibernate one-to-one (unidirectional) |
| `hb_02-one-to-one-bi` | Hibernate one-to-one (bidirectional) |
| `hb_03-one-to-many` | Hibernate one-to-many (bidirectional) |
| `hb_04-one-to-many-uni` | Hibernate one-to-many (unidirectional) |
| `hb_05-many-to-many` | Hibernate many-to-many |
| `hb-eager-vs-lazy-demo` | Eager vs lazy loading |
| `21-hibernate-with-service-demo` | Hibernate + Service layer |
| `22-jpa-cruddemo` | JPA CRUD |
| `23-spring-data-jpa-demo` | Spring Data JPA |
| `24-spring-data-rest-cruddemo` | Spring Data REST |
| `cruddemo` | Spring Boot CRUD REST API |
| `spring-demo-one` | Spring IoC / Dependency Injection (XML) |
| `spring-demo-annotations` | Spring DI with annotations |
| `spring-mvc-demo` | Spring MVC |
| `spring-rest-demo` | Spring REST |
| `spring-crm-rest-demo` | Spring REST CRM |
| `spring-security-demo-01` – `09` | Spring Security (login, roles, JDBC, BCrypt) |
| `mycoolwebapp` / `mycoowebapp` | Spring MVC web app |
| `30-thymeleafdemo-helloworld` | Thymeleaf hello world |
| `31-thymeleafdemo-helloworld-css` | Thymeleaf + Bootstrap CSS |
| `32-thymeleafdemo-employees-list` | Thymeleaf — employee list (static) |
| `33-thymeleafdemo-employees-list-css` | Thymeleaf — employee list + CSS |
| `34-thymeleafdemo-employees-list-db` | Thymeleaf — employee list from DB |
| `35-thymeleafdemo-employees-add` | Thymeleaf — add employee |
| `36-thymeleafdemo-employees-update` | Thymeleaf — update employee |
| `37-thymeleafdemo-employees-delete` | Thymeleaf — delete employee (full CRUD) |

## Requirements

- JDK 8+
- Maven 3.6+
- MySQL 8.x
- Tomcat 9.x (for non-Boot WAR modules)

## Database Setup

Most modules require a running MySQL instance. Create the database and user:

```sql
CREATE DATABASE IF NOT EXISTS employee_directory;
CREATE USER 'hbstudent'@'localhost' IDENTIFIED BY 'hbstudent';
GRANT ALL PRIVILEGES ON employee_directory.* TO 'hbstudent'@'localhost';
```

For Spring Security JDBC demos, run the SQL scripts located in each module's `src/main/resources/` directory.

## Running Spring Boot Modules

```bash
cd <module-directory>
./mvnw spring-boot:run
```

Application starts at `http://localhost:8080`.

## Running WAR Modules (non-Boot)

Build the WAR and deploy to Tomcat:

```bash
cd <module-directory>
mvn package
# copy target/*.war to Tomcat's webapps/
```

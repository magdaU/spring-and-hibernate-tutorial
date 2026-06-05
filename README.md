# Spring & Hibernate Tutorial

Repository contains hands-on projects from the Udemy course **"Spring & Hibernate for Beginners"** by Chad Darby.
The original course material targeted Java 8 and older Spring versions. This repository has been progressively upgraded
to modern Java and Spring ecosystem versions to keep the code relevant and buildable on current tooling.

## About the Project

Each module is a standalone Maven project demonstrating a specific concept from the Spring and Hibernate ecosystem.
The modules progress from basic Spring IoC/DI through Hibernate ORM, Spring MVC, Spring Security, REST APIs,
and Thymeleaf-based web UIs. There is no shared parent POM — each module is built independently.

## Tech Stack

| Technology | Version | Notes |
|---|---|---|
| Java | 17 | LTS release; minimum required by Spring 6.x |
| Spring Framework | 6.1.x | Latest 6.x line; requires Jakarta EE 9+ |
| Spring Boot | 3.x | Used in Spring Boot modules |
| Spring Security | 6.x | Jakarta EE namespace |
| Spring Data JPA | 3.x | Used in JPA/REST modules |
| Hibernate ORM | 6.x | JPA 3.1 provider |
| Thymeleaf | 3.x | Server-side templating |
| Jakarta EE | 9+ | `jakarta.*` namespace (replaces legacy `javax.*`) |
| MySQL | 8.x | Relational database for persistence demos |
| Maven | 3.6+ | Build tool; each module has its own `pom.xml` |
| Tomcat | 10.x | Required for WAR modules using Jakarta EE 9+ |

## Why the Upgrade

The original course code was written for Java 8, Spring 5.x, and the legacy `javax.*` servlet namespace (Java EE).
These versions are end-of-life or approaching it. The upgrade goals are:

- **Java 17** — LTS release with long-term vendor support; required by Spring 6.x
- **Spring 6.x / Spring Boot 3.x** — active maintenance branch with security patches and new features
- **Jakarta EE 9+ (`jakarta.*` namespace)** — Spring 6.x dropped support for the legacy `javax.*` namespace; all servlet, JSP and JSTL dependencies must use `jakarta.*` coordinates
- **Tomcat 10.x** — first Tomcat release supporting Jakarta EE 9+; Tomcat 9.x only supports the legacy `javax.*` namespace
- **JUnit 4.13.2** — patched version fixing known vulnerabilities in earlier 4.x releases

## Project Structure

| Module | Description |
|---|---|
| `01-spring-boot-demo` | Basic Spring Boot application |
| `02-dev-tools-demo` | Spring Boot DevTools — auto-restart on change |
| `03-actuator-demo` | Spring Boot Actuator — health and metrics endpoints |
| `04-command-line-demo` | CommandLineRunner — run logic on startup |
| `05-properties-demo` | Custom `application.properties` and `@Value` |
| `hibernate-tutorial` | Basic Hibernate CRUD |
| `hb_01-one-to-one-uni` | Hibernate one-to-one (unidirectional) |
| `hb_02-one-to-one-bi` | Hibernate one-to-one (bidirectional) |
| `hb_03-one-to-many` | Hibernate one-to-many (bidirectional) |
| `hb_04-one-to-many-uni` | Hibernate one-to-many (unidirectional) |
| `hb_05-many-to-many` | Hibernate many-to-many |
| `hb-eager-vs-lazy-demo` | Eager vs lazy loading |
| `21-hibernate-with-service-demo` | Hibernate + Service layer pattern |
| `22-jpa-cruddemo` | JPA CRUD with `EntityManager` |
| `23-spring-data-jpa-demo` | Spring Data JPA repositories |
| `24-spring-data-rest-cruddemo` | Spring Data REST — auto-generated REST endpoints |
| `cruddemo` | Spring Boot CRUD REST API |
| `spring-demo-one` | Spring IoC / Dependency Injection (XML config) |
| `spring-demo-annotations` | Spring DI with annotations |
| `spring-demo-aop*` | Spring AOP — aspects, pointcuts, advice types |
| `spring-mvc-demo` | Spring MVC with JSP views |
| `spring-rest-demo` | Spring REST — JSON responses, exception handling |
| `spring-crm-rest-demo` | Spring REST CRM application |
| `spring-security-demo-01` | Spring Security — base app (no security) |
| `spring-security-demo-02` | Spring Security — HTTP Basic authentication |
| `spring-security-demo-03` | Spring Security — custom login form |
| `spring-security-demo-04` | Spring Security — Bootstrap login form |
| `spring-security-demo-05` | Spring Security — logout |
| `spring-security-demo-06` | Spring Security — CSRF protection |
| `spring-security-demo-07` | Spring Security — user roles and access control |
| `spring-security-demo-08` | Spring Security — JDBC authentication (plaintext) |
| `spring-security-demo-09` | Spring Security — JDBC authentication (BCrypt) |
| `mycoolwebapp` / `mycoowebapp` | Spring MVC web application |
| `web-customer-tracker` | Spring MVC + Hibernate customer CRUD app |
| `web-customer-tracker-aop` | Customer tracker with AOP logging |
| `30-thymeleafdemo-helloworld` | Thymeleaf hello world |
| `31-thymeleafdemo-helloworld-css` | Thymeleaf + Bootstrap CSS |
| `32-thymeleafdemo-employees-list` | Thymeleaf — employee list (static data) |
| `33-thymeleafdemo-employees-list-css` | Thymeleaf — employee list + CSS |
| `34-thymeleafdemo-employees-list-db` | Thymeleaf — employee list from database |
| `35-thymeleafdemo-employees-add` | Thymeleaf — add employee |
| `36-thymeleafdemo-employees-update` | Thymeleaf — update employee |
| `37-thymeleafdemo-employees-delete` | Thymeleaf — delete employee (full CRUD) |

## Changelog

### 2026-06-05 — `spring-security-demo-01-base-app`
- Upgraded Spring Framework from 5.3.39 to **6.1.14**
- Changed Java compiler target from 21 to **17**
- Replaced `javax.servlet` dependencies with `jakarta.servlet` equivalents (Spring 6.x requires Jakarta EE 9+)
- Added `<failOnMissingWebXml>false</failOnMissingWebXml>` to maven-war-plugin (annotation-based config, no `web.xml`)

## Requirements

- JDK 17+
- Maven 3.6+
- MySQL 8.x
- Tomcat 10.x (for non-Boot WAR modules)

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

Build the WAR and deploy to Tomcat 10.x:

```bash
cd <module-directory>
mvn clean package
# copy target/*.war to Tomcat's webapps/
```

## Changelog

### 2026-06-05

**`spring-security-demo-01-base-app`**
- Upgraded Spring Framework: `5.3.39` → `6.1.14`
- Changed Java compiler target: `17` → `21` (aligned with all other modules in the repository)
- Previously temporarily set to `17`; upgraded to `21` as Spring 6.1.x officially supports Java 21 (LTS)
- Replaced legacy `javax.servlet` dependencies with Jakarta EE 9+ equivalents:
  - `javax.servlet:javax.servlet-api:3.1.0` → `jakarta.servlet:jakarta.servlet-api:6.0.0`
  - `javax.servlet.jsp:javax.servlet.jsp-api:2.3.1` → `jakarta.servlet.jsp:jakarta.servlet.jsp-api:3.1.0`
  - `javax.servlet:jstl:1.2` → `jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:3.0.0`
- Added `<failOnMissingWebXml>false</failOnMissingWebXml>` to `maven-war-plugin` (annotation-based config, no `web.xml`)

**All legacy Spring MVC modules**
- Bumped JUnit: `3.8.1` → `4.13.2`

**Spring REST modules (`spring-rest-demo`, `spring-crm-rest-demo`)**
- Upgraded to Java 21 compiler target

**Multiple modules** (`cruddemo`, `mycoolwebapp`, `mycoowebapp`, security copies)
- Upgraded Spring Framework, Spring Security, and Java compiler settings

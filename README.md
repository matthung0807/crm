# crm
Simple CRM project

## Tools/Framework/Library
- Java 11
- Maven
- Spring Boot 2 
- Spring Security 5
- Spring Data JPA
- H2 Database
- Swagger UI
- Lombok
- Log4j2
- Git
- IntelliJ IDEA
- Postman

## Authentication/Authorizaiton
### Basic Auth
 Basic Authentication credentials is required within Request Headers for every request. 

### Test account/password:
- superuser/123
- manager/123
- operator/123

## Swagger UI
http://localhost:8080/crm/swagger-ui.html

## Implementation explanation
- Use Spring Boot framework to build backend REST API project. 
- Use Spring Data JPA to map entity class to table `Company` and `Client` for easy accessing. 
- Classic mainstream Controller -> Service -> Dao -> Repository multi-layer one-way structure pattern.
- Use Java lambda syntax, builder pattern to make code more fluent style.
- Use Spring Security to deal login and multi-role authorization feature. Use Basic Authentication due to time limit.
- Use `@ControllerAdvice` to deal all `Exception` throwed, preventing internal error stack trace message send out.
- Use Lombok to reduce boilerplate code, making development process easier, faster and more comfortable.
- Use simple Class extends to reduce boilerplate code.
- Unify API response style by well-defined object and response messages for success, fail, error.
- HTTP method POST, GET, PATCH, DELETE for CRUD API 
- Clean Code, meaningful naming, avoid duplicate code, fewer lines of the method, guard clause.
- Well-managed and intuitive package design.


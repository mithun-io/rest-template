# Spring Boot MVC RestClient Project

## Project Description
I created a **Spring Boot MVC project**.  
I used **Thymeleaf** for the UI layer.  
I consumed **external REST APIs using RestClient**.  
Initially, I used **RestTemplate**, and later migrated the project to **RestClient**.

---

## External APIs Used

**Users API**  
https://api.mydummyapi.com/users  

**Products API**  
https://dummyjson.com/products  

The data fetched from these APIs is displayed in **HTML tables** using Thymeleaf.

---

## Dependencies Added
First, I added the following dependencies:
- Spring DevTools  
- Spring Web  

No database-related dependencies were added, such as **MySQL** or **Spring Data JPA**.

---

## Changing the Embedded Server
To change the default embedded server, I excluded **Tomcat** from the Spring Web MVC dependency and added **Jetty** as the server.

### Web MVC Dependency with Tomcat Exclusion
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webmvc</artifactId>
    <exclusions>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
        </exclusion>
    </exclusions>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jetty</artifactId>
</dependency>

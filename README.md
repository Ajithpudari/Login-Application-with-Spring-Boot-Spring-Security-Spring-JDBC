# Login-Application-with-Spring-Boot-Spring-Security-Spring-JDBC
### Spring Security: 
Spring Security is a framework for securing Java-based applications at various layers with great flexibility

and customizability. Spring Security provides authentication and authorization support against database

authentication, LDAP, form authentication, JA-SIG central authentication service, Java Authentication and

Authorization Service (JAAS), and many more. 

 Login application using Spring Boot + Spring Security + JDBC + Thymeleaf and explain the operating principle of Spring Security.
 
 ### Spring securtiy We need to add Spring Security Dependency in pom.Xml
 
 ```
 <dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>
 ```
 ### Configure DataSource
 
 ```
 spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/security
spring.datasource.username=root
spring.datasource.password=root
```

### enable Web security Service 

WebSecurityConfig class is used to configure security for the application. It is annotated by @Configuration. This annotation tells the Spring that it is a configuration class and therefore, it will be analyzed by the Sping at the time when the application runs.

```
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

}
```
Spring Security uses the UserDetailsService interface, which contains the

loadUserByUsername(String username) method to look up UserDetails for a given username. 

The UserDetails interface represents an authenticated user object and Spring Security provides an out-of-thebox implementation of org.springframework.security.core.userdetails.User.

```
  @Service
    public class UserDetailsServiceImpl implements UserDetailsService {
    }



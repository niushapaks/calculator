# Calculator
Calculator Kotlin Spring-Boot api containerized with Docker

# Build
```
gradle clean build bootJar
docker build . -t calculator
```

# Deploy
`docker run -p 3080:8080 calculator`

# Open
http://localhost:3080/calculator/api/

# Resources
## Kotlin Reference
https://kotlinlang.org/docs/reference/
## Spring Boot Kotlin Tutorial
- http://spring.io/guides/tutorials/spring-boot-kotlin/
- https://kotlinlang.org/docs/tutorials/spring-boot-restful.html
- https://blog.zenika.com/2018/04/05/ma-premiere-application-spring-boot-2-avec-kotlin/
## Docker Documentation
https://docs.docker.com/

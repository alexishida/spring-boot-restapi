# Spring Boot Rest API - Example

This example provides a Rest API using Spring Boot with HTTP methods like *POST, GET, DELETE* and *PUT*.

## Maven Dependencies

* SpringBoot 1.5.3
* MySQL
* JPA
* Hibernate


## Database Configuration

### Start Mariadb on Docker

`docker run -d \ --restart=always \ --name mariadb \ -p 3306:3306 \ -v /etc/localtime:/etc/localtime:ro \ -v      /storage/mariadb:/var/lib/mysql \ -e MYSQL_ROOT_PASSWORD=root \ mariadb:latest`

### Start PhpAdmin on Docker

`docker run --name myadmin -d \ --restart=always \ -v /etc/localtime:/etc/localtime:ro \ --link mariadb:db  \ -p 8181:80 \ phpmyadmin/phpmyadmin*`

## Configuration

|Spring Boot Configuration | Class or Java property files  |
|--------------------------|---|
|The Main Class | [EmployeeApplication](https://github.com/renancetauro/SpringBootRestExample/blob/master/src/main/java/employee/EmployeeApplication.java) |
|Properties Files | [application.properties](https://github.com/renancetauro/SpringBootRestExample/blob/master/src/main/resources/application.properties)

## Task List
``` - [x] SpringBoot
    - [x] Database
    - [ ] Kafka
 ```

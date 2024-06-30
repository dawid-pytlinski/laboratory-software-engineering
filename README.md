# Spring Maven Project

This project demonstrates setting up a Spring-based web application using Maven. It includes configuration for various dependencies like Spring Core, Hibernate, HSQLDB, and others. The goal is to provide a practical example of integrating these technologies and managing a project through version control.

## Features

- **Spring Framework**: Core framework for building web applications.
- **Hibernate ORM**: Object-relational mapping and database operations.
- **HSQLDB**: In-memory database for quick setup and testing.
- **Apache Commons DBCP**: Database connection pooling.
- **jBCrypt**: Password encryption handling.
- **Commons BeanUtils**: Utility library for Java Beans.

## Getting Started

### Prerequisites

- Java 8
- Maven
- Git
- Visual Studio Code (VSCode)

### Setup

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/your-repository.git
    cd your-repository
    ```

2. **Open the project in VSCode**:
    - Open Visual Studio Code.
    - Select `File -> Open Folder...`.
    - Navigate to the cloned repository and open it.

3. **Add Dependencies**:
    Ensure the following dependencies are in the `pom.xml` file:
    ```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>4.3.8.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>5.2.10.Final</version>
        </dependency>
        <dependency>
            <groupId>org.hsqldb</groupId>
            <artifactId>hsqldb</artifactId>
            <version>2.4.1</version>
        </dependency>
        <dependency>
            <groupId>commons-dbcp</groupId>
            <artifactId>commons-dbcp</artifactId>
            <version>2.1.1</version>
        </dependency>
        <dependency>
            <groupId>org.mindrot</groupId>
            <artifactId>jbcrypt</artifactId>
            <version>0.4</version>
        </dependency>
        <dependency>
            <groupId>commons-beanutils</groupId>
            <artifactId>commons-beanutils</artifactId>
            <version>1.9.2</version>
        </dependency>
    </dependencies>
    ```

4. **Run Maven Install**:
    Open the integrated terminal in VSCode (`Terminal -> New Terminal`) and execute:
    ```bash
    mvn clean install
    ```

## Configuration

- **Spring Configuration**: 
  - `src/main/webapp/WEB-INF/web.xml`
  - `src/main/webapp/WEB-INF/applicationContext.xml`
  - `src/main/webapp/WEB-INF/rootApplicationContext.xml`

- **DataSource Configuration**:
  ```xml
  <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
      <property name="driverClassName" value="org.hsqldb.jdbcDriver" />
      <property name="url" value="jdbc:hsqldb:mem:sos" />
      <property name="username" value="sa" />
      <property name="password" value="" />
  </bean>

## Entities

The project includes several entity classes representing the database structure:

- **Student**: Represents a student, including attributes like first name, last name, date of birth, PESEL, and album number.
- **DaneKontaktowe**: Represents contact details for a student, including address, email, and phone number.
- **KontoUzytkownika**: Represents a user account with username, password, and account status.
- **HistoriaLogowania**: Logs user login attempts, including login time and result.
- **Zajecia**: Represents classes with attributes like day, start and end time, room number, and type.
- **Przedmioty**: Represents subjects with name and description.
- **Wykladowca**: Represents an instructor with first name, last name, and title.
- **Ksiazka**: Represents a book with title, author, ISBN, and category/location identifiers.
- **Wypozyczenie**: Represents a book loan, including student, book, and loan dates.
- **Platnosc**: Represents payments with account ID, amount, and payment dates.

Each entity class is annotated with JPA annotations for ORM mapping and is located in the package `pl.wwsis.sos.model`.

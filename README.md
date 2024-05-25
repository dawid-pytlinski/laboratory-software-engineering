# Spring Maven Project

This project is a demonstration of setting up a Spring-based web application using Maven. It includes configuration for a variety of dependencies, such as Spring Core, Hibernate, HSQLDB, and others. The purpose of this project is to provide a practical example of integrating these technologies and managing a project through a version control system.

## Features

- **Spring Framework**: Core framework for building web applications.
- **Hibernate ORM**: For object-relational mapping and database operations.
- **HSQLDB**: In-memory database for quick setup and testing.
- **Apache Commons DBCP**: For database connection pooling.
- **jBCrypt**: For handling password encryption.
- **Commons BeanUtils**: Utility library for handling Java Beans.

## Getting Started

### Prerequisites

- Java 8
- Maven
- Git
- Visual Studio Code (VSCode)

### Setup

1. **Clone the repository**:
    ```sh
    git clone https://github.com/your-username/your-repository.git
    cd your-repository
    ```

2. **Open the project in VSCode**:
    - Open Visual Studio Code.
    - Select `File -> Open Folder...`.
    - Navigate to the cloned repository and open it.

3. **Add Dependencies**:
    Ensure the following dependencies are added to the `pom.xml` file:
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
    ```sh
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

# Laoratory_5

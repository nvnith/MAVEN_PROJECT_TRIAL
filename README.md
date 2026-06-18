# Calculator App

A simple Java HI fapplication built using Maven for demonstrating Jenkins CI/CD concepts.

## Project Overview

This project was created as part of a DevOps assignment to demonstrate:

- Maven project creation
- Unit testing with JUnit 5
- Jenkins Master-Agent architecture
- SonarCloud integration
- Jenkins Pipeline (Jenkinsfile)
- SCM integration using GitHub

## Technologies Used

- Java
- Maven
- JUnit 5
- Jenkins
- Git & GitHub
- SonarCloud

## Project Structure

```text
calculator-app
│
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com/navaneeth/App.java
    │
    └── test
        └── java
            └── com/navaneeth/AppTest.java
```

## Features

- Performs addition of two numbers
- Includes automated unit testing
- Supports Maven build lifecycle
- Ready for Jenkins pipeline integration

## Build and Test

Run the following command from the project root directory:

```bash
mvn test
```

Expected result:

```text
BUILD SUCCESS
```

## Unit Test

The project contains a JUnit 5 test case that verifies the correctness of the addition method.

## Author

Navaneeth R Sunil
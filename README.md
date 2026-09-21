# Config Service PFE

This repo is config service pfe for my last master's degree project.

It is a Java-based configuration service designed to centralize and manage application configuration in a clean, maintainable, and scalable way. The project aims to provide a simple backend service for storing, retrieving, and updating configuration settings used by other services or applications.

## Overview

The Config Service project was developed as part of my final master's degree project. Its main objective is to demonstrate how configuration can be handled efficiently in a distributed architecture, while maintaining security, consistency, and easier maintenance across environments.

## Features

- Centralized configuration management
- REST API for reading and updating settings
- Support for environment-based configuration
- Java backend implementation
- Easy integration with other services
- Simple and modular architecture

## Tech Stack

- Java
- Spring Boot (recommended for a service-oriented implementation)
- Maven or Gradle (depending on project setup)
- RESTful APIs

## Project Structure

```text
config-service-pfe/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── pom.xml
├── README.md
└── .gitignore
```

## Getting Started

### Prerequisites

- Java 17 or later
- Maven or Gradle
- An IDE such as IntelliJ IDEA or Eclipse

### Clone the repository

```bash
git clone https://github.com/DalalYouness/config-service-pfe.git
cd config-service-pfe
```

### Build the project

```bash
mvn clean install
```

### Run the application

```bash
mvn spring-boot:run
```

If the project uses a different run command based on its configuration, update this section accordingly.

## Configuration

Configuration values can be stored in application properties or environment variables, depending on the implementation chosen for the service. The application should be configured to support multiple environments such as:

- Development
- Testing
- Production

## Use Cases

This service can be used to:

- Store shared configuration keys
- Manage environment-dependent values
- Reduce duplication across microservices
- Improve deployment consistency

## License

This project is intended for academic and personal learning purposes. Please add the appropriate license if you plan to share it publicly beyond the academic context.

## Author

Dalal Youness

## Note

This README was created to provide a clear project introduction for the repository and can be updated later as the project evolves.

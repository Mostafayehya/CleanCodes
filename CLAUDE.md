# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

### Build and Test
- **Build project**: `mvn compile`
- **Run tests**: `mvn test`
- **Run single test class**: `mvn test -Dtest=KaratTest`
- **Run TDD module tests**: `mvn test -Dtest=CalculatorTest`
- **Run specific test method**: `mvn test -Dtest=KaratTest#embeddedWord_Example1`
- **Clean and build**: `mvn clean compile`
- **Package application**: `mvn package`

### Spring Boot
- **Run Spring Boot application**: `mvn spring-boot:run`
- **Run Spring Boot with specific class**: `java -cp target/classes spring.org.mostafayehya.FirstSpringApplication`

### Code Quality
No specific lint or static analysis tools configured. Standard Maven compile warnings will be shown.

## Project Architecture

This is a Java learning project focused on **Clean Code principles** and **Test-Driven Development (TDD)** practices. The codebase is organized into several distinct modules:

### Core Structure

- **`src/main/java/`**: Main source code organized by learning modules
- **`src/test/java/`**: JUnit tests following TDD practices
- **Maven-based**: Uses Spring Boot parent POM with Java 8 compatibility

### Key Modules

1. **Problem Solving** (`problemsolving/`):
   - `Karat.java`: Multiple algorithm implementations with nested static classes
   - Includes embedded word finding, DFS grid search, hand validation, and grocery optimization problems
   - Each problem has multiple solution approaches for comparison

2. **Fundamentals** (`fundamentals/functions/`):
   - **Stack Implementation**: Interface-based design with custom exceptions
   - **Form Processing**: Lychrel number generator algorithms
   - Clean separation between interfaces and implementations

3. **Service Provider Interface** (`spi/`):
   - Demonstrates Java SPI pattern with `MessageService` implementations
   - Factory pattern with service loader for dependency injection

4. **Spring Boot** (`spring/org/mostafayehya/`):
   - Basic Spring Boot application setup
   - Includes Spring Security, Web, WebFlux, and JPA dependencies

5. **TDD Practice** (`tdd/`):
   - Simple module for practicing Test-Driven Development
   - Contains basic examples like Calculator with comprehensive unit tests
   - Follows red-green-refactor TDD cycle

### Testing Strategy

- **Unit Tests**: Comprehensive JUnit test coverage for all problem solutions
- **Multiple Assertions**: Tests validate different solution approaches for the same problems
- **Data-Driven Tests**: Uses setup methods with test data arrays
- **TDD Approach**: Tests are written to validate clean code refactoring practices

### Design Patterns

- **Strategy Pattern**: Multiple solution implementations for the same problems
- **Factory Pattern**: Service loader pattern in SPI module
- **Interface Segregation**: Clean interfaces with focused responsibilities
- **Exception Handling**: Custom exception hierarchy for domain-specific errors

### Clean Code Practices

This codebase serves as a practical implementation of Clean Code principles from the extensive README documentation, including:

- Small, focused methods (4-10 lines recommended)
- Descriptive naming conventions
- Single responsibility principle
- Command-query separation
- Tell-don't-ask principle
- Structured programming patterns
# Employee Management System

## Description
The Employee Management System is a Java-based application designed to manage employee data and simulate various roles within an organization. The system leverages Object-Oriented Programming (OOP) principles to provide a robust and extensible framework for handling employee-related operations.

## Features
- **Inheritance**:
  - Different employee types (`InternEmployee`, `ManagerEmployee`, `position`, and `Department`) inherit from the abstract `Employee` class.
- **Encapsulation**:
  - Employee data, such as name, ID, salary, and nationality, is securely stored using private fields with public getter and setter methods.
- **Polymorphism**:
  - Various implementations of the `work` method for different employee roles.
- **Abstraction**:
  - The `Employee` class defines a template for all employees, while the `Ework` interface enforces the implementation of the `work` method.
- **Persistence**:
  - Employee data is saved to and loaded from a serialized file (`save.data`) for seamless data management across sessions.

## How It Works
1. **Data Initialization**:
   - Upon startup, the system attempts to load existing employee data from `save.data`.
   - If no data is found, a default list of employees is created.

2. **Employee Operations**:
   - Display details of each employee.
   - Simulate employee roles through the `work` method.
   - Assign tasks dynamically to manager employees using the `assignTask` method.

3. **Data Persistence**:
   - Changes to employee data are automatically saved at the end of the session.

## Requirements
- **Programming Language**: Java
- **Development Environment**: Any IDE supporting Java (e.g., IntelliJ IDEA, Eclipse)
- **Java Version**: Java SE 8 or later

## Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>

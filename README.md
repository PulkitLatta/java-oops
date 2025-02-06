# Showroom Management System

## Overview
The **Showroom Management System** is a Java-based console application designed to manage showrooms, employees, and cars. The system allows users to add, retrieve, and manage data related to different showrooms, employees, and available cars in stock.

## Features
- Add new showrooms with details such as name, address, manager, number of employees, and available cars.
- Add employees and associate them with specific showrooms.
- Add cars with specifications such as name, color, fuel type, price, type, and transmission.
- Retrieve and display details of all showrooms, employees, and cars.
- Simple text-based menu-driven interface for easy interaction.

## Technologies Used
- **Java**: Core programming language used to develop the system.
- **Object-Oriented Programming (OOP)**: Utilized for structuring classes efficiently.
- **Scanner Class**: Used for user input handling.
- **UUID**: Used for generating unique employee IDs.

## Classes and Interfaces
### 1. **Main.java**
The entry point of the program containing the main menu and logic for user interaction.

### 2. **Showroom.java**
Represents a showroom with attributes like name, address, manager name, employee count, and available cars.
- Implements `details` interface.
- Methods:
  - `setdetails()`: Accepts user input to set showroom details.
  - `getdetails()`: Displays showroom details.

### 3. **Employee.java**
Represents an employee associated with a showroom.
- Implements `details` interface.
- Methods:
  - `setdetails()`: Accepts user input for employee details.
  - `getdetails()`: Displays employee details.

### 4. **Car.java**
Represents a car in the showroom.
- Implements `details` interface.
- Methods:
  - `setdetails()`: Accepts user input for car details.
  - `getdetails()`: Displays car details.

### 5. **details.java** (Interface)
Defines the structure for classes that contain showroom, employee, and car details.
- `setdetails()`: Method for setting details.
- `getdetails()`: Method for retrieving details.

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/PulkitLatta/java-oops.git
   ```
2. Open the project in an IDE (like IntelliJ IDEA or Eclipse).
3. Compile and run `Main.java`.
4. Follow the on-screen menu instructions to interact with the system.

## Future Enhancements
- Implement a database for persistent storage.
- Improve UI with a graphical interface.
- Add authentication for employees and managers.

## Author
Pulkit Latta


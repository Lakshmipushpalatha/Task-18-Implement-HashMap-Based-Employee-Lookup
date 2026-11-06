# Task-18-Implement-HashMap-Based-Employee-Lookup
java calculation

## 1. Project Description
The Employee Lookup System is a Java-based application that uses the HashMap data structure to store and manage employee information.

Each employee is identified by a unique Employee ID. The Employee ID is used as a key, and the employee details are stored as a value.

This application allows users to add, search, update, delete, and display employee records.

## 2. Objective
- Understand the HashMap data structure.
- Learn how key-value pairs work in Java.
- Perform employee lookup using employee IDs.
- Understand hashing and data retrieval.
- Practice Java classes, objects, methods, and collections.

## 3. Technologies Used
- **Programming Language:** Java
- **Data Structure:** HashMap
- **Input:** Scanner class
- **IDE:** Any Java-supported IDE or online compiler.

## 4. Features

### 1. Add Employee
- Allows users to enter employee details.
- Stores employee information in the HashMap.
- Checks whether the employee ID already exists.
- Prevents duplicate employee IDs.

### 2. Search Employee
- Searches for an employee using their ID.
- Displays employee details if the ID exists.
- Displays an error message if the employee is not found.

### 3. Update Employee
- Allows users to modify existing employee details.
- Updates employee name, department, and salary.
- Checks whether the employee ID exists before updating.

### 4. Delete Employee
- Deletes an employee record using the employee ID.
- Displays a success message after deletion.
- Displays an error message if the employee does not exist.

### 5. Display All Employees
- Displays all employee records stored in the HashMap.
- Shows employee ID, name, department, and salary.
- Displays a message if no employee records are available.

## 5. Java Concepts Used

| Concept | Explanation |
|---|---|
| Class | Defines the Employee structure. |
| Object | Represents an individual employee. |
| Constructor | Initializes employee details. |
| HashMap | Stores employee information as key-value pairs. |
| Scanner | Accepts input from the user. |
| Methods | Perform add, search, update, and delete operations. |
| Switch | Handles menu selections. |
| Do-While Loop | Repeats the menu until the user exits. |
| If-Else | Checks employee availability and duplicate IDs. |

## 6. Understanding HashMap

HashMap is a collection in Java that stores data in key-value pairs.

In this project:

- **Key:** Employee ID
- **Value:** Employee object containing name, department, and salary.

Example:

```java
HashMap<Integer, Employee> employees = new HashMap<>();
```

Important HashMap methods:

- `put()` – Adds employee details.
- `get()` – Retrieves employee details using an ID.
- `containsKey()` – Checks whether an employee ID exists.
- `remove()` – Deletes an employee record.
- `values()` – Returns all employee objects.
- `isEmpty()` – Checks whether the HashMap is empty.

## 7. Program Execution Steps

1. Start the Java application.
2. Display the Employee Management System menu.
3. Select an operation.
4. Enter the required employee information.
5. Perform the selected operation using HashMap.
6. Display the result.
7. Repeat the menu until the user selects Exit.

## 8. Sample Input

```text
Enter your choice: 1

Enter Employee ID: 101
Enter Employee Name: Rahul
Enter Department: Java
Enter Salary: 25000
```

## 9. Sample Output

```text
Employee added successfully!

Employee Found:
Employee ID: 101
Name: Rahul
Department: Java
Salary: 25000.0
```

## 10. Advantages of HashMap

- Provides fast data retrieval using keys.
- Stores data in key-value pairs.
- Does not allow duplicate keys.
- Supports easy insertion, updating, and deletion.
- Useful for managing employee records.

## 11. How to Run the Program

1. Install Java JDK on your computer.
2. Create a file named `Task18.java`.
3. Copy and paste the Java program into the file.
4. Open the terminal in the file location.
5. Compile the program:

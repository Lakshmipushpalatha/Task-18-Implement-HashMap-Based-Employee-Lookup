import java.util.HashMap;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class Task18 {

    static HashMap<Integer, Employee> employees = new HashMap<>();

    static Scanner sc = new Scanner(System.in);

    static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (employees.containsKey(id)) {
            System.out.println("Employee ID already exists!");
            return;
        }

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, department, salary);

        employees.put(id, emp);

        System.out.println("Employee added successfully!");
    }

    static void searchEmployee() {

        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();

        Employee emp = employees.get(id);

        if (emp != null) {
            System.out.println("\nEmployee Found:");
            emp.display();
        } else {
            System.out.println("Employee not found!");
        }
    }

    static void updateEmployee() {

        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        Employee emp = employees.get(id);

        if (emp != null) {

            System.out.print("Enter New Name: ");
            emp.name = sc.nextLine();

            System.out.print("Enter New Department: ");
            emp.department = sc.nextLine();

            System.out.print("Enter New Salary: ");
            emp.salary = sc.nextDouble();

            System.out.println("Employee updated successfully!");

        } else {
            System.out.println("Employee not found!");
        }
    }

    static void deleteEmployee() {

        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        if (employees.containsKey(id)) {

            employees.remove(id);

            System.out.println("Employee deleted successfully!");

        } else {
            System.out.println("Employee not found!");
        }
    }

    static void displayEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees available!");
            return;
        }

        System.out.println("\n--- Employee Details ---");

        for (Employee emp : employees.values()) {
            emp.display();
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    searchEmployee();
                    break;

                case 3:
                    updateEmployee();
                    break;

                case 4:
                    deleteEmployee();
                    break;

                case 5:
                    displayEmployees();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
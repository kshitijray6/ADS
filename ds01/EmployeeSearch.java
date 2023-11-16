package ds01;

import java.util.Scanner;

public class EmployeeSearch {
    public static void main(String[] args) {
        // Create an array of employees
        Employee[] employees = {
            new Employee(101, "John Doe", 50000.0),
            new Employee(102, "Jane Smith", 60000.0),
            new Employee(103, "Bob Johnson", 55000.0),
            // Add more employees as needed
        };

        // Perform linear search
        Scanner scanner = new Scanner(System.in);

        // Search by employee ID
        System.out.print("Enter employee ID to search: ");
        int searchEmpId = scanner.nextInt();
        Employee foundById = searchById(employees, searchEmpId);
        displayResult(foundById, "Employee ID");

        // Search by name
        System.out.print("Enter employee name to search: ");
        scanner.nextLine(); // Consume the newline character
        String searchName = scanner.nextLine();
        Employee foundByName = searchByName(employees, searchName);
        displayResult(foundByName, "Employee Name");

        // Search by salary
        System.out.print("Enter employee salary to search: ");
        double searchSalary = scanner.nextDouble();
        Employee foundBySalary = searchBySalary(employees, searchSalary);
        displayResult(foundBySalary, "Employee Salary");

        scanner.close();
    }

    // Linear search by employee ID
    private static Employee searchById(Employee[] employees, int empId) {
        for (Employee employee : employees) {
            if (employee.empId == empId) {
                return employee;
            }
        }
        return null; // Employee not found
    }

    // Linear search by employee name
    private static Employee searchByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.name.equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null; // Employee not found
    }

    // Linear search by employee salary
    private static Employee searchBySalary(Employee[] employees, double salary) {
        for (Employee employee : employees) {
            if (employee.salary == salary) {
                return employee;
            }
        }
        return null; // Employee not found
    }

    // Display the search result
    private static void displayResult(Employee result, String searchType) {
        if (result != null) {
            System.out.println(searchType + " search result: " + result.name + " (Employee ID: " + result.empId + ", Salary: " + result.salary + ")");
        } else {
            System.out.println("Employee not found for " + searchType);
        }
    }
}

package EMS;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Employee_management_system {
    private static final String FILE_NAME = "save.data";
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        load();

        if (employees.isEmpty()) {
            employees.add(new position("Mohamed", 231013063, 2000, "Egyptian", "SalesEmployee"));
            employees.add(new Department("Bob", 231001234, 3000, "American", "IT", "Network"));
            employees.add(new InternEmployee("Yasser", 231000432, 400, "Egyptian", "AAST", 12));
            employees.add(new ManagerEmployee("Hisham", 231010400, 6000, "Saudi", "HR", "Marketing", 12));
        }

        //for (Employee emp : employees) {
        for (int i = 0; i < employees.size(); i++) {

            Employee emp = employees.get(i);
            System.out.println("Details of employee ("+(i+1)+")");
            emp.Details();
            emp.work();
            if (emp instanceof ManagerEmployee) {
                ((ManagerEmployee) emp).assignTask("Prepare team for upcoming seminar.");
            }
        }
          LegalEmployee l1 = new LegalEmployee("Mr.Omar","Corporate rights");
            l1.work();


        save();
    }

    public static void load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Data loaded successfully from " + FILE_NAME);
        } catch (FileNotFoundException e) {
            System.out.println("No saved data found. Starting with an empty employee list.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    public static void save() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Data saved successfully to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}

/*
* package EMS;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee_management_system {
    private static final String FILE_NAME = "save.data";
    private static List<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        load();

        if (employees.isEmpty()) {
            System.out.println("No saved employees found. Please add new employees.");


            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for employee #" + (i + 1));

                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter ID: ");
                long id = scanner.nextLong();

                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();

                System.out.print("Enter nationality: ");
                scanner.nextLine();
                String nationality = scanner.nextLine();

                System.out.print("Enter position (e.g., SalesEmployee, IT, etc.): ");
                String position = scanner.nextLine();

                if (position.equalsIgnoreCase("SalesEmployee")) {
                    employees.add(new SalesEmployee(name, id, salary, nationality, position));
                } else if (position.equalsIgnoreCase("IT")) {
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    employees.add(new DepartmentEmployee(name, id, salary, nationality, department, position));
                } else {
                    System.out.println("Invalid position! Employee not added.");
                }
            }
        }

        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            System.out.println("Details of employee (" + (i + 1) + ")");
            emp.Details();
            emp.work();
            if (emp instanceof ManagerEmployee) {
                ((ManagerEmployee) emp).assignTask("Prepare team for upcoming seminar.");
            }
        }

        LegalEmployee l1 = new LegalEmployee("Omar", "Corporate rights");
        l1.work();

        save();
    }

    public static void load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Data loaded successfully from " + FILE_NAME);
        } catch (FileNotFoundException e) {
            System.out.println("No saved data found. Starting with an empty employee list.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    public static void save() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Data saved successfully to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}
*/
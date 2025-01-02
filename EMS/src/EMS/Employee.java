package EMS;
import java.io.Serializable;

public abstract class Employee implements Serializable,Ework {
    private static final long serialVersionUID = 1L; // Recommended for Serializable classes
    private String name;
    private int id;
    private double salary;
    private String nationality;

    public Employee(String name, int id, double salary, String nationality) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getNationality() {
        return nationality;
    }

    public abstract void work();

    public void Details() {
        System.out.println("\nName: " + name + "           |              ID: " + id+"\n");
        System.out.println("Salary: " + salary + "$                 |                  Nationality: " + nationality + "\n");
    }

    public void assignTask(String s) {
        // To be overridden in specific subclasses
    }
}

// Abstract class Employee
abstract class Employee {
    private String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Non-abstract method to get details
    public void getDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();
}

// Subclass FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Implementing the abstract method to calculate salary
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Subclass PartTimeEmployee
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, int id, double hourlyWage, int hoursWorked) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Implementing the abstract method to calculate salary
    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

// Main class to test the functionality
public class task2 {
    public static void main(String[] args) {
        // Creating a FullTimeEmployee object
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 101, 5000.0);
        fullTimeEmployee.getDetails();
        System.out.println("Salary: " + fullTimeEmployee.calculateSalary());

        // Creating a PartTimeEmployee object
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 102, 20.0, 100);
        partTimeEmployee.getDetails();
        System.out.println("Salary: " + partTimeEmployee.calculateSalary());
    }
}

abstract class Employee {
    private String name;
    private int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void getDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
    public abstract double calculateSalary();
}
class FullTimeEmployee extends Employee {
    private double monthlySalary;
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;
    public PartTimeEmployee(String name, int id, double hourlyWage, int hoursWorked) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}
public class task2 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 101, 5000.0);
        fullTimeEmployee.getDetails();
        System.out.println("Salary: " + fullTimeEmployee.calculateSalary());
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 102, 20.0, 100);
        partTimeEmployee.getDetails();
        System.out.println("Salary: " + partTimeEmployee.calculateSalary());
    }
}

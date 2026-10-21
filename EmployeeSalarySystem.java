import java.util.Scanner;

// Abstract base class
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name
                + ", Salary: " + calculateSalary());
    }
}

// Full-time: fixed monthly salary + bonus
class FullTimeEmployee extends Employee {
    private double monthlySalary;
    private double bonus;

    public FullTimeEmployee(int id, String name, double monthlySalary, double bonus) {
        super(id, name);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + bonus;
    }
}

// Part-time: hourly rate * hours worked
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee type (1 = Full-time, 2 = Part-time): ");
        int type = sc.nextInt();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear leftover newline
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        Employee emp;
        if (type == 1) {
            System.out.print("Enter monthly salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter bonus: ");
            double bonus = sc.nextDouble();
            emp = new FullTimeEmployee(id, name, salary, bonus);
        } else {
            System.out.print("Enter hourly rate: ");
            double rate = sc.nextDouble();
            System.out.print("Enter hours worked: ");
            int hours = sc.nextInt();
            emp = new PartTimeEmployee(id, name, rate, hours);
        }

        System.out.println();
        emp.display();
        sc.close();
    }
}
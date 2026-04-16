// Base Class
class Employee {
    String name;
    int id;
    double baseSalary;

    Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }
}

// Full Time Employee
class FullTimeEmployee extends Employee {
    double bonus;

    FullTimeEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Part Time Employee
class PartTimeEmployee extends Employee {
    int hours;
    double rate;

    PartTimeEmployee(String name, int id, int hours, double rate) {
        super(name, id, 0);
        this.hours = hours;
        this.rate = rate;
    }

    double calculateSalary() {
        return hours * rate;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // 4 Employees
        Employee e1 = new FullTimeEmployee("Rahul", 101, 30000, 5000);
        Employee e2 = new PartTimeEmployee("Amit", 102, 5, 200);
        Employee e3 = new FullTimeEmployee("Neha", 103, 40000, 8000);
        Employee e4 = new PartTimeEmployee("Priya", 104, 6, 150);

        
        System.out.println("Full Time Employee Salary: " + e1.calculateSalary());
        System.out.println("Part Time Employee Salary: " + e2.calculateSalary());
        System.out.println("Full Time Employee Salary: " + e3.calculateSalary());
        System.out.println("Part Time Employee Salary: " + e4.calculateSalary());
    }
}
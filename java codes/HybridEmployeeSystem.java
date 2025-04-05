import java.util.*;

class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

interface BonusCalculator {
    void calculateBonus();
}

interface PerformanceEvaluator {
    void evaluatePerformance();
}

class Manager extends Employee implements BonusCalculator {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void calculateBonus() {
        double bonus = salary * 0.2;
        System.out.println("Manager Bonus: $" + bonus);
    }

    public void manageTeam() {
        System.out.println(name + " manages a team of " + teamSize + " employees.");
    }
}

class Developer extends Employee implements BonusCalculator, PerformanceEvaluator {
    private int completedProjects;

    public Developer(String name, int id, double salary, int completedProjects) {
        super(name, id, salary);
        this.completedProjects = completedProjects;
    }

    public void calculateBonus() {
        double bonus = salary * 0.15 + (completedProjects * 500);
        System.out.println("Developer Bonus: $" + bonus);
    }

    public void evaluatePerformance() {
        String performance = (completedProjects > 5) ? "Excellent" : "Good";
        System.out.println(name + "'s Performance: " + performance);
    }
}

class Intern extends Employee implements PerformanceEvaluator {
    private int internshipDuration;

    public Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    public void evaluatePerformance() {
        String performance = (internshipDuration > 6) ? "Great Learning Progress" : "Needs Improvement";
        System.out.println(name + "'s Internship Performance: " + performance);
    }
}

public class HybridEmployeeSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 80000, 10);
        Developer developer = new Developer("Bob", 102, 60000, 7);
        Intern intern = new Intern("Charlie", 103, 20000, 5);

        System.out.println("--- Manager Details ---");
        manager.displayDetails();
        manager.calculateBonus();
        manager.manageTeam();

        System.out.println("\n--- Developer Details ---");
        developer.displayDetails();
        developer.calculateBonus();
        developer.evaluatePerformance();

        System.out.println("\n--- Intern Details ---");
        intern.displayDetails();
        intern.evaluatePerformance();
    }
}

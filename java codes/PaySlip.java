import java.util.Scanner;

class Employee {
    String name, empId;
    double basicSalary;

    Employee(String name, String empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void generatePaySlip() {
        System.out.println("\n----- PAY SLIP -----");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Total Salary: $" + calculateSalary());
        System.out.println("--------------------\n");
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, String empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 2000;
    }
}

public class PaySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        FullTimeEmployee emp = new FullTimeEmployee(name, empId, basicSalary);
        emp.generatePaySlip();

        sc.close();
    }
}
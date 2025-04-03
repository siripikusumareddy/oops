class Employee {
    String empName, empId, address, mailId;
    long mobileNo;
 
    public Employee(String empName, String empId, String address, String mailId, long mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }
 
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No: " + mobileNo);
    }
}
 
class Programmer extends Employee {
    double basicPay;
 
    public Programmer(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }
 
    public void generatePaySlip() {
        SalaryCalculator.calculateSalary("Programmer", basicPay);
    }
}
 
class AssistantProfessor extends Employee {
    double basicPay;
 
    public AssistantProfessor(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }
 
    public void generatePaySlip() {
        SalaryCalculator.calculateSalary("Assistant Professor", basicPay);
    }
}
 
class AssociateProfessor extends Employee {
    double basicPay;
 
    public AssociateProfessor(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }
 
    public void generatePaySlip() {
        SalaryCalculator.calculateSalary("Associate Professor", basicPay);
    }
}
 
class Professor extends Employee {
    double basicPay;
 
    public Professor(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }
 
    public void generatePaySlip() {
        SalaryCalculator.calculateSalary("Professor", basicPay);
    }
}
 
class SalaryCalculator {
    public static void calculateSalary(String designation, double basicPay) {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - (pf + staffClubFund);
 
        System.out.println("\n--- Pay Slip for " + designation + " ---");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA (97%): " + da);
        System.out.println("HRA (10%): " + hra);
        System.out.println("PF (12%): " + pf);
        System.out.println("Staff Club Fund (0.1%): " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("-----------------------------\n");
    }
}
 
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Programmer p = new Programmer("Alice", "P1001", "123 Main St", "alice@mail.com", 9876543210L, 50000);
        AssistantProfessor ap = new AssistantProfessor("Bob", "AP1002", "456 Elm St", "bob@mail.com", 9876543211L, 60000);
        AssociateProfessor asp = new AssociateProfessor("Charlie", "ASP1003", "789 Oak St", "charlie@mail.com", 9876543212L, 70000);
        Professor prof = new Professor("David", "PROF1004", "101 Maple St", "david@mail.com", 9876543213L, 90000);
 
        p.displayEmployeeDetails();
        p.generatePaySlip();
 
        ap.displayEmployeeDetails();
        ap.generatePaySlip();
 
        asp.displayEmployeeDetails();
        asp.generatePaySlip();
 
        prof.displayEmployeeDetails();
        prof.generatePaySlip();
    }
}

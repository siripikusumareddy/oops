class Employee {
    private String empName;
    private int empID;
    private double salary;

    public Employee(String empName, int empID, double salary) {
        this.empName = empName;
        this.empID = empID;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary Amount!");
        }
    }
}

public class EncapsulationEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 5001, 50000);
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee ID: " + emp.getEmpID());
        emp.setSalary(55000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}

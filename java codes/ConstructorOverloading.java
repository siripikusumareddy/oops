class Employee {
    String name;
    int age;
    double salary;

    // Constructor Overloading
    Employee() {
        System.out.println("Default Constructor: No details provided.");
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Employee Name: " + name + ", Age: " + age);
    }

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("Employee Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice", 25);
        Employee e3 = new Employee("Bob", 30, 60000);
    }
}

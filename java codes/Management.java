` class Person {
String name;
int age;
Person(String name, int age) {
this.name = name;
this.age = age;
}
void displayP() {
System.out.println("Name of the employee is: " + name);
System.out.println("Age of the employee is: " + age);
}
}
 
class Employee extends Person {
int employeeID;
int salary;
Employee(int employeeID, int salary, String name, int age) {
super(name, age);
this.employeeID = employeeID;
this.salary = salary;
}
void displayP() {
super.displayP();
System.out.println("Employee ID of the employee is: " + employeeID);
System.out.println("Salary of the employee is: " + salary);
}
}
 
class Manager extends Employee {
String departmant;
Manager(String departmant, int employeeID, int salary, String name, int age) {
super(employeeID, salary, name, age);
this.departmant = departmant;
}
void displayM() {
super.displayP();
System.out.println("Department of the employee is: " + departmant);
}
}
 
public class Management {
public static void main(String[] args) {
Manager manager = new Manager("IT", 101, 85000, "Alice Johnson", 35);
manager.displayM();}}

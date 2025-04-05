import java.util.ArrayList;
public class Main {
class Student {
private String studentName;
private ArrayList<Double> grades;

public Student(String studentName) {
this.studentName = studentName;
this.grades = new ArrayList<>();
}
public void addGrade(double grade) {
grades.add(grade);
}
public double calculateAverageGrade() {
if (grades.isEmpty()) {
return 0.0;
}
double sum = 0;
for (double grade : grades) {
sum += grade;
}
return sum / grades.size();
}
public String getStudentName() {
return studentName;
}}
class Classroom {
private ArrayList<Student> students;
public Classroom() {
students = new ArrayList<>();
}
public void addStudent(Student student) {
students.add(student);
}
public double getAverageGradeForStudent(String studentName) {
for (Student student : students) {
if (student.getStudentName().equals(studentName)) {
return student.calculateAverageGrade();
}
}
return 0.0;
}
}
public static void main(String[] args) {
Main mainInstance = new Main(); // Create an instance of the outer class
Student student1 = mainInstance.new Student("Alice");
Student student2 = mainInstance.new Student("Bob");
student1.addGrade(85);
student1.addGrade(90);
student2.addGrade(75);
student2.addGrade(80);
Classroom classroom = mainInstance.new Classroom();
classroom.addStudent(student1);
classroom.addStudent(student2);
System.out.println("Average grade for Alice: " + classroom.getAverageGradeForStudent("Alice"));
System.out.println("Average grade for Bob: " + classroom.getAverageGradeForStudent("Bob"));
}
} } 

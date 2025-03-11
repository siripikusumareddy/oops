class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String studentId, course;

    Student(String name, int age, String studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    void display() {
        super.display();
        System.out.println("Student ID: " + studentId + ", Course: " + course);
    }
}

class GraduateStudent extends Student {
    String thesisTitle;

    GraduateStudent(String name, int age, String studentId, String course, String thesisTitle) {
        super(name, age, studentId, course);
        this.thesisTitle = thesisTitle;
    }

    void submitThesis() {
        System.out.println("Thesis Submitted: " + thesisTitle);
    }

    void display() {
        super.display();
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        GraduateStudent grad = new GraduateStudent("Alice", 25, "S123", "Computer Science", "AI in Cybersecurity");
        grad.display();
        grad.submitThesis();
    }
}

abstract class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    abstract void calculateGrade();
}

class EngineeringStudent extends Student {
    double marks;

    EngineeringStudent(String name, int rollNumber, double marks) {
        super(name, rollNumber);
        this.marks = marks;
    }

    void calculateGrade() {
        if (marks >= 90) {
            System.out.println(name + "'s Grade: A");
        } else if (marks >= 75) {
            System.out.println(name + "'s Grade: B");
        } else {
            System.out.println(name + "'s Grade: C");
        }
    }
}

class MedicalStudent extends Student {
    double marks;

    MedicalStudent(String name, int rollNumber, double marks) {
        super(name, rollNumber);
        this.marks = marks;
    }

    void calculateGrade() {
        if (marks >= 85) {
            System.out.println(name + "'s Grade: A");
        } else if (marks >= 70) {
            System.out.println(name + "'s Grade: B");
        } else {
            System.out.println(name + "'s Grade: C");
        }
    }
}

public class AbstractStudent {
    public static void main(String[] args) {
        Student enggStudent = new EngineeringStudent("John", 201, 88);
        Student medStudent = new MedicalStudent("Alice", 301, 92);

        enggStudent.calculateGrade();
        medStudent.calculateGrade();
    }
}

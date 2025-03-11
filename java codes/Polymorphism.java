// Method Overloading
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding
class Parent {
    void show() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is child class");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println("Sum of 2 numbers: " + obj.add(5, 10));
        System.out.println("Sum of 3 numbers: " + obj.add(5, 10, 15));

        Parent p = new Child(); // Dynamic method dispatch
        p.show();
    }
}

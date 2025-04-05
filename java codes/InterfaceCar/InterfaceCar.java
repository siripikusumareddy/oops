interface Arithmetic {
    int operation(int a, int b);
}

class Addition implements Arithmetic {
    public int operation(int a, int b) {
        return a + b;
    }
}

class Multiplication implements Arithmetic {
    public int operation(int a, int b) {
        return a * b;
    }
}

public class InterfaceArithmetic {
    public static void main(String[] args) {
        Arithmetic add = new Addition();
        Arithmetic multiply = new Multiplication();

        System.out.println("Sum: " + add.operation(10, 5));
        System.out.println("Product: " + multiply.operation(10, 5));
    }
}
Output:
 
12.b) Shape Calculation
Code:
interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

public class InterfaceShape {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
}
Output:
 

12.c) Multiple Interface Inheritance
Code:
interface Engine {
    void start();
}

interface Vehicle {
    void speedUp(int increment);
}

class Car implements Engine, Vehicle {
    int speed;

    public void start() {
        System.out.println("Car Engine Started.");
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car Speed: " + speed + " km/h");
    }
}

public class InterfaceCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.speedUp(20);
    }
}

class Shape {
    // Method to be overridden
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the method to calculate the area of a circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overriding the method to calculate the area of a rectangle
    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class TestPolymorphism {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5); // Circle object
        Shape shape2 = new Rectangle(10, 5); // Rectangle object
        
        System.out.println("Area of Circle: " + shape1.calculateArea());
        System.out.println("Area of Rectangle: " + shape2.calculateArea());
    }
}

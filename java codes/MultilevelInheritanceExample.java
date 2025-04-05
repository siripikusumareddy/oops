// Base class (Grandparent)
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Derived class (Parent)
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven...");
    }
}

// Derived class (Child)
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric Car is charging...");
    }
}

// Main class
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        
        // Calling methods from different levels of inheritance
        tesla.start();  // Inherited from Vehicle
        tesla.drive();  // Inherited from Car
        tesla.charge(); // Defined in ElectricCar
    }
}

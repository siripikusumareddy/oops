abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike Started.");
    }

    void stop() {
        System.out.println("Bike Stopped.");
    }
}

class Truck extends Vehicle {
    void start() {
        System.out.println("Truck Engine Started.");
    }

    void stop() {
        System.out.println("Truck Stopped.");
    }
}

public class AbstractVehicle {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();

        bike.start();
        truck.start();
        bike.stop();
    }
}

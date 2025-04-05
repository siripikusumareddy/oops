class Car {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price!");
        }
    }
}

public class EncapsulationCar {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model 3", 50000);
        System.out.println("Car Model: " + car.getModel());
        car.setPrice(52000);
        System.out.println("Updated Price: $" + car.getPrice());
    }
}

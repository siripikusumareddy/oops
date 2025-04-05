abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class AbstractAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }

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

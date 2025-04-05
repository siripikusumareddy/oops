public class ExceptionPropagationExample {
    void method1() throws ArithmeticException {
        method2();
    }

    void method2() throws ArithmeticException {
        method3();
    }

    void method3() throws ArithmeticException {
        throw new ArithmeticException("Exception thrown from method3.");
    }

    public static void main(String[] args) {
        ExceptionPropagationExample obj = new ExceptionPropagationExample();
        try {
            obj.method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}

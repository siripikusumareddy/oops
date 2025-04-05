public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            try {
                System.out.println(arr[5]); 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index is out of bounds.");
            }
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Cannot divide by zero.");
        }
    }
}

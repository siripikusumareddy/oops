import java.util.Scanner;

class MathOperations {
    int num;
    
    public MathOperations(int num) {
        this.num = num;
    }
    
    public void displayNumber() {
        System.out.println("The number is: " + num);
    }
}

class Factorial extends MathOperations {
    public Factorial(int num) {
        super(num);
    }

    public void computeFactorial() {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

class Fibonacci extends MathOperations {
    public Fibonacci(int num) {
        super(num);
    }

    public void generateFibonacci() {
        int a = 0, b = 1, next;
        System.out.print("Fibonacci series up to " + num + " terms: " + a + " " + b);
        for (int i = 2; i < num; i++) {
            next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}

class PrimeChecker extends MathOperations {
    public PrimeChecker(int num) {
        super(num);
    }

    public void isPrime() {
        boolean prime = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(num + " is " + (prime ? "a Prime Number" : "not a Prime Number"));
    }
}

class GCD_LCM extends MathOperations {
    int secondNum;

    public GCD_LCM(int num, int secondNum) {
        super(num);
        this.secondNum = secondNum;
    }

    public void computeGCD_LCM() {
        int a = num, b = secondNum, gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        int lcm = (a * b) / gcd;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}

public class HierarchicalMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        Factorial factObj = new Factorial(num);
        factObj.displayNumber();
        factObj.computeFactorial();

        Fibonacci fibObj = new Fibonacci(num);
        fibObj.generateFibonacci();

        PrimeChecker primeObj = new PrimeChecker(num);
        primeObj.isPrime();

        System.out.print("Enter another number for GCD & LCM calculation: ");
        int num2 = scanner.nextInt();
        GCD_LCM gcdLcmObj = new GCD_LCM(num, num2);
        gcdLcmObj.computeGCD_LCM();
    }
}

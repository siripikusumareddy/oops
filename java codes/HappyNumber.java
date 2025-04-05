import java.util.Scanner;

public class HappyNumber {
    static int squareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int slow = num, fast = num;

        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        } while (slow != fast);

        if (slow == 1)
            System.out.println(num + " is a Happy number");
        else
            System.out.println(num + " is NOT a Happy number");
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class KaprekarConstant {
    static int kaprekarRoutine(int num) {
        int count = 0;
        while (num != 6174) {
            char[] digits = String.format("%04d", num).toCharArray();
            Arrays.sort(digits);
            int asc = Integer.parseInt(new String(digits));
            int desc = Integer.parseInt(new StringBuilder(new String(digits)).reverse().toString());
            num = desc - asc;
            count++;
            System.out.println(desc + " - " + asc + " = " + num);
            if (num == 0) return -1;  // Stops if all digits are the same
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number (non-repeating digits): ");
        int num = sc.nextInt();
        int steps = kaprekarRoutine(num);
        if (steps == -1) System.out.println("Invalid input! Try a number with different digits.");
        else System.out.println("Reached 6174 in " + steps + " steps.");
    }
}

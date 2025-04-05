import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd size of square: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Only odd order supported.");
            return;
        }

        int[][] magic = new int[n][n];
        int number = 1;
        int i = 0, j = n / 2;

        while (number <= n * n) {
            magic[i][j] = number++;
            i--;
            j++;
            if (number % n == 1) {
                i += 2;
                j--;
            } else if (j == n) {
                j -= n;
            } else if (i < 0) {
                i += n;
            }
        }

        System.out.println("Magic Square:");
        for (int[] row : magic) {
            for (int val : row)
                System.out.printf("%3d ", val);
            System.out.println();
        }
    }
}

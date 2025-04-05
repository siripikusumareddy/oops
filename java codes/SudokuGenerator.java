import java.util.Random;

public class SudokuGenerator {
    static final int SIZE = 9;
    static final int[][] board = new int[SIZE][SIZE];

    public static void main(String[] args) {
        fillDiagonalBoxes();
        fillRemaining(0, 3);
        printBoard();
    }

    static void fillDiagonalBoxes() {
        for (int i = 0; i < SIZE; i += 3) fillBox(i, i);
    }

    static void fillBox(int row, int col) {
        Random rand = new Random();
        boolean[] used = new boolean[SIZE + 1];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                int num;
                do num = rand.nextInt(SIZE) + 1;
                while (used[num]);
                used[num] = true;
                board[row + i][col + j] = num;
            }
    }

    static boolean fillRemaining(int i, int j) {
        if (j >= SIZE && i < SIZE - 1) {
            i += 1;
            j = 0;
        }
        if (i >= SIZE && j >= SIZE) return true;

        if (board[i][j] != 0) return fillRemaining(i, j + 1);

        for (int num = 1; num <= SIZE; num++) {
            if (isSafe(i, j, num)) {
                board[i][j] = num;
                if (fillRemaining(i, j + 1)) return true;
                board[i][j] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int row, int col, int num) {
        for (int x = 0; x < SIZE; x++)
            if (board[row][x] == num || board[x][col] == num) return false;
        return true;
    }

    static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }
}

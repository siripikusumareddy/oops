public class PrimePalindrome {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static boolean isPalindrome(int n) {
        int rev = 0, original = n;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        System.out.println("Prime Palindromes between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

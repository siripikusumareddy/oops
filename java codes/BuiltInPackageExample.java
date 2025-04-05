import java.time.LocalDate;
import java.util.Random;

public class BuiltInPackageExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        Random rand = new Random();
        System.out.println("Random Number: " + rand.nextInt(100));

        System.out.println("Math Square Root of 25: " + Math.sqrt(25));
    }
}

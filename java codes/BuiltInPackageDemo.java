import java.util.Scanner;
import java.io.*;

public class BuiltInPackageDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        File file = new File("test.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Hello " + name);
        writer.close();

        System.out.println("Data written to file.");
        sc.close();
    }
}

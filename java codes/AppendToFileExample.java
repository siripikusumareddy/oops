import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("data.txt", true)) {
            writer.write("\nThis is appended text.");
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

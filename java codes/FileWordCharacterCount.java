import java.io.*;
import java.util.StringTokenizer;

public class FileWordCharacterCount {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            int charCount = 0, wordCount = 0, lineCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                StringTokenizer tokens = new StringTokenizer(line);
                wordCount += tokens.countTokens();
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

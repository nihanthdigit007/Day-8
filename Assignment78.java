import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 public class Assignment78 {
    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }

    public static void readFile(String fileName) throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();
        } catch (IOException e) {
            throw new Exception("Error reading file", e);
        }
    }
}

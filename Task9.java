import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task9 {
    public static void main(String[] args) {
        try {
            File file = new File("myFile.txt");
            if (file.exists()) {
                FileWriter writer = new FileWriter(file, true); // 'true' enables appending
                writer.write("\nAppended text: Java supports Object-Oriented Programming.");
                writer.close();
                System.out.println("Successfully appended to the file.");
            } else {
                System.out.println("File not found.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

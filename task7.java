import java.io.*;
public class task7 {
    public static void main(String[] args) {
        try {
            File file = new File("myFile.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter(file);
            writer.write("Java is a high level programming language.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

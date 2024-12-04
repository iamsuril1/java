import java.io.*;
public class task8 {
    public static void main(String[] args) {
        try {
            File file = new File("myFile.txt");
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                System.out.println("File not found.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

import java.io.File;

public class task10 {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File not found.");
        }
    }
}

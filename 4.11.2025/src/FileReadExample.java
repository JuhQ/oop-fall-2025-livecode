import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadExample {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("file.txt")) {
            int data;
            while ((data = inputStream.read()) != -1) {
                // Process the byte data
                System.out.print(data);
                System.out.print(" ");
                System.out.print((char) data);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

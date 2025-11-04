import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputExample {
    public static void main(String[] args) {
        try (OutputStream outputStream = new FileOutputStream("file.txt")) {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            //String text = "Hello, World!";
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

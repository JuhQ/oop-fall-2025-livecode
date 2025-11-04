import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExceptionExample {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Is this executing?");




    }
}

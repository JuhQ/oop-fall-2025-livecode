import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        boolean success = true;

        Scanner scanner = new Scanner(System.in);
        int index = Integer.parseInt(scanner.nextLine());

        try {
            int result = numbers[index]; // Accessing an element outside the array bounds
            System.out.println("Result: " + result); // This line will not be executed
            success = true;

        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("An exception occurred: " + e.getMessage());

            success = false;

            e.printStackTrace();

            for(StackTraceElement value : e.getStackTrace()) {
                System.out.println("printing");
                System.out.println(value);
            }
        }

        System.out.println("Success: " + success);

        System.out.println("This line makes me money");
    }
}
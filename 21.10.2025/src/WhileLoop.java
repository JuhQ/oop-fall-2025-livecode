import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Give number:");

        int number = scanner.nextInt();
        while (number != 0) {
            System.out.println("number not zero");

            System.out.println("Give new number:");
            number = scanner.nextInt();
        }
         */
        int number;
        do {
            System.out.println("number not zero");

            System.out.println("Give number:");
            number = scanner.nextInt();
        } while (number != 0);

        System.out.println("We have exited the while loop");
    }
}

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give three numbers");

        //int a = Integer.parseInt(scanner.nextLine());
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double discriminator = Math.pow(b, 2) - (4 * a * c);
        double rightSide = Math.sqrt(discriminator) / (2 * a);

        double x1 = -b + rightSide;
        double x2 = -b - rightSide;

        if (discriminator == 0) {
            if (x1 != 0) {
                System.out.println(x1);
            } else {
                System.out.println(x2);
            }
        } else if (discriminator >= 0) {
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else {
            System.out.println("No real roots.");
        }

    }
}

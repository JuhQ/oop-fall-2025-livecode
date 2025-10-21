import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int number = scanner.nextInt();
        int number = Integer.parseInt(scanner.nextLine());
        //int number = Integer.parseInt("");


        if (number == 5) {
            System.out.println("value is 5");
        } else if (number == 3) {
            System.out.println("value is 3");
        } else if (number > 0) {
            System.out.println("> 0, but not 5");
        } else if (number < 0) {
            System.out.println("< 0");
        } else {
            System.out.println("value is 0");
        }

        //System.out.println("out of if-statement");


        switch (number) {
            case 1:
                System.out.println("Switch case 1");
                break;
            case 2:
                System.out.println("Switch case 2");
                break;
            default:
                System.out.println("Default");
        }
    }
}
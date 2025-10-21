import java.util.Scanner;

public class ScandinavianCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character = scanner.nextLine().toLowerCase().charAt(0);

        System.out.println(character);

        /*
        // Using if-statement might be a bit messy
        boolean isScandic = character == 'å' || character == 'ä' || character == 'ö';

        if (isScandic) {
            // if (character == 'å' || character == 'ä' || character == 'ö') {
            System.out.println("Scandinavian chars");
        }

        //if (character == 'å' ||
        //        character == 'ä' ||
        //        character == 'ö' ||

        if (isScandic ||
                character == 'a' ||
                character == 'e' ||
                character == 'i' ||
                character == 'o' ||
                character == 'u') {
            System.out.println("The character is a vowel.");
        }
        */


        switch (character) {
            case 'å':
            case 'ä':
            case 'ö':
                System.out.println("Scandinavian chars");
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The character is a vowel.");
                break;
            default:
                System.out.println("The character is not a vowel.");
        }

    }
}

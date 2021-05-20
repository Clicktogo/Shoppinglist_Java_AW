import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    // Static scanner to be used in several methods
    private static final Scanner INPUT = new Scanner(System.in);

    public static String userInputString(String askInput) {
        // Loop to validate input
        while (true) {
            System.out.print(askInput);
            String userInput = INPUT.nextLine().trim().toLowerCase();

            // Checking if input is empty
            if (userInput.isEmpty()) {
                System.out.println("You must enter a value");
                continue;
            }

            // Manipulating string so that all item names has a capitalized first letter.
            String temp = userInput.substring(0,1).toUpperCase() + userInput.substring(1);
            userInput = temp;


            return userInput;
        }
    }

    public static Double userInputDouble(String askInput) {
        Double userInputConverted;

        // Loop to validate input
        while (true) {
            System.out.print(askInput);
            // Reading a String in order to be able to check if it's empty.
            String userInput = INPUT.nextLine().trim().toLowerCase();

            // Checking if input is empty
            if (userInput.isEmpty()) {
                System.out.println("You must enter a value");
                continue;
            }
            try {
                //Parsing String to double and handling exceptions.
                userInputConverted = Double.parseDouble(userInput);
                if(userInputConverted <= 0) {
                    System.out.println("You can not enter a negative price");
                    continue;
                }
                return userInputConverted;
            } catch (NumberFormatException e) {
                System.out.println("You must enter numbers and use \".\" in order to add decimals. Please try again.");
                continue;
            }
        }
    }

    public static Integer userInputInteger(String askInput) {
        Integer userInputConverted;

        while (true) {
            System.out.print(askInput);
            String userInput = INPUT.nextLine().trim();

            if (userInput.isEmpty()) {
                System.out.println("You must enter a value");
                continue;
            }
            try {
                userInputConverted = Integer.parseInt(userInput);
                if(userInputConverted > 5 || userInputConverted < 0) {
                    System.out.println("You must enter a number between 1 and 5");
                    continue;
                }
                return userInputConverted;
            } catch (NumberFormatException e) {
                System.out.println("You must enter a number between 1 and 5");
                continue;
            }
        }
    }
}

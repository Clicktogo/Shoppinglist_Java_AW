import java.util.*;

// Main is a bit hard to read due to all the print statements which are there to make the terminal/console experience nicer.

public class Main {

    public static void main(String[] args) {
        program();
    }

    public static void menu() {
        System.out.println();
        System.out.println("Menu");
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println("Enter an option between 1 and 5.");
        System.out.println();

        // Enum is used to present a menu with a fixed amount of choices and with an added String message

        System.out.println(Menu.AD_ITEM.getMessage());
        System.out.println(Menu.SHOW_LIST.getMessage());
        System.out.println(Menu.MOST_EXPENSIVE.getMessage());
        System.out.println(Menu.CHEAPEST.getMessage());
        System.out.println(Menu.EXIT.getMessage());
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();

    }

    public static void program() {

        Register register = new Register();

        // loops until user terminates program
        while (true) {
            // Displays menu
            menu();

            int userInput = Input.userInputInteger("Enter choice: ");

            // checks if user want to terminate program in order to break out of the method.
            if(userInput == 5){
                System.out.println("Terminating program...");
                break;
            }

            switch (userInput) {
                case 1:
                    register.addItemToList(Input.userInputString("Enter name of item: "),
                            Input.userInputDouble("Enter price: "));
                    System.out.println("Your item has been added.");
                    break;
                case 2:
                    // check if itemList is empty.
                    if(register.getItemList().isEmpty()){
                        System.out.println("No items to show");
                        break;
                    }
                    System.out.println();
                    System.out.println("Shopping List");
                    System.out.println("-----------------------------");
                    System.out.println();
                    register.getItemList().forEach(System.out::println);
                    System.out.println();
                    System.out.println("Sum all items: " + register.totalSumItems());
                    break;
                case 3:
                    if(register.getItemList().isEmpty()){
                        System.out.println("No items to show");
                        break;
                    }
                    System.out.println();
                    System.out.println("Most expensive item");
                    System.out.println("-----------------------------");
                    System.out.println();
                    // stream that gets the maximum value from the list of items.
                    System.out.println(register.getItemList().stream().max(Comparator.comparing(Item::getPrice)).get());
                    break;
                case 4:
                    if(register.getItemList().isEmpty()){
                        break;
                    }
                    System.out.println();
                    System.out.println("Cheapest item");
                    System.out.println("-----------------------------");
                    System.out.println();
                    // stream that gets the minimum value from the list of items.
                    System.out.println(register.getItemList().stream().min(Comparator.comparing(Item::getPrice)).get());
                    break;
            }
        }
    }
}

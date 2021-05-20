public enum Menu {

    AD_ITEM("1. Add item to list."),
    SHOW_LIST("2. Show shopping list."),
    MOST_EXPENSIVE("3. Get the most expensive item on the list"),
    CHEAPEST("4. Get the cheapest item on the list"),
    EXIT("5. Exit.");

    private String message;

    Menu(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

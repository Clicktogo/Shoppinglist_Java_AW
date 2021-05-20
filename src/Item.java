public class Item {
    private String itemName;
    private Double price;

    public Item (String itemName, Double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "-> " + itemName + " price: " + price + ":-";
    }
}

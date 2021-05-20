import java.util.*;
import java.util.stream.Collectors;

public class Register {

    List<Item> itemList = new ArrayList<>();

    public Register() {
    }

    public List<Item> getItemList() {
        // Sorts item list by name;
        return itemList.stream().sorted(Comparator.comparing(Item::getItemName)).collect(Collectors.toList());

    }

    public void addItemToList(String itemName, Double itemPrice) {
        Item item = new Item(itemName, itemPrice);
        this.itemList.add(item);
    }

    public Double totalSumItems(){
        return itemList.stream().mapToDouble(Item::getPrice).sum();
    }
}

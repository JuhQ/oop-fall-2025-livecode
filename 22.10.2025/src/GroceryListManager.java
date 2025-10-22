import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private final HashMap<String, Item> list = new HashMap<>();
    private boolean showWarnings = false;

    public void addItem(String item, double cost, String category) {
        if (this.checkItem(item)) {
            if(this.showWarnings) {
                System.out.println("WARNING! " + item + " already exists!");
            }
        } else {
            this.list.put(item, new Item(item, cost, category));
        }
    }

    public void removeItem(String item) {
        this.list.remove(item);
    }

    public boolean checkItem(String item) {
        return this.list.containsKey(item);
    }

    public void displayList() {
        System.out.println("Items in the list");
        if(this.list.isEmpty()) {
            System.out.println("  No items!");
        }

        int i = 1;
        for (Map.Entry<String, Item> item : this.list.entrySet()) {
            System.out.println("  " + i + ". " + item.getValue().name);
            i++;
        }
    }

    public double calculateCost() {
        double cost = 0;

        for (Map.Entry<String, Item> entry : this.list.entrySet()) {
            cost += entry.getValue().cost;
        }

        return cost;
    }

    public void displayByCategory() {
        System.out.println("Items by category");

        HashMap<String, ArrayList<String>> categories = new HashMap<>();

        for (Map.Entry<String, Item> item : this.list.entrySet()) {
            ArrayList<String> data = new ArrayList<>();
            String key = item.getValue().category;

            if(categories.containsKey(key)) {
                data = categories.get(key);
            }

            data.add(item.getValue().name);
            categories.put(key, data);
        }

        for(Map.Entry<String, ArrayList<String>> entry : categories.entrySet()) {
            System.out.println(" " + entry.getKey());

            for (String item : entry.getValue()) {
                System.out.println("   " + item);
            }
        }
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        manager.displayList();

        manager.addItem("Milk", 1, "Drink");
        manager.addItem("Milk", 1, "Drink");
        manager.addItem("Egg", 2, "Food");
        manager.addItem("Bread", 2, "Food");
        manager.addItem("Pasta", 1, "Food");
        manager.addItem("Beer", 15, "Drink");

        manager.displayList();

        String itemName = "car";
        boolean found = manager.checkItem(itemName);

        System.out.println("List has \"" + itemName + "\" in it: " + found);
        System.out.printf("List has \"%s\" in it: %s\n", itemName, found);

        System.out.println("Removing \"Beer\" from the list");
        manager.removeItem("Beer");

        manager.displayList();

        System.out.println("-----");
        System.out.println("Cost of the list: " + manager.calculateCost());

        System.out.println("\u20ac");


        manager.displayByCategory();
    }
}

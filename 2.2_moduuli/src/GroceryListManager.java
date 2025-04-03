import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private static class GroceryItem {
        String category;
        double cost;
        int quantity;

        public GroceryItem(String category, double cost, int quantity) {
            this.category = category;
            this.cost = cost;
            this.quantity = quantity;
        }
    }

    private HashMap<String, GroceryItem> groceryList = new HashMap<>();


    public void addItem(String item, double cost, String category, int quantity) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, new GroceryItem(category, cost, quantity));
        } else {
            System.out.println(item + " is already in the list.");
        }
    }


    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
        } else {
            System.out.println(item + " is not in the list.");
        }
    }


    public void displayList() {
        System.out.println("Grocery List:");
        int index = 1;
        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
            GroceryItem item = entry.getValue();
            System.out.println(index + ". " + entry.getKey() + " - €" + item.cost + " (" + item.quantity + " pcs) - Category: " + item.category);
            index++;
        }
    }


    public void displayByCategory(String category) {
        System.out.println("Items in category: " + category);
        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
            if (entry.getValue().category.equalsIgnoreCase(category)) {
                System.out.println(entry.getKey() + " - €" + entry.getValue().cost + " (" + entry.getValue().quantity + " pcs)");
            }
        }
    }


    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.containsKey(item)) {
            groceryList.get(item).quantity = newQuantity;
        } else {
            System.out.println(item + " is not in the list.");
        }
    }


    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }


    public double calculateTotalCost() {
        double total = 0.0;
        for (GroceryItem item : groceryList.values()) {
            total += item.cost * item.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();


        manager.addItem("Apples", 2.5, "Fruits", 3);
        manager.addItem("Milk", 1.2, "Dairy", 2);
        manager.addItem("Bread", 1.5, "Bakery", 1);

        manager.displayList();

        System.out.println("\nIs \"Milk\" in the grocery list? " + manager.checkItem("Milk"));

        System.out.println("\nRemoving \"Milk\" from the list...");
        manager.removeItem("Milk");


        System.out.println("\nUpdated Grocery List:");
        manager.displayList();


        System.out.println("\nDisplaying items in category 'Fruits':");
        manager.displayByCategory("Fruits");


        manager.updateQuantity("Apples", 5);


        System.out.println("\nUpdated Grocery List with new quantity:");
        manager.displayList();


        System.out.println("\nTotal cost: €" + manager.calculateTotalCost());
    }
}

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Create items
        Item item1 = new Item("T-Shirt1", 19.99, "Medium", "Blue", 3);
        Item item2 = new Item("T-Shirt2", 24.99, "Large", "Red", 2);
        Item item3 = new Item("T-Shirt3", 29.99, "Small", "Green", 1);
        Item item4 = new Item("T-Shirt4", 22.99, "Medium", "Black", 4);
        Item item5 = new Item("T-Shirt5", 18.99, "Large", "White", 5);

        // Create users
        User user1 = new User("john_doe", "john@example.com");
        User user2 = new User("jane_smith", "jane@example.com");

        // Create orders and add items to them
        Order order1 = new Order(1);
        order1.getItems().add(item1);
        order1.getItems().add(item2);

        Order order2 = new Order(2);
        order2.getItems().add(item3);
        order2.getItems().add(item4);

        Order order3 = new Order(3);
        order3.getItems().add(item5);

        Order order4 = new Order(4);
        order4.getItems().add(item1);
        order4.getItems().add(item3);

        // Add orders to users
        user1.getOrders().add(order1);
        user1.getOrders().add(order2);

        user2.getOrders().add(order3);
        user2.getOrders().add(order4);

        // Print some information for demonstration
        System.out.println("User: " + user1.getUsername());
        for (Order order : user1.getOrders()) {
            System.out.println("  Order ID: " + order.getOrderId());
            for (Item item : order.getItems()) {
                System.out.println("    Item: " + item.getName() +
                        ", Price: $" + item.getPrice() +
                        ", Quantity: " + item.getQuantity());
            }
        }

        System.out.println("\nUser: " + user2.getUsername());
        for (Order order : user2.getOrders()) {
            System.out.println("  Order ID: " + order.getOrderId());
            for (Item item : order.getItems()) {
                System.out.println("    Item: " + item.getName() +
                        ", Price: $" + item.getPrice() +
                        ", Quantity: " + item.getQuantity());
            }
        }
    }
}

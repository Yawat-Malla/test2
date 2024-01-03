import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<Item> items;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

    // Getters and setters

    public int getOrderId() {
        return orderId;
    }

    public List<Item> getItems() {
        return items;
    }

    // Additional methods if needed
}

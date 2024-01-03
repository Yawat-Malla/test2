import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Order> orders;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    // Getters and setters

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<Order> getOrders() {
        return orders;
    }

    // Additional methods if needed
}

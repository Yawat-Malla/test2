public class Item {
    private String name;
    private double price;
    private String size;
    private String color;
    private int quantity;

    public Item(String name, double price, String size, String color, int quantity) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    // Additional methods if needed
}

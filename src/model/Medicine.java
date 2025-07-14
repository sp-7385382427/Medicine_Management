package model;

public class Medicine {
    private int id;
    private String name;
    private String brand;
    private double price;
    private int quantity;

    public Medicine() {}

    public Medicine(int id, String name, String brand, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "Medicine [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
    }
}

package Inventory;

public class Product {
    private int number;
    private String name;
    private int quantity;
    private double price;

    public Product (int Number, String Name, int Quantity, double price) {
        this.number = number;
        this.name = name;
        this.quantity = Quantity;
        this.price = price;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
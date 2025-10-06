public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return price * quantity;
    }

    public void showProduct() {
        System.out.printf("%-15s x%d \tRp %.2f\n", name, quantity, getSubtotal());
    }
}

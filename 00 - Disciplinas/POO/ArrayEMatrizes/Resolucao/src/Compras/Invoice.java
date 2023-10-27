package Compras;

public class Invoice {
    private int id;
    private String desc;
    private int quantity;
    private double price;
        
    public Invoice(int id, String desc, int quantity, double price) {
        this.id = id;
        this.desc = desc;
        setQuantity(quantity);
        setPrice(price);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = (quantity >= 0) ? quantity : 0;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = (price >= 0.0f) ? price : 0;
    }

    public double getInvoiceAmount() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("%5d %10s %3d %3.2f", id, desc, quantity, price);
    }
}

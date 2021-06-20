package business.entities;

public class OrderContent {
    int id;
    int toppingId;
    int bottomId;
    int quantity;
    double price;
    int orderId;


    public OrderContent(int id, int toppingId, int bottomId, int quantity, double price, int orderId) {
        this.id = id;
        this.toppingId = toppingId;
        this.bottomId = bottomId;
        this.quantity = quantity;
        this.price = price;
        this.orderId = orderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getToppingId() {
        return toppingId;
    }

    public void setToppingId(int toppingId) {
        this.toppingId = toppingId;
    }

    public int getBottomId() {
        return bottomId;
    }

    public void setBottomId(int bottomId) {
        this.bottomId = bottomId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

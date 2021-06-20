package business.entities;

import java.sql.Timestamp;

public class Orders {
    int orderId;
    int userId;
    double orderPrice;
    Timestamp timestamp;

    public Orders(int orderId, int userId, double orderPrice, Timestamp timestamp) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderPrice = orderPrice;
        this.timestamp = timestamp;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}

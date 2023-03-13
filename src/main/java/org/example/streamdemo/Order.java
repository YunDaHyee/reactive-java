package org.example.streamdemo;

public class Order {
    private int orderNumber;
    private String orderPerson;
    private String product;
    private int price;

    public Order() {}

    public Order(int orderNumber, String orderPerson, String product, int price) {
        this.orderNumber = orderNumber;
        this.orderPerson = orderPerson;
        this.product = product;
        this.price = price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderPerson() {
        return orderPerson;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", orderPerson='" + orderPerson + '\'' +
                ", product='" + product + '\'' +
                ", orderDate='" + price + '\'' +
                '}';
    }
}

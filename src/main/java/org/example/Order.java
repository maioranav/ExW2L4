package org.example;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    public static ArrayList<Order> orders = new ArrayList<>();

    @Getter
    private long id;
    public static long lastid = 0;
    @Getter
    @Setter
    private String status = "In elaborazione";
    @Getter
    @Setter
    private LocalDate orderDate;
    @Getter
    private LocalDate deliveryDate;
    @Getter
    private List<Product> products = new ArrayList<>();
    @Getter
    @Setter
    private Customer customer;

    public Order() {
        this.id = Order.lastid++;
        this.orderDate = LocalDate.now();
        this.deliveryDate = LocalDate.now().plusDays(3);
    }

    public Order(Customer cust) {
        this();
        this.customer = cust;
    }

    public Order(Customer cust, LocalDate date) {
        this(cust);
        this.orderDate = date;
        this.deliveryDate = date.plusDays(3);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", customer=" + customer.getName() +
                '}';
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

}

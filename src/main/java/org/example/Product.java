package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Product {

    @Getter
    private long id;
    public static long lastid = 0;
    @Getter
    private String name = "No Name";
    @Getter
    private String category = "Generic";
    @Getter
    @Setter
    private double price = 0.00d;

    public Product() {
        this.id = Product.lastid++;
    }

    public Product(String name) {
        this();
        this.name = name;
    }

    public Product(String name, double price) {
        this(name);
        this.price = price;
    }

    public Product(String name, String cat, double price) {
        this(name, price);
        this.category = cat;
    }

    public void sconto(Product p, double scontopc) {
        double temprice = p.getPrice();
        double pricediscount = temprice - (temprice * scontopc);
        p.setPrice(pricediscount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

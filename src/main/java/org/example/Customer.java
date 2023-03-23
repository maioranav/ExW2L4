package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Customer {

    @Getter
    private long id;
    public static long lastid = 0;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int tier = 1;

    public Customer(String name) {
        this.id = Customer.lastid++;
        this.name = name;
    }

    public Customer(String name, int tier) {
        this(name);
        this.tier = tier;
    }
}

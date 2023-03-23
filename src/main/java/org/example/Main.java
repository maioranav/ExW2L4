package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static ArrayList<Customer> customers = new ArrayList<>();
    public static ArrayList<Product> products = new ArrayList<>();
    public static ArrayList<Order> orders = new ArrayList<>();

    public static void main(String[] args) {

        //CREO I CLIENTI
        customers.add(new Customer("Vincenzo Maiorana", 2));
        customers.add(new Customer("Giovanni Muciaccia"));
        customers.add(new Customer("Alfredo Goffredo", 2));
        customers.add(new Customer("Gustavo Lapatong", 1));

        //CREO I PRODOTTI
        products.add(new Product("Il soldato", "Books", 129.00d));
        products.add(new Product("Ryan Jets", "Books", 101.00d));
        products.add(new Product("Orsacchiotto", "Baby", 12.90d));
        products.add(new Product("La papera di gomma", "Books", 97.90d));
        products.add(new Product("Bambola", "Boys", 25.99d));
        products.add(new Product("Macchinina", "Girls", 32.90d));
        products.add(new Product("Pupazzo", "Baby", 84.70d));
        products.add(new Product("Mangime per cani", "Boys", 97.45d));

        //CREO GLI ORDINI
        orders.add(new Order(customers.get(0)));    //0
        orders.add(new Order(customers.get(1)));    //1
        orders.add(new Order(customers.get(2)));    //2
        orders.add(new Order(customers.get(3)));    //3

        //AGGIUNGO I PRODOTTI AGLI ORDINI
        orders.get(0).addProduct(products.get(1));
        orders.get(0).addProduct(products.get(3));
        orders.get(0).addProduct(products.get(7));
        orders.get(0).addProduct(products.get(0));
        orders.get(1).addProduct(products.get(4));
        orders.get(1).addProduct(products.get(6));
        orders.get(1).addProduct(products.get(3));
        orders.get(1).addProduct(products.get(1));
        orders.get(1).addProduct(products.get(0));
        orders.get(2).addProduct(products.get(0));
        orders.get(2).addProduct(products.get(2));
        orders.get(2).addProduct(products.get(5));
        orders.get(2).addProduct(products.get(7));
        orders.get(3).addProduct(products.get(4));
        orders.get(3).addProduct(products.get(2));
        orders.get(3).addProduct(products.get(0));

        //INIZIO ESERCIZI SU JAVA STREAM
        System.out.println("\n=> ESERCIZIO 1 ");
        List<Product> ex1 = products.stream().filter(n -> n.getCategory().equals("Books")).filter(n -> n.getPrice() > 100d).toList();
        System.out.println(ex1.toString());

        System.out.println("\n=> ESERCIZIO 2 ");
        List<Order> ex2 = orders.stream().filter(n -> n.getProducts().stream().anyMatch(el -> el.getCategory().equals("Baby"))).toList();
        System.out.println(ex2.toString());

        System.out.println("\n=> ESERCIZIO 3 - PRIMA ");
        List<Product> ex3 = products.stream().filter(n -> n.getCategory().equals("Boys")).toList();
        System.out.println(ex3.toString());
        System.out.println("\n=> ESERCIZIO 3 - DOPO ");
        products.stream().filter(n -> n.getCategory().equals("Boys")).forEach(m -> m.sconto(0.10d));
        System.out.println(ex3.toString());

        System.out.println("\n=> ESERCIZIO 4 ");
        List<Product> ex4 = new ArrayList<>();
        orders.stream().filter(n -> n.getCustomer().getTier() == 2).forEach(el -> ex4.addAll(el.getProducts()));
        System.out.println(ex4.toString());

    }
}
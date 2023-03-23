package org.example;

import java.util.ArrayList;

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

        /* 0 */
        products.add(new Product("Il soldato", "Books", 129.00d));
        /* 1 */
        products.add(new Product("Ryan Jets", "Books", 101.00d));
        /* 2 */
        products.add(new Product("Orsacchiotto", "Baby", 12.90d));
        /* 3 */
        products.add(new Product("La papera di gomma", "Books", 97.90d));
        /* 4 */
        products.add(new Product("Bambola", "Boys", 25.99d));
        /* 5 */
        products.add(new Product("Macchinina", "Girls", 32.90d));
        /* 6 */
        products.add(new Product("Pupazzo", "Baby", 84.70d));
        /* 7 */
        products.add(new Product("Mangime per cani", "Boys", 97.45d));

        //CREO GLI ORDINI
        orders.add(new Order(customers.get(0)));    //0
        orders.add(new Order(customers.get(1)));    //1
        orders.add(new Order(customers.get(2)));    //2
        orders.add(new Order(customers.get(3)));    //3

        //AGGIUNGO I PRODOTTI AGLI ORDINI
        orders.get(0).addProduct(products.get(1));
        orders.get(0).addProduct(products.get(3));
        orders.get(0).addProduct(products.get(2));
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


    }
}
package com.techelevator;

public abstract class Product {
    private String name;
    private double price;
    private int quantity = 5;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract String getSound();

    @Override
    public String toString() {
        return name + ": $" + price + ", ";
    }
}

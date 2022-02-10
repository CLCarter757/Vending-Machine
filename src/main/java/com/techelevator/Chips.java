package com.techelevator;

public class Chips {
    private String name;
    private double price;

    //constructor
    public Chips(String name, double price){
        this.name = name;
        this.price = price;
    }
    //getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package com.techelevator;

public class Beverages extends Product {

    //constructor
    public Beverages(String name, double price){
        super(name, price);
    }

    public String getSound() {
        return "Glug Glug, Yum!";
    }
}

package com.techelevator;

public class Beverage extends Product {

    //constructor
    public Beverage(String name, double price){
        super(name, price);
    }

    public Beverage() {

    }

    @Override
    public String getSound() {
        return "Glug Glug, Yum!";
    }
}

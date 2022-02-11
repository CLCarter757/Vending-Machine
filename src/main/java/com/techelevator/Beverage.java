package com.techelevator;

public class Beverage extends Product {

    //constructor
    public Beverage(String name, double price){
        super(name, price);
    }

    @Override
    public String getSound() {
        return "Glug Glug, Yum!";
    }
}

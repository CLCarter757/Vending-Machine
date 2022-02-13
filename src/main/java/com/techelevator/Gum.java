package com.techelevator;

public class Gum extends Product {

    public Gum(String name, double price){
        super(name, price);
    }
    public Gum() {

    }

    @Override
    public String getSound() {
        return "Chew Chew, Yum!";
    }
}

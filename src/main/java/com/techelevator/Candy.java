package com.techelevator;

import java.io.PrintWriter;

public class Candy extends Product {

    public Candy(String name, double price){
        super(name, price);
    }

    @Override
    public String getSound() {
        return "Munch Munch, Yum!";
    }
}

package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Product {

    public Candy(String name, BigDecimal price){
        super(name, price);
    }

    public Candy() {

    }

    @Override
    public String getSound() {
        return "Munch Munch, Yum!";
    }
}

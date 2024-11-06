package com.example.decorator;

public class ThinPizza implements Pizza {
    @Override
    public String listOrder() {
        return "Thin crust pizza with tomato sauce";
    }

    @Override
    public double getCost() {
        return 7.99;
    }
}
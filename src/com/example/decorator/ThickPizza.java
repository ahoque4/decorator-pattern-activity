package com.example.decorator;

public class ThickPizza implements Pizza {
    @Override
    public String listOrder() {
        return "Thick crust pizza with tomato sauce";
    }

    @Override
    public double getCost() {
        return 7.99;
    }
}
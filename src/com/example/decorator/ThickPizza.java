package com.example.decorator;

public class ThickPizza implements Pizza {
    @Override
    public String listOrder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getCost() {
        throw new UnsupportedOperationException();
    }
}

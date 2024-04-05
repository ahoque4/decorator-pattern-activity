package com.example.decorator;

public class ThinPizza implements Pizza {
    @Override
    public String listOrder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getCost() {
        throw new UnsupportedOperationException();
    }
}

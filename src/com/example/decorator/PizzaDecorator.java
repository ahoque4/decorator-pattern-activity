package com.example.decorator;

public abstract class PizzaDecorator implements Pizza {
    @Override
    public String listOrder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getCost() {
        throw new UnsupportedOperationException();
    }
}

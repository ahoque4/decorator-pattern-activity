package com.example.decorator;

public class MushroomDecorator extends PizzaDecorator {
    public String listOrder() {
        throw new UnsupportedOperationException();
    }
    public double getCost() {
        throw new UnsupportedOperationException();
    }
}

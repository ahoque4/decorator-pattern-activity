package com.example.decorator;

public class ExtraCheeseDecorator extends PizzaDecorator {
    public String listOrder() {
        throw new UnsupportedOperationException();
    }
    public double getCost() {
        throw new UnsupportedOperationException();
    }
}

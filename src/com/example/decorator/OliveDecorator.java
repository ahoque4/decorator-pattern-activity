package com.example.decorator;

public class OliveDecorator extends PizzaDecorator {
    public String listOrder() {
        throw new UnsupportedOperationException();
    }
    public double getCost() {
        throw new UnsupportedOperationException();
    }
}

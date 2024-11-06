package com.example.decorator;

public class OliveDecorator extends PizzaDecorator {
    private final Pizza pizza;

    public OliveDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String listOrder() {
        return pizza.listOrder() + ", Olives";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 0.30;
    }
}
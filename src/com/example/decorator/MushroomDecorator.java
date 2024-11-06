package com.example.decorator;

public class MushroomDecorator extends PizzaDecorator {
    private final Pizza pizza;

    public MushroomDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String listOrder() {
        return pizza.listOrder() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 0.20;
    }
}
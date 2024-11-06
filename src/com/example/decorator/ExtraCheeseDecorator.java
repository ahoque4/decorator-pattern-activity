package com.example.decorator;

public class ExtraCheeseDecorator extends PizzaDecorator {
    private final Pizza pizza;

    public ExtraCheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String listOrder() {
        return pizza.listOrder() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 0.20;
    }
}
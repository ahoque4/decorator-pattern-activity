package com.example.decorator;

public class JalapenoDecorator extends PizzaDecorator {
    private final Pizza pizza;

    public JalapenoDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String listOrder() {
        return pizza.listOrder() + ", Jalapenos";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 0.10;
    }
}
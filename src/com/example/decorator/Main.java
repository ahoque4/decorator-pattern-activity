package com.example.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new MushroomDecorator(new OliveDecorator(new JalapenoDecorator(new ExtraCheeseDecorator(new ThinPizza()))));
        System.out.println(pizza.listOrder());
        System.out.println(pizza.getCost());

        pizza = new MushroomDecorator(new OliveDecorator(new ThickPizza()));
        System.out.println(pizza.listOrder());
        System.out.println(pizza.getCost());
    }
}

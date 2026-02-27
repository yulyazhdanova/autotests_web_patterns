package ru.training.at.builder;

public class Main {

    public static void main(String[] args) {

        Dough thin = new Thin();
        Souse bbg = new BBQ();
        Delivery goYourSelf = new GoYourSelf();
        Filling hum = new Hum();
        Filling cheese = new Cheese();
        PizzaOrder pizzaOrder = new PizzaOrder.Builder("Маленькая")
                .chooseDough(thin)
                .chooseDelivery(goYourSelf)
                .chooseSouse(bbg)
                .chooseFilling(hum)
                .chooseFilling(cheese)
                .build();
        System.out.println(pizzaOrder);
    }
}

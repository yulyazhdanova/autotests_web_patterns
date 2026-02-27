package ru.training.at.decorator;

public class TermoPackage extends OrderDecorator {

    public TermoPackage(OrderInterface orderInterface) {
        super(orderInterface);
    }

    @Override
    public int getPrice() {
        return orderInterface.getPrice()+500;
    }

    @Override
    public String getDescription() {
        return orderInterface.getDescription()+ "Добавили услугу Упаковка в термосумку";
    }
}
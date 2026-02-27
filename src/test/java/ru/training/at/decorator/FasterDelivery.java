package ru.training.at.decorator;

public class FasterDelivery extends OrderDecorator {

    public FasterDelivery(OrderInterface orderInterface) {
        super(orderInterface);
    }

    @Override
    public int getPrice() {
        return orderInterface.getPrice()+200;
    }

    @Override
    public String getDescription() {
        return orderInterface.getDescription()+ " Добавили услугу Быстрая доставка ";
    }
}


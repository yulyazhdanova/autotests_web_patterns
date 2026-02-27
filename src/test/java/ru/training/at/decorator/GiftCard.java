package ru.training.at.decorator;

public class GiftCard extends OrderDecorator {

    public GiftCard(OrderInterface orderInterface) {
        super(orderInterface);
    }

    @Override
    public int getPrice() {
        return orderInterface.getPrice()+300;
    }

    @Override
    public String getDescription() {
        return orderInterface.getDescription()+ " Добавили услугу Поздравительная открытка ";
    }
}

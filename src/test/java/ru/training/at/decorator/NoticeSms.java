package ru.training.at.decorator;

public class NoticeSms extends OrderDecorator {

    public NoticeSms(OrderInterface orderInterface) {
        super(orderInterface);
    }

    @Override
    public int getPrice() {
        return orderInterface.getPrice()+50;
    }

    @Override
    public String getDescription() {
        return orderInterface.getDescription()+ "Добавили услугу Уведомление по SMS";
    }

}


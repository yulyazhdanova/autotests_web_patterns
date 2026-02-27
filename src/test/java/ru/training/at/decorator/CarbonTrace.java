package ru.training.at.decorator;

public class CarbonTrace extends OrderDecorator{

    public CarbonTrace(OrderInterface orderInterface) {
        super(orderInterface);
    }

    @Override
    public int getPrice() {
        return orderInterface.getPrice()+100;
    }

    @Override
    public String getDescription() {
        return orderInterface.getDescription() + " Добавили услугу Оценка углеродного следа доставки ";
    }
}
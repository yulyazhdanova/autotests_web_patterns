package ru.training.at.decorator;

abstract class OrderDecorator implements OrderInterface {

    protected OrderInterface orderInterface;

    public OrderDecorator(OrderInterface orderInterface) {
        this.orderInterface = orderInterface;
    }
}

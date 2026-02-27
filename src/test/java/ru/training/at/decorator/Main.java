package ru.training.at.decorator;

public class Main {

    public static void main(String[] args) {
        OrderInterface order = new BaseOrder();
        order = new FasterDelivery(order);
        order = new TermoPackage(order);
        order = new GiftCard(order);
        order = new CarbonTrace(order);
        order = new NoticeSms(order);
        System.out.println(order.getPrice());
        System.out.println(order.getDescription());

    }
}

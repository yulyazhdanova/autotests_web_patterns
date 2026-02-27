package ru.training.at.builder;

interface Delivery {
    String getDelivery();
}
class GoHome implements Delivery {
    public String getDelivery() {
        return "Доставка";
    }
}
class GoYourSelf implements Delivery {
    public String getDelivery() {
        return "Самовывоз";
    }
}

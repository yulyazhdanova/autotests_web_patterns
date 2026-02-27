package ru.training.at.builder;

interface Filling {
    String getFilling();
}
class Cheese implements Filling {
    public String getFilling() {
        return "Сыр";
    }
}
class Hum implements Filling {
    public String getFilling() {
        return "Ветчина";
    }
}
class Mushrooms implements Filling {
    public String getFilling() {
        return "Грибы";
    }
}

package ru.training.at.builder;

interface Souse {
    String getSouse();
}
class Tomato implements Souse {
    public String getSouse() {
        return "Томатный";
    }
}
class Creamy implements Souse {
    public String getSouse() {
        return "Сливочный";
    }
}
class BBQ implements Souse {
    public String getSouse() {
        return "Барбекью";
    }
}

package ru.training.at.builder;

interface Dough {
    String getDough();
}
class Thin implements Dough {
    public String getDough() {
        return "Тонкое";
    }
}
class Traditional implements Dough {
    public String getDough() {
        return "Традиционное";
    }
}

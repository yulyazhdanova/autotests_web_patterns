package ru.training.at.builder;

public class PizzaOrder {

    private String size;

    private PizzaOrder(Builder builder) {
        this.size = builder.size;
    }

    public static class Builder {

        private String size;

        public Builder(String size) {
            this.size = size;
        }
        public Builder chooseDough(Dough dough) {
            System.out.println("Выбрать тесто " + dough.getDough());
            return this;
        }
        public Builder chooseSouse(Souse souse) {
            System.out.println("Выбрать соус " + souse.getSouse());
            return this;
        }
        public Builder chooseFilling(Filling filling) {
            System.out.println("Выбрать начинку " + filling.getFilling());
            return this;
        }
        public Builder chooseDelivery(Delivery delivery) {
            System.out.println("Выбрать доставку " + delivery.getDelivery());
            return this;
        }
        public PizzaOrder build(){
            return new PizzaOrder(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "size='" + size + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "size='" + size + '\'' +
                '}';
    }
}
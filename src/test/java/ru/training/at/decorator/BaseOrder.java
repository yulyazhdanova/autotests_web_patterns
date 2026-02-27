package ru.training.at.decorator;

import java.util.HashMap;
import java.util.Map;

public class BaseOrder implements OrderInterface{

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getDescription() {
        return "Заказ создан";
    }

}

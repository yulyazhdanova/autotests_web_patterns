package ru.training.at.homework1_with_mock;

import com.epam.tat.module4.Calculator;

public class BeforeClass {

    public Calculator calculator;

    @org.testng.annotations.BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

}

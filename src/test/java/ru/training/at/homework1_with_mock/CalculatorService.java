package ru.training.at.homework1_with_mock;

import com.epam.tat.module4.Calculator;

public class CalculatorService {

    private final Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public long sumAndMultiplyByTwo(long a, long b) {
        return calculator.sum(a, b) * 2;
    }

    public boolean isPositiveDifference(long a, long b) {
        return calculator.sub(a, b) > 0;
    }

}

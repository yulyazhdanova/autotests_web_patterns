package ru.training.at.homework1_with_mock;

import com.epam.tat.module4.Calculator;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class CalculatorServiceTest {

    @Test
    public void sumAndMultiplyByTwoTest(){
        Calculator calculator = Mockito.mock(Calculator.class); //фейковый объект
        Mockito.when(calculator.sum(2L,3L)).thenReturn(5L);
        CalculatorService calculatorService = new CalculatorService(calculator);
        long actual = calculatorService.sumAndMultiplyByTwo(2L,3L);
        Assert.assertEquals(actual, 10L);
        Mockito.verify(calculator).sum(2L,3L);
    }

    @Test
    public void isPositiveDifferenceTest(){
        Calculator calculator = Mockito.mock(Calculator.class);
        Mockito.when(calculator.sub(3L,2L)).thenReturn(1L);
        CalculatorService calculatorService = new CalculatorService(calculator);
        boolean actual = calculatorService.isPositiveDifference(3L,2L);
        Assert.assertTrue(actual);
        Mockito.verify(calculator).sub(3L,2L);
    }
}

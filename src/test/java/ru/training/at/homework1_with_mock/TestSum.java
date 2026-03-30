package ru.training.at.homework1_with_mock;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSum extends BeforeClass {

    @Test(dataProvider = "LongData", dataProviderClass = DataProviderTest.class)
    public void sumTest(long a, long b) {
        long expected = a + b;
        Assert.assertEquals(calculator.sum(a, b), expected);
    }

    @Test(dataProvider = "DoubleData", dataProviderClass = DataProviderTest.class)
    public void sumTest(double a, double b) {
        double expected = a + b;
        Assert.assertEquals(calculator.sum(a, b),expected);
    }

}

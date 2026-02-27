package ru.training.at.hw1.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMult extends BeforeClass {

    @Test(dataProvider = "LongData",dataProviderClass = DataProviderTest.class)
    public void multTest(long a,long b){
        int expected = (int) (a*b);
        Assert.assertEquals(calculator.mult(a, b),expected);
    }
    @Test(dataProvider = "DoubleData",dataProviderClass = DataProviderTest.class)
    public void multTest(double a,double b){
        int expected = (int) (a*b);
        Assert.assertEquals(calculator.mult(a, b),expected);
    }
}

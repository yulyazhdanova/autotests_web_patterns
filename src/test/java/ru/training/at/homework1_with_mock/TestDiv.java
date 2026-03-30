package ru.training.at.homework1_with_mock;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDiv extends BeforeClass {

    @Test(dataProvider = "LongData", dataProviderClass = DataProviderTest.class)
    public void divTest(long a, long b) {
        if (b == 0) {
            throw new NumberFormatException("Деление на 0 запрещено");
        } else {
            long expected = (a / b);
            Assert.assertEquals(calculator.div(a, b), expected);
        }
    }

    @Test(dataProvider = "DoubleData", dataProviderClass = DataProviderTest.class)
    public void divTest(double a, double b)  {
//        if (b == 0) {
//            calculator.div(a,b);
//        } else {
            double expected = (a / b);
            Assert.assertEquals(calculator.div(a, b), expected);
       // }
    }

    @Test(dataProvider = "dataForDivideByZero", dataProviderClass = DataProviderTest.class, expectedExceptions = NumberFormatException.class)
    public void divideByZero(long a, long b) {
        calculator.div(a,b);
//        if (b == 0) {
//            throw new NumberFormatException("Деление на 0 запрещено");
//        } else {
//            int expected = (a / b);
  //          Assert.assertEquals(calculator.div(a, b), );
       // }
    }
}

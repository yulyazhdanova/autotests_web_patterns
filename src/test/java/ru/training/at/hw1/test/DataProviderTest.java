package ru.training.at.hw1.test;

public class DataProviderTest {

    @org.testng.annotations.DataProvider(name = "LongData")
    public static Object[][] longTestData(){
        return new Object[][]{
                {1L,2L},{321L,363L},{13L,22L},{0,0},{-1L,-2L}
        };
    }
    @org.testng.annotations.DataProvider(name = "DoubleData")
    public static Object[][] doubleTestData(){
        return new Object[][]{
                {342.66,4933.99},{1.23,2.44},{56.00,31.00},{0,0},{-1.12,-2.94}
        };
    }
    @org.testng.annotations.DataProvider(name = "dataForDivideByZero")
    public static Object[][] dataForDivideByZero(){
        return new Object[][]{
                {342,0},{53,0},{-34,0},{-25,0},{-342,0}
        };
    }
}

package ru.training.at.hw3_open_browsers_for_selenium_grid.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.training.at.hw3_open_browsers_for_selenium_grid.projectUtils.BeforeClass;
import ru.training.at.hw3_open_browsers_for_selenium_grid.projectUtils.DriverManager;

public class OpenGoogleTest {

    @BeforeMethod
    public void setUp() {
        DriverManager.setDriver(BeforeClass.createWebDriver());
    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDown() {
//        DriverManager.quitDriver();
//    }

    @Test
    public void testGoogleTest(){

        DriverManager.getDriver().get("https://www.google.com");
        //webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title = DriverManager.getDriver().getTitle();
        System.out.println("Title = " + title);
        Assert.assertTrue(title.length() > 0);
    }
}

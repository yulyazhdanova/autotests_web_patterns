package ru.training.at.cucumber_gherkin.projectUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BeforeClass {

    private static WebDriver webDriver;

    public static WebDriver createWebDriver(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return webDriver;
    }
}

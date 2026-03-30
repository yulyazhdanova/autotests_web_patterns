package ru.training.at.hw3_for_selenium_grid.projectUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.time.Duration;

public class BeforeClass {

    private static WebDriver webDriver;

    public static WebDriver createWebDriver(){
        try {
            //WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            //webDriver = new ChromeDriver();
            webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
            webDriver.manage().window().maximize();
            return webDriver;
        }
        catch (Exception e){
            throw new RuntimeException("Не удалось создать RemoteWebDrive");
        }
    }
}

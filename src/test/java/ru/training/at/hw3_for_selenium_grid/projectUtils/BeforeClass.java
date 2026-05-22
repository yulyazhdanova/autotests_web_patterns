package ru.training.at.hw3_for_selenium_grid.projectUtils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.time.Duration;

public class BeforeClass {

    public static WebDriver createWebDriver() {
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            WebDriver driver = new RemoteWebDriver(
                    new URL("http://localhost:4444/wd/hub"),
                    options
            );

            driver.manage().window().setSize(new Dimension(1920, 1080));
            return driver;
        } catch (Exception e) {
            throw new RuntimeException("Не удалось создать RemoteWebDriver", e);
        }
    }
}

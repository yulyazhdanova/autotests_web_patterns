package ru.training.at.hw2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import ru.training.at.hw2.data.TestData;

public class BaseClass {

    protected WebDriver webDriver;
    protected String windowHandle;

    @BeforeMethod
    public void beforeCondition(){
        WebDriverManager.chromedriver();
        //webDriver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        webDriver = new ChromeDriver(options);

        webDriver.manage().window().maximize();
        // 1. Open test site by URL
        webDriver.navigate().to(TestData.URL);
        windowHandle = webDriver.getWindowHandle();//строковое представление имя вкладки
        System.out.println(windowHandle);
        // 2. Assert Browser title
        Assert.assertEquals(webDriver.getTitle(),TestData.HOME_PAGE_TITLE);
        //3	Perform login	username: Roman pass: Jdi1234
        WebElement userIcon = webDriver.findElement((By.id("user-icon")));
        userIcon.click();
        WebElement name = webDriver.findElement((By.id("name")));
        name.sendKeys("Roman");
        WebElement password = webDriver.findElement((By.id("password")));
        password.sendKeys("Jdi1234");
        WebElement loginButton = webDriver.findElement((By.id("login-button")));
        loginButton.click();
        //4	Assert Username is loggined	"ROMAN IOVLEV"
        WebElement userName = webDriver.findElement((By.id("user-name")));
        Assert.assertEquals(userName.getText(), TestData.USER_NAME);
    }
}

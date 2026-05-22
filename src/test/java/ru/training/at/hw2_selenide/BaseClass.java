package ru.training.at.hw2_selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import ru.training.at.hw2_selenide.data.TestData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.id;

public class BaseClass {

    protected WebDriver webDriver;
    protected String windowHandle;

    @Test
    public void beforeCondition(){

        // 1. Open test site by URL
        open(TestData.URL);
        // 2. Assert Browser title
        String currentTitle = Selenide.title();
        Assert.assertEquals(currentTitle,TestData.HOME_PAGE_TITLE);
        // 3. Perform login	username: Roman pass: Jdi1234
        $(id("user-icon")).click();
        $(id("name")).setValue("Roman");
        $(id("password")).setValue("Jdi1234");
        $(id("login-button")).click();
        //4	Assert Username is loggined	"ROMAN IOVLEV"
        $(id("user-name")).shouldHave(text(TestData.USER_NAME));
        Configuration.holdBrowserOpen = true;


        //webDriver.navigate().to(TestData.URL);
        //windowHandle = webDriver.getWindowHandle();//строковое представление имя вкладки
        //System.out.println(windowHandle);
        // 2. Assert Browser title
        //Assert.assertEquals(webDriver.getTitle(), TestData.HOME_PAGE_TITLE);
        //3	Perform login	username: Roman pass: Jdi1234
        //WebElement userIcon = webDriver.findElement((id("user-icon")));
        //userIcon.click();
        //WebElement name = webDriver.findElement((id("name")));
        //name.sendKeys("Roman");
        //WebElement password = webDriver.findElement((id("password")));
        //password.sendKeys("Jdi1234");
        //WebElement loginButton = webDriver.findElement((id("login-button")));
        //loginButton.click();
        //4	Assert Username is loggined	"ROMAN IOVLEV"
        //WebElement userName = webDriver.findElement((id("user-name")));
        //Assert.assertEquals(userName.getText(), TestData.USER_NAME);
    }
}

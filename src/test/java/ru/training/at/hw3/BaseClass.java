package ru.training.at.hw3;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import ru.training.at.hw3.data.TestData;
import ru.training.at.hw3.pages.DifferentElementsPage;
import ru.training.at.hw3.pages.HomePage;
import ru.training.at.hw3.projectUtils.BeforeClass;
import ru.training.at.hw3.pages.LoginPage;

public class BaseClass {

    //Decorator
    protected WebDriver webDriver;
    protected String windowHandle;
    protected HomePage homePage;
    protected ru.training.at.hw3.pages.LoginPage loginPage;
    protected DifferentElementsPage differentElementsPage;

    // 1. Open test site by URL
    public void initializer(){
        webDriver = BeforeClass.createWebDriver();
        windowHandle = webDriver.getWindowHandle();
        homePage = new HomePage(webDriver);
        loginPage = new LoginPage(webDriver);
        differentElementsPage = new DifferentElementsPage(webDriver);
        homePage.openHomePage();
    }
    // 2. Assert Browser title
    public void assertBrowserTitle(){
     Assert.assertEquals(homePage.getTitle(), TestData.HOME_PAGE_TITLE);
    }
    //3	Perform login	username: Roman pass: Jdi1234
    public void clickUserIcon(){
        loginPage = homePage.login();
    }
    //4	Assert Username is loggined	"ROMAN IOVLEV"
    public void assertUserName(){
        Assert.assertEquals(homePage.getUserNameLogin().getText(),TestData.USER_NAME);
    }

    @BeforeMethod
    public void beforeCondition(){
        initializer();
        assertBrowserTitle();
        clickUserIcon();
        assertUserName();
    }
}

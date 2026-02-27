package ru.training.at.hw4.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import ru.training.at.hw4.data.TestData;
import ru.training.at.hw4.pages.DifferentElementsPage;
import ru.training.at.hw4.pages.HomePage;
import ru.training.at.hw4.pages.LoginPage;
import ru.training.at.hw4.projectUtils.BeforeClass;
import ru.training.at.hw4.test.steps.HomePageSteps;
import ru.training.at.hw4.test.steps.LoginPageSteps;

public class BaseClass {

    //Decorator
    protected WebDriver webDriver;
    protected String windowHandle;
    protected HomePage homePage;
    protected LoginPage loginPage;
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
        HomePageSteps.checkHomePageWithCorrectTitle(homePage, TestData.HOME_PAGE_TITLE);
    }
    //3	Perform login	username: Roman pass: Jdi1234
    public void loginUser(){
        loginPage = HomePageSteps.loginUser(homePage);
    }
    //4	Assert Username is loggined	"ROMAN IOVLEV"
    public void assertUserName(){
        LoginPageSteps.checkUserName(homePage,TestData.USER_NAME);
    }

    @BeforeMethod
    public void beforeCondition(){
        initializer();
        assertBrowserTitle();
        loginUser();
        assertUserName();
    }
}

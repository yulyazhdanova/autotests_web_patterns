package ru.training.at.cucumber_gherkin.context;

import org.openqa.selenium.WebDriver;
import ru.training.at.cucumber_gherkin.pages.DifferentElementsPage;
import ru.training.at.cucumber_gherkin.pages.HomePage;
import ru.training.at.cucumber_gherkin.pages.LoginPage;
import ru.training.at.cucumber_gherkin.projectUtils.BeforeClass;

public class TestContext {

    private WebDriver webDriver;
    private HomePage homepage;
    private LoginPage loginPage;
    private DifferentElementsPage differentElementsPage;

    public void init(){
        webDriver = BeforeClass.createWebDriver();
        homepage = new HomePage(webDriver);
        loginPage = new LoginPage(webDriver);
        differentElementsPage = new DifferentElementsPage(webDriver);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public HomePage getHomepage() {
        return homepage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public DifferentElementsPage getDifferentElementsPage() {
        return differentElementsPage;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setHomepage(HomePage homepage) {
        this.homepage = homepage;
    }

    public void setLoginPage(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public void setDifferentElementsPage(DifferentElementsPage differentElementsPage) {
        this.differentElementsPage = differentElementsPage;
    }
}

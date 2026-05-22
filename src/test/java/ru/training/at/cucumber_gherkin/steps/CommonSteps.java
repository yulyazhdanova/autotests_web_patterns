package ru.training.at.cucumber_gherkin.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import ru.training.at.cucumber_gherkin.context.TestContext;
import ru.training.at.cucumber_gherkin.data.TestData;

public class CommonSteps {

    private TestContext context;

    public CommonSteps(TestContext context) {
        this.context = context;
    }

    @Given("пользователь открывает главную страницу JDI")
    public void openJdiHomePage() {
        context.getHomepage().openHomePage();
    }

    @Then("заголовок браузера должен быть {string}")
    public void browserTitleShouldBe(String expectedTitle) {
        Assert.assertEquals(context.getHomepage().getTitle(), TestData.HOME_PAGE_TITLE);
    }

    @When("пользователь выполняет вход как ROMAN IOVLEV")
    public void loginAsRomanIovlev() {
        context.setLoginPage(context.getHomepage().login());
    }

    @Then("имя пользователя должно отображаться как {string}")
    public void userNameShouldBeDisplayedAs(String expectedUserName) {
        Assert.assertEquals(
                context.getHomepage().getUserNameLogin().getText(),
                TestData.USER_NAME
        );
    }
}

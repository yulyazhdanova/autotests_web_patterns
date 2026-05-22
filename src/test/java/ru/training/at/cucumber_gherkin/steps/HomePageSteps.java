package ru.training.at.cucumber_gherkin.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ru.training.at.cucumber_gherkin.context.TestContext;
import ru.training.at.cucumber_gherkin.data.TestData;

public class HomePageSteps{

    private TestContext context;

    public HomePageSteps(TestContext context) {
        this.context = context;
    }

    @Then("в верхнем меню должно отображаться 4 элемента")
    public void assertHeaderElementsIsDisplayed(){
        for (WebElement we: context.getLoginPage().getHeaderElements()) {
            Assert.assertTrue(we.isDisplayed());
        }
    }
    @And("верхнее меню должно содержать корректные тексты")
    public void assertHeaderElementsCorrect(){
        for(int i = 0; i< TestData.HEADER_ELEMENTS.size(); i++){
            Assert.assertEquals(context.getLoginPage().getHeaderElements().get(i).getText(), TestData.HEADER_ELEMENTS.get(i));
        }
    }
    @And("на главной странице должно отображаться 4 иконки преимуществ")
    public void assertIconPreferences(){
        for (WebElement we: context.getLoginPage().getIconList()){
            we.isDisplayed();
        }
    }
    @And("на главной странице должны отображаться корректные тексты преимуществ")
    public void assertTextListPreferences(){
        for(int i = 0; i< context.getLoginPage().getTextList().size(); i++){
            Assert.assertEquals(context.getLoginPage().getTextList().get(i).getText(), TestData.TEXT_ELEMENTS.get(i));
        }
    }
    @And("iFrame должен отображаться")
    public void assertFrameIsDisplayed(){
        Assert.assertTrue(context.getLoginPage().getIframe().isDisplayed());
    }
    @And("кнопка Frame Button должна отображаться")
    public void asserFrameButtonIsDisplayed(){
        context.getWebDriver().switchTo().frame(context.getLoginPage().getIframe());
        Assert.assertTrue(context.getLoginPage().getIframeButton().isDisplayed());
    }
    @When("пользователь возвращается на основное окно")
    public void assertOriginalWidow(){
        context.getWebDriver().switchTo().defaultContent();
        assertHeaderElementsIsDisplayed();
    }
    @Then("в левом меню должно отображаться 5 элементов")
    public void assertLeftItemsIsDisplayed(){
        for(WebElement we:context.getLoginPage().getLeftItems()){
            we.isDisplayed();
        }
    }
    @And("левое меню должно содержать корректные тексты")
    public void assertLeftItemsCorrect(){
        for (int i=0;i<context.getLoginPage().getLeftItems().size();i++){
            Assert.assertEquals(context.getLoginPage().getLeftItems().get(i).getText(), TestData.ITEMLEFTS.get(i));
        }
    }
//    @And("браузер закрыт")
//    public void close(){
//        context.getWebDriver().close();
//    }
}

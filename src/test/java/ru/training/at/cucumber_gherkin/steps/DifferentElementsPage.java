package ru.training.at.cucumber_gherkin.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import ru.training.at.cucumber_gherkin.context.TestContext;
import ru.training.at.cucumber_gherkin.data.TestData;

public class DifferentElementsPage {

    private TestContext context;

    public DifferentElementsPage(TestContext context) {
        this.context = context;
    }

    @Then("страница различных элементов открыта")
    public void assertDifferentElementsPage(){
        context.getDifferentElementsPage().getServiceButton().click();
        context.getDifferentElementsPage().getDifferentElementsPage().click();
        Assert.assertEquals(context.getWebDriver().getCurrentUrl(), TestData.DIFFURL);
    }
    @And("чек-бокс \"Water\" активен")
    public void assertWater(){
        context.getDifferentElementsPage().getWater().click();
        Assert.assertTrue(context.getDifferentElementsPage().getWater().isSelected());
    }
    @And("чек-бокс \"Wind\" активен")
    public void assertWind(){
        context.getDifferentElementsPage().getWind().click();
        Assert.assertTrue(context.getDifferentElementsPage().getWind().isSelected());
    }
    @And("радио-кнопка \"Selen\" активна")
    public void asserRadio(){
        context.getDifferentElementsPage().getRadio().click();
        Assert.assertTrue(context.getDifferentElementsPage().getRadio().isSelected());
    }
    @And("значение \"Yellow\" выпадающего списка выбрано")
    public void assertDropList(){
        context.getDifferentElementsPage().getDropYellow().click();
        Assert.assertEquals(context.getDifferentElementsPage().getDropYellow().getText(), TestData.DROP);
    }
    @And("значение логов отображается")
    public void assertLogIsDisplayed(){
        context.getDifferentElementsPage().getLogItems();
        for (int i = 0; i < context.getDifferentElementsPage().getLogItems().size(); i++){
            Assert.assertTrue(context.getDifferentElementsPage().getLogItems().get(i).isDisplayed());
        }
    }
    @And("значение логов корректно")
    public void assertLogListCorrect(){
        for (int i = 0; i < context.getDifferentElementsPage().getLogItems().size(); i++) {
            Assert.assertEquals(context.getDifferentElementsPage()
                    .getLogItems()
                    .get(i)
                    .getText()
                    .substring(context.getDifferentElementsPage().getLogItems().get(i).getText().lastIndexOf(':'))
                    .replaceAll("[^a-zA-Z ]", "").trim(), TestData.LOGITEMS.get(i));
        }
    }
    @And("браузер закрыт")
    public void close(){
        context.getWebDriver().close();
    }
}

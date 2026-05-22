package ru.training.at.cucumber_gherkin.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import ru.training.at.cucumber_gherkin.context.TestContext;

public class Hooks {

    private final TestContext testContext;

    public Hooks(TestContext testContext) {
        this.testContext = testContext;
    }
    @Before
    public void setUp(){
        testContext.init();
    }
    @After
    public void tearDown(){
       if(testContext.getWebDriver()!=null){
           testContext.getWebDriver().quit();
       }
    }
}

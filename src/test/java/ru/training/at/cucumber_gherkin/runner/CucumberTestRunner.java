package ru.training.at.cucumber_gherkin.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features =
        "C:\\Users\\Zhdanova_Juliya\\Desktop\\back2\\Homework\\src\\test\\java\\ru\\training\\at\\cucumber_gherkin\\resources\\feature",
        glue = {
        "ru.training.at.cucumber_gherkin.steps",
        "ru.training.at.cucumber_gherkin.hooks"},
        plugin = {
        "pretty",
        "html:target/cucumber-report.html"})
public  class CucumberTestRunner extends AbstractTestNGCucumberTests {

}

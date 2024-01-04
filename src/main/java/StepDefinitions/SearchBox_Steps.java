package StepDefinitions;

import Pages.Locators;
import Utilities.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchBox_Steps {

    private BaseDriver baseDriver;
    Locators locators = new Locators();

    @Given("the user is on the Amazon homepage")
    public void givenTheUserIsOnTheAmazonHomepage() {
        baseDriver = new BaseDriver();
        baseDriver.getDriver().get("https://www.amazon.com.tr");
    }

    @When("the user searches for {string}")
    public void whenTheUserSearchesFor(String keyword) {
        locators.clickMethod(locators.getWebElement("searchBox"));
        locators.getWebElement("searchBox").sendKeys(keyword);
        locators.getWebElement("searchBoxButton").click();


    }

    @Then("the search results page is displayed")
    public void thenTheSearchResultsPageIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(baseDriver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[3]")));

        locators.verifyElementDisplayed(locators.getWebElement("verifyText"));

    }

    @Then("the no results message is displayed")
    public void thenTheNoResultsMessageIsDisplayed() {

        WebDriverWait wait = new WebDriverWait(baseDriver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/div/div/span[2]")));

        locators.verifyElementDisplayed(locators.getWebElement("NoResultText"));

        baseDriver.quitDriver();
    }



}

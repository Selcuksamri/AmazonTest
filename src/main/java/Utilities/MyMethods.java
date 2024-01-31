package Utilities;

import Pages.Locators;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyMethods {

    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(60));


    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }


    public void clickMethod(WebElement element) {
        waitUntilClickable(element);
        element.click();

    }


    public void verifyElementDisplayed(WebElement element) {
        if (element != null) {
            Assert.assertTrue(element.isDisplayed());
        } else {
            System.out.println("Element is null. Cannot perform the action.");
        }
    }

    public void sendKeysMethod(WebElement element, String text) {
        waitUntilVisible(element);
        element.sendKeys(text);
    }


    public void HoverOver(WebElement element) {
        waitUntilVisible(element);
        Actions actions = new Actions(BaseDriver.getDriver());
        Action action = actions.moveToElement(element).build();
        action.perform();

    }

    public void scrollDown(int pixels) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) BaseDriver.getDriver();
        jsExecutor.executeScript("window.scrollBy(0, " + pixels + ");");
    }

    public void clearTextInElement(String locatorKey) {
        Locators locators = new Locators();
        WebElement element = locators.getWebElement(locatorKey);
        element.clear();
    }

    public void refreshPage() {
        BaseDriver.getDriver().navigate().refresh();
    }

    public void clickMethodWithRetry(WebElement element, int maxRetry) {
        for (int i = 0; i < maxRetry; i++) {
            try {
                waitUntilClickable(element);
                element.click();
                break;
            } catch (Exception e) {
                System.out.println("Element not found. Retrying...");
            }
        }
    }



}

package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyMethods {

    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(60));


    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void clickMethod(WebElement element) {
        waitUntilClickable(element);
        element.click();

    }



    public void verifyElementDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }

}

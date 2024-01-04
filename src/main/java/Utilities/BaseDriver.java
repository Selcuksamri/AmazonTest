package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver==null){ System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver-win64\\chromedriver.exegig");
        driver = new ChromeDriver();
    }

        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }

    }
}

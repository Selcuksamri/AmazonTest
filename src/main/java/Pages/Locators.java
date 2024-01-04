package Pages;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends MyMethods {


    public Locators(){

        PageFactory.initElements(BaseDriver.getDriver(),this);

    }

    @FindBy(css = "input#twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(css = "input#nav-search-submit-button")
    private WebElement searchBoxButton;

    @FindBy(xpath = "//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[3]")
    private WebElement verifyText;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/div/div/span[2]")
    private WebElement noResultText;




public WebElement getWebElement(String elementName){

    if ("searchBox".equals(elementName)){
        return this.searchBox;
    } else if ("searchBoxButton".equals(elementName)) {
        return this.searchBoxButton;
    } else if ("verifyText".equals(elementName)) {
        return this.verifyText;

    }else if("noResultText".equals(elementName)){
        return this.noResultText;
    }

    return null;



}

}



















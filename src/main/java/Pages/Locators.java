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

    @FindBy (xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
    private WebElement loginButton;

    @FindBy(css = "span#nav-link-accountList-nav-line-1")
    private WebElement accountButton;

    @FindBy(css = "input#ap_email")
    private WebElement emailButton;

    @FindBy(css = "input#ap_password")
    private WebElement passwordButton;
    @FindBy(css = "input#continue")
    private WebElement continueButton;
    @FindBy(css = "input#signInSubmit")
    private WebElement signInButton;
    @FindBy(css = "div#auth-error-message-box h4")
    private WebElement invalidMail;
    @FindBy(css = "a#nav-item-signout > span")
    private WebElement signOut;

    @FindBy(xpath = "//*[@id=\"auth-error-message-box\"]/div/h4")
    private WebElement errorMessage;








public WebElement getWebElement(String elementName){

    if ("searchBox".equals(elementName)){
        return this.searchBox;
    } else if ("searchBoxButton".equals(elementName)) {
        return this.searchBoxButton;
    } else if ("verifyText".equals(elementName)) {
        return this.verifyText;
    }else if("noResultText".equals(elementName)){
        return this.noResultText;
    } else if ("loginButton".equals(elementName)) {
        return this.loginButton;
    } else if ("accountButton".equals(elementName)) {
        return this.accountButton;
    } else if ("continueButton".equals(elementName)) {
        return this.continueButton;
    } else if ("emailButton".equals(elementName)) {
        return this.emailButton;
    } else if ("passwordButton".equals(elementName)) {
        return this.passwordButton;
    } else if ("signInButton".equals(elementName)) {
        return this.signInButton;
    } else if ("invalidMail".equals(elementName)) {
        return this.invalidMail;
    } else if ("signOut".equals(elementName)) {
        return this.signOut;
    } else if ("errorMessage".equals(elementName)) {
        return this.errorMessage;
    }

    return null;



 }

}



















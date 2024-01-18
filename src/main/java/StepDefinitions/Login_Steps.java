package StepDefinitions;

import Pages.Locators;
import Utilities.BaseDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {

    private BaseDriver baseDriver;
    Locators locators = new Locators();


    @When("User logs in with {string} and {string}")
    public void user_logs_in_with_and(String email, String password) {
        locators.HoverOver(locators.getWebElement("accountButton"));
        locators.clickMethod(locators.getWebElement("loginButton"));
        locators.sendKeysMethod(locators.getWebElement("emailButton"),email);
        locators.clickMethod(locators.getWebElement("continueButton"));
        locators.sendKeysMethod(locators.getWebElement("passwordButton"),password);
        locators.clickMethod(locators.getWebElement("signInButton"));
        locators.HoverOver(locators.getWebElement("accountButton"));
        locators.clickMethod(locators.getWebElement("signOut"));


    }
    @When("User logs in with {string}")
    public void user_logs_in_with(String email) {
        locators.HoverOver(locators.getWebElement("accountButton"));
        locators.clickMethod(locators.getWebElement("loginButton"));
        locators.sendKeysMethod(locators.getWebElement("emailButton"),email);
        locators.clickMethod(locators.getWebElement("continueButton"));
        locators.verifyElementDisplayed(locators.getWebElement("errorMessage"));

    }

    @Then("User is redirected to the account home page")
    public void user_is_redirected_to_the_account_home_page() {
        locators.verifyElementDisplayed(locators.getWebElement("homeLogo"));
    }


    @Then("User see invalid email message on screen")
    public void user_see_invalid_email_message_on_screen() {
        locators.verifyElementDisplayed(locators.getWebElement("invalidMail"));
    }

}

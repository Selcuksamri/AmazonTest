package StepDefinitions;

import Pages.Locators;
import Utilities.BaseDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FavoritesList_Steps {

    private BaseDriver Basedriver;
    Locators locators = new Locators();
    MyMethods myMethods = new MyMethods();

    @And("User selects a computer item")
    public void user_selects_a_computer_item() {
        locators.HoverOver(locators.getWebElement("selectLaptopButton"));
        locators.clickMethodWithRetry(locators.getWebElement("selectLaptopButton"),3);
        myMethods.scrollDown(500);
        locators.clickMethod(locators.getWebElement("seeDetailsAcerLaptop1"));


    }

    @And("User adds the item to the favorites list")
    public void user_adds_the_item_to_the_favorites_list() {
        myMethods.scrollDown(550);
        locators.clickMethod(locators.getWebElement("addToWishlist"));
        locators.clickMethod(locators.getWebElement("listName"));
        locators.clearTextInElement("listName");
        locators.sendKeysMethod(locators.getWebElement("listName"),"Favorites List" );
        locators.clickMethod(locators.getWebElement("createList2"));
        locators.clickMethod(locators.getWebElement("seeCreatedList"));

    }

    @Then("User checks the favorites list")
    public void user_checks_the_favorites_list() {

        locators.verifyElementDisplayed(locators.getWebElement("haveAList"));

    }

    @When("User removes the favorite item")
    public void user_removes_the_favorite_item() {
        locators.clickMethod(locators.getWebElement("removeFromList"));
        myMethods.refreshPage();
        locators.verifyElementDisplayed(locators.getWebElement("emptyListMessage"));

    }


}

package StepDefinitions;

import Pages.Locators;
import Utilities.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartOP_Steps {

    private BaseDriver baseDriver;
    Locators locators = new Locators();

    @Given("the user is on a product page")
    public void the_user_is_on_a_product_page() {
        locators.clickMethod(locators.getWebElement("selectBook1"));

    }

    @When("the user clicks the Add to Cart button")
    public void the_user_clicks_the_button() {
        locators.clickMethod(locators.getWebElement("addToCartButton"));

    }

    @Then("the number of items in the cart should increase by one")
    public void the_number_of_items_in_the_cart_should_increase_by_one() {
        locators.waitUntilVisible(locators.getWebElement("add1"));
    }

    @Given("the user is on the cart page")
    public void the_user_is_on_the_cart_page() {
        locators.clickMethod(locators.getWebElement("goToCard"));
    }

    @When("the user removes a product from the cart")
    public void the_user_removes_a_product_from_the_cart() {
        locators.clickMethod(locators.getWebElement("removeProduct"));
    }

    @Then("the number of items in the cart should decrease by one")
    public void the_number_of_items_in_the_cart_should_decrease_by_one() {
        locators.waitUntilVisible(locators.getWebElement("decreaseTo0"));
    }




}

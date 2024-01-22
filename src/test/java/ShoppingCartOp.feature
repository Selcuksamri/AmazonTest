Feature: Shopping Cart Operations

  Background: the user is on the Amazon homepage
    Given the user is on the Amazon homepage

  Scenario: User should be able to add a product to the cart
    When the user searches for "bir kuzey macerası - jack london"
    Given the user is on a product page
    When the user clicks the Add to Cart button
    Then the number of items in the cart should increase by one

  Scenario: User should be able to remove a product from the cart
    Given the user is on the cart page
    When the user removes a product from the cart
    Then the number of items in the cart should decrease by one

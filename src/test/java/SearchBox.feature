Feature: Amazon Search Functionality

  Scenario: Positive Search on Amazon
    Given the user is on the Amazon homepage
    When the user searches for "laptop"
    Then the search results page is displayed

  Scenario: Negative Search on Amazon
    Given the user is on the Amazon homepage
    When the user searches for "invaliditem123"
    Then the no results message is displayed

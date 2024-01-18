Feature: Login Feature

  Background:
    Given the user is on the Amazon homepage

  Scenario: Log in with valid user credentials
    When User logs in with "oguacoboq@email1.io" and "123456789q"
    Then User is redirected to the account home page

  Scenario: Log in with invalid user credentials
    When User logs in with "abcxdt@gmail.com"
    Then User see invalid email message on screen

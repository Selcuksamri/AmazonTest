Feature: Manage Favorites List


Background: the user is on the Amazon homepage
  Given the user is on the Amazon homepage
  When User logs in with "oguacoboq@email1.io" and "123456789q"
  When the user searches for "bilgisayar"

Scenario: User should be able to add and remove favorite items
  And User selects a computer item
  And User adds the item to the favorites list
  Then User checks the favorites list
  When User removes the favorite item
  Then User checks the favorites list
@Wishlist
Feature: Add jewelry to the Wishlist

  Scenario Outline: Login with valid credentials and add jewelry to wishlist
    Given user is in the Demo Web Shop application
    When user logs in with "<email>" and "<password>"
    Then the user should see the "<LoginStatus>"
    
    And user navigates to the Jewelry section
    When user clicks a jewelry 
    And enter the length of the jewel and adds it to the wishlist
    Then the selected item should appear in the wishlist

    Examples:
      | email                | password | LoginStatus  |
      | lakssakthi@gmail.com | 123456   | Login passed |
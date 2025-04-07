@JweleryWishList
Feature: Add jewelry to the Wishlist
  I want to login to the application, select a jewelry item, and add it to my wishlist

  @Login
  Scenario Outline: Login with valid and invalid credentials
    Given user is in the Demo Web Shop application
    When user logs in with "<email>" and "<password>"
    Then the user should see the "<LoginStatus>"

    Examples:
      | email                     | password  | LoginStatus     |
      | lakssakthi@gmail.com      | 123456    | Login passed    |
      | demo@example.com          | demo@123  | Login failed    |


@SendEmail
Feature: Send email to a friend using data from Excel

  Scenario Outline: Login with valid credentials and add jewelry to wishlist
    Given user is in the Demo Web Shop application
    When user logs in with "<email>" and "<password>"
  
    
    And user navigates to the WishList section
    And user clicks Email a friend button
    Then user fills email details from Excel
    And user clicks the Send Email button
    Then a confirmation message should be displayed

    Examples:
      | email                | password | 
      | lakssakthi@gmail.com | 123456   | 
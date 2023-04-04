Feature: Foreign Currency Functionality


  Scenario:
    Given Navigate to website
    And Enter username as "username" and password as "password"
    When click login button
    Then Verify that you are logged in.
    Given Click to online pay bills
    When Click to Pay Bills button

  @RegressionTest
  Scenario Outline:Convert amount to dollars
    Then Click to Purchase Foreign Currency button
    And select currency as "<value>"
    And Enter to Amount as "<amount>"
    And Click to Dollar checkbox
    And Click to calculate
    And Click to purchase
    Then successfully message should be displayed

    Examples:
      | amount | value |
      | 75     | EUR   |
      | 100    | GBP   |
      | 200    | NOK   |



Feature: New Payee Functionality

  Background:
    Given Navigate to website
    And Enter username as "username" and password as "password"
    When click login button
    Then Verify that you are logged in.

  @RegressionTest
  Scenario Outline: Fill in the required information completely
    When Click to Online Banking
    And Click to Pay Bills button
    And Click to Add New Payee button
    And Enter name,address,account and details

      | payeeName    | <name>    |
      | payeeAddress | <address> |
      | account      | <account> |
      | payeeDetails | <details> |

    When Click to add button
    Then successfully message should be displayed
    Examples:
      | name   | address | account | details          |
      | Jess   | NewYork | 254896  | rent payment     |
      | Victor | Toronto | 785961  | amazon payment   |
      | Alex   | Moscow  | 963485  | electricity bill |




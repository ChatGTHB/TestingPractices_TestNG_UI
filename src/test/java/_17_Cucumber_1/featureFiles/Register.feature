Feature:Register Functionality

  Scenario: Account Create
    Given Navigate to Shop Demoqa
    When Click to My Account button
    And Fill in the username input as "technostudy"
    And Fill in the email input as "techno@study.com"
    And Fill in the password input as "Techno.14%04"
    And Click to Register button
    Then Click to logout button
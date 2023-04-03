
Feature:Login Functionality

  Background:
    Given Navigate to Shop Demoqa
    When Click to My Account button

  Scenario:Login process with valid information
    When Fill in the login username input as "technostudy"
    When Fill in the login password input as "Techno.14%04"
    When Click to Login button
    Then Success message should be displayed
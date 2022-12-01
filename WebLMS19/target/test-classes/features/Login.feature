Feature: Login
  As a user
  I want to login instructor
  So I can manage my dashboard instructor

  Scenario: Login with email and password
    Given I am on the landing page
    And I click profile button right
    And I click dropdown button login
    When I input email
    And I input password
    And I click button login
    Then I will go to dashboard
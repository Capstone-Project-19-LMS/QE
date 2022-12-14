@enroll
Feature: Manage Costumer who enrolled in the course
  As a user
  I want to see enroll
  So I can manage costumer enroll

  Scenario: GET - Enroll costumer
    Given I set POST api endpoints for enroll
    When I send POST HTTP request for enroll
    Then I receive valid HTTP respone enroll code
    And I receive valid data for enroll

  @upen
  Scenario: PUT - Update enroll
    Given I set PUT api endpoint for update enroll
    When I send PUT HTTP request for update enroll
    Then I receive valid HTTP respone update code
    And I receive valid data for update
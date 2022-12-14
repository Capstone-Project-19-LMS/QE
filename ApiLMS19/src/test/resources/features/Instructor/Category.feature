Feature: Category
  As a user
  I want to category
  So I can manage category

  @cc
  Scenario: POST - Create Category
    Given I set POST api endpoints for create
    When I send POST HTTP request for create
    Then I receive valid HTTP respone create code
    And I receive valid data for create

  @dc
  Scenario: DEL - Delete Category
    Given I set DEL api endpoint for delete category
    When I send DEL HTTP request for delete category
    Then I receive valid HTTP respone delete category
    And I receive valid data for delete category

  @gac
  Scenario: GET - Get all Category
    Given I set GET api endpoint for get all category
    When I send GET HTTP request for get all category
    Then I receive valid HTTP respone get all category
    And I receive valid data for get all category

  @gci
  Scenario: GET - Get Category Id
    Given I set GET api endpoint for get category id
    When I send GET HTTP request for get category id
    Then I receive valid HTTP respone get category id
    And I receive valid data for get category id

  @uc
  Scenario: PUT - Update Category
    Given I set PUT api endpoint for update category
    When I send PUT HTTP request for update category
    Then I receive valid HTTP respone update category
    And I receive valid data for update category

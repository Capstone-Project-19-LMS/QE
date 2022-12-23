#Feature: Customer Auth
#  As an customer
#  I want to authenticate
#  So that I can use another feature


#  Scenario Outline: POST - As customer I have be able to create new account
#    Given I set POST api endpoints for register with "<name>", "<email>" and "<password>"
#    When I send POST HTTP request
#    Then I receive valid HTTP response code 200
#    And I receive valid data for new account
#
#  Examples:
#  | name        | email         | password |
#  | qecustomer1 | qe1@qmail.com | password |


#  Scenario: PUT - As admin i have be able to update existing user
#    Given I set PUT api endpoints
#    When I send PUT HTTP request
#    Then I receive valid HTTP response code 200
#    And I receive valid data for updated user
#

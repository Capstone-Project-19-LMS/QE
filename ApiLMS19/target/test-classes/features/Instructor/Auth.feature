#Feature: Authorized instructor
#  As a user
#  I want to auth for instructor
#  So I can manage my account
#
#  @register
#  Scenario Outline: POST - As instructor Register
#    Given I set POST api endpoints for register
#    When I send request for register "<name>" "<email>" "<password>"
#    Then I receive valid HTTP response code register "<code>"
#    And I receive valid data for register "<status>"
#    Examples:
#    | name   | email            | password | code | status |
#    | alwi1  | valid            | nainai   | 200  | ok     |
#    | alwi99 | duplicate        | nainai 1  | 500  | dup     |
#    |        | valid            | nainai 1  | 400  | fail     |
#    | testing1 | null            | nainai 1  | 400  | fail     |
#    | testing1 | valid           |         | 400  | fail     |
#
#
#  @login
#  Scenario Outline: POST - As instructor Login
#    Given I set POST api endpoints for login
#    When I send request for login "<email>" "<password>"
#    Then I receive valid HTTP response code login "<code>"
#    And I receive valid data for login "<status>"
#    Examples:
#    | email                | password | code | status |
#    | valid                | nainai   | 200  | ok     |
#    | null                 | nainai   | 500  | fail   |
#    | valid                | null     | 500  | fail   |
#
#  @logout
#  Scenario: POST - As instructor Logout
#    Given I set POST api endpoints for logout
#    When I send request for logout
#    Then I receive valid HTTP response code logout
#    And I receive valid data for logout
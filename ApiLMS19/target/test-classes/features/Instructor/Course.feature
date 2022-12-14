@course
Feature: Course
  As a user
  I want to course instructor
  So I can manage my course instructor

  @create
  Scenario Outline: POST - As instructor Create new Course
    Given I set POST api endpoints for new course
    When I send POST HTTP request for new course "<name>" "<desc>" "<objective>" "<catId>" "<status>"
    Then I receive valid HTTP respone code "<code>"
    And I receive valid data for new course "<status>"

    Examples:
    | name      | desc                       | objective              | catId                            | code | status |
    | valid     | pembelajaran bahasa java 1 | materi java 1          | 188da0ffa87c4f5084f267d54937e43b | 200  | ok |
    | valid     | pembelajaran bahasa java 1 | materi java 1          | 188da0ffa87c4f5084f267d54937e43b | 400  | without |
    | valid     | pembelajaran bahasa java 1 | materi java 1          | 188da0ffa87c4f5084f267d54937e43b | 401  | inv |
    | duplicate | pembelajaran bahasa java 1 | materi java 1          | 188da0ffa87c4f5084f267d54937e43b | 500  | err |
    | valid     |                            | materi java 1          | 188da0ffa87c4f5084f267d54937e43b | 400  | ok |
    | valid     | pembelajaran bahasa java 1 |                        | 188da0ffa87c4f5084f267d54937e43b | 200  | ok |
    | valid     | pembelajaran bahasa java 1 | materi java 1          |                                  | 400  | err |
    |           |                            |                        |                                  | 400  | err |

  @delete
  Scenario: DEL - As instructor Delete Course
    Given I set DELETE api endpoint for delete course
    When I send DELETE HTTP request for delete course
    Then I receive valid HTTP respone code delete course
    And I receive valid data for delete course

  @getall
  Scenario: GET - As instructor get all course
    Given I set GET all api endpoint for get all course
    When I send GET HTTP request for get all course
    Then I receive valid HTTP respone code get all course
    And I receive valid data for get all course

  @getid
  Scenario: GET - As instructor get course ID
    Given I set GET id api endpoint for get course id
    When I send GET HTTP request for get course id
    Then I receive valid HTTP respone code get course id
    And I receive valid data for get course id

  @update
  Scenario Outline: PUT - As instructor update course
    Given I set PUT api endpoint for update course
    When I send PUT HTTP request for update course "<name>" "<desc>" "<objective>" "<catId>" "<status>"
    Then I receive valid HTTP respone code update course "<code>"
    And I receive valid data for update course "<status>"
    Examples:
    | name      | desc                              | objective             | catId                            | code | status |
    | valid     | Pembelajaran mencari cinta sejati | materi bucin          | 188da0ffa87c4f5084f267d54937e43b | 200  | ok |


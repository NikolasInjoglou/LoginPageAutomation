Feature: Test Login screen

  Scenario Outline: Test a successful login
    Given I navigate to the login page
    When I enter "<username>" and "<password>"
    And I press the submit button
    Then I validate that the login was successful

    Examples:
      | username | password    |
      | student  | Password123 |
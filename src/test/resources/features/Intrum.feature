Feature: Functionality to verify:
  Scenario Outline: Verify that validation are not displayed
    When I am on the form page
    And I type data from csv file line <number>
    And I click Submit button
    Then I don't see the validation messages
  Examples:
      | number |
      | 1      |
      | 2      |

  Scenario: Verify that validations are displayed
    When I am on the form page
    And I click Submit button
    Then I see the validation messages
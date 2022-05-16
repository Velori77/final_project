Feature: Registration

  Background:
    Given Go to the the main page

  Scenario: Test case #3 (Registration with valid data)
    When I click on 'Sign in' button
    And I click on 'No account? Create one here' link
    And I fill the form with 'valid' data
    And I click on 'Save' button
    Then I check my name appear near cart button

  Scenario: Test case #4 (Registration with invalid data) - [Negative path]
    When I click on 'Sign in' button
    And I click on 'No account? Create one here' link
    And I fill the form with 'invalid' data
    Then I check that First name highlighted in red
    And I check that pop-up with text 'Invalid name' appear under field
Feature: Check properties

  Background:
    Given Go to the the main page

  Scenario: Test case #1 (Subscribe with invalid email)
    Then On the button of the page check that text near the email field equals 'Get our latest news and special sales'
    And On the button of the page check that text under email field contains 'You may unsubscribe at any moment. For that purpose, please find my contact info in the legal notice.'
    And Check that all characters on SUBSCRIBE button in upper case

  Scenario: Test case #2 (Check languages)
    When I go to the Language bar
    Then I am checking 44 languages exists in the dropdown menu
    And Also I am checking 'Українська' exist in dropdown

  Scenario: Test case #5 (Check categories)
    When Hover mouse over 'CLOTHES' I check that 'MEN' and 'WOMEN' sub menu items appears
    And Hover mouse over 'ACCESSORIES' I check that 'STATIONERY' and 'HOME ACCESSORIES' sub menu items appears
    Then Hover mouse over ART I check that no any sub category appears
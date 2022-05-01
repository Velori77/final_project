Feature: Final Task

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

    #Test case #2 (Check languages)**

    #1. Go to the https://demo.prestashop.com/
    #2. Check that 44 langueges exists in 'Language' dropdown in the top menu
    #3. Check that 'Українська' language exist in dropdown

  Scenario: Test case #3 (Registration with valid data)
    When I click on  'Sign in' button
    And I click on 'No account? Create one here' link
    And I fill the form with valid data
    And I Click on 'Save' button
    Then I check my name appear near cart button

  # Test case #3 (Registration with valid data)

  #1. Go to the https://demo.prestashop.com/
  #2. Click on 'Sign in' button at the right corner of the page
  #3. Click on 'No account? Create one here' link
  #4. Fill the form with valid data
  #5. Click on 'Save' button
  #6. Check your name appear near cart button

  Scenario: Test case #4 (Registration with invalid data)
    When I click on  'Sign in' button
    And I click on 'No account? Create one here' link
    And I fill 'First name' field with 'James8'
    And I fill the rest fields valid data
    Then I check that 'First name' highlighted in red
    And I check that pop-up with text 'Invalid name' appear under field

  #Test case #4 (Registration with invalid data)**

  #1. Go to the https://demo.prestashop.com/
  #2. Click on 'Sign in' button at the right corner of the page
  #3. Click on 'No account? Create one here' link
  #4. Fill 'First name' field with 'James8'
  #5. Fill the rest fields valid data
  #6. Check that 'First name' highlighted in red
  #7. Check that pop-up with text 'Invalid name' appear under field

  Scenario: Test case #5 (Check categories)
    When I hover mouse over 'CLOTHES'
    Then I check that 'MEN' and 'WOMEN' sub menu items appears
    When I hover mouse over 'ACCESSORIES'
    Then I check that 'STATIONERY' and 'HOME ACCESSORIES' sub menu items appears
    When I hover mouse over 'ART'
    Then I check that no any sub category appears

  #Test case #5 (Check categories)**

  #1. Go to the https://demo.prestashop.com/
  #2. Hover mouse over 'CLOTHES'
  #3. Check that 'MEN' and 'WOMEN' sub menu items appears
  #4. Hover mouse over 'ACCESSORIES'
  #5. Check that 'STATIONERY' and 'HOME ACCESSORIES' sub menu items appears
  #6. Hover mouse over 'ART'
  #7. Check that no any sub category appears

  Scenario: Test case #6 (Check popular products)
    Then I check that 8 products exist in 'POPULAR PRODUCTS' section
    And  Check that every product has name
    And Check that every product has price
    And Check that all prices bigger than 0.00

  #Test case #6 (Check popular products)**

  #1. Go to the https://demo.prestashop.com/
  #2. Check that 8 products exist in 'POPULAR PRODUCTS' section
  #3. Check that every product has name
  #4. Check that every product has price
  #5. Check that all prices bigger than 0.00






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

  Scenario: Test case #5 (Check categories)
    When I hover mouse over 'CLOTHES'
    Then I check that 'MEN' and 'WOMEN' sub menu items appears
    When I hover mouse over 'ACCESSORIES'
    Then I check that 'STATIONERY' and 'HOME ACCESSORIES' sub menu items appears
    When I hover mouse over 'ART'
    Then I check that no any sub category appears

  Scenario: Test case #6 (Check popular products)
    Then I check that 8 products exist in 'POPULAR PRODUCTS' section
    And  Check that every product has name
    And Check that every product has price
    And Check that all prices bigger than 0.00

  Scenario: Test case #7 (Price drop check)
    When At the bottom of the page click on 'Prices drop' link
    Then heck that every product has old and new price
    And Check that promo price for every product calculates correct

  Scenario: Test case #8 (Sorting check)
    When Click on the 'All products >' under the 'POPULAR PRODUCTS' section
    And Sort products as 'Name, A to Z'
    Then Check that sorting is correct
    When Sort products as 'Name, Z to A'
    Then Check that sorting is correct
    When Sort products as 'Price, low to high'
    Then Check that sorting is correct
    When Sort products as 'Price, high to low'
    Then Check that sorting is correct

  Scenario: Test case #9 (Adding to cart)
    When In the search field enter 'Bear' and press 'Enter'
    And On the 'SEARCH RESULTS' page click on 'Brown Bear Notebook'
    And Change 'Paper type' to 'Doted'
    And Change 'Quantity' to '5'
    And Click 'ADD TO CART' button
    Then Check that new window with title 'Product successfully added to your shopping cart' appears
    And Check that correct 'Paper Type' and 'Quantity' is shown on the left side of the window
    And Check that 'Total' calculated correct

  Scenario: Test case #10 (Checkout end-to-end)
    When In the search field enter 'Mug' and press 'Enter'
    And On the 'SEARCH RESULTS' page click on 'Customizable Mug'
    Then Enter 'Best mug ever' in 'Product customization' field
    And Click 'SAVE CUSTOMIZATION'
    When Change 'Quantity' to '1' if not '1' already
    And Click 'ADD TO CART' button
    And On the next window click 'CONTINUE SHOPPING'
    Then In the search field enter 'T-Shirt' and press 'Enter'
    When On the 'SEARCH RESULTS' page click on 'Hummingbird Printed T-Shirt'
    And Select 'Black' color
    And Click 'ADD TO CART' button
    Then On the next window click 'PROCEED TO CHECKOUT'
    And On the 'SHOPPING CART' page check that 'Total' calculated correct
    When Click 'PROCEED TO CHECKOUT'
    And Fill 'PERSONAL INFORMATION' form with valid data (without password)
    Then Click 'CONTINUE'
    When Fill the 'ADDRESSES' form with valid data
    Then Click 'CONTINUE'
    When On the 'SHIPPING METHOD' section select 'My carrier'
    Then Click 'CONTINUE'
    When On the 'PAYMENT' section select 'Pay by Check'
    Then Check that Amount equal Subtotal+Shipping
    When Click on 'I agree..' checkbox
    And Click on 'Order with an obligation to pay'
    Then Check that 'YOUR ORDER IS CONFIRMED' appered on the next page
    And Check that 'TOTAL' calculated correct
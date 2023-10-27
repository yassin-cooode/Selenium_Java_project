Feature: Shopping for men products

  Scenario: Shopping for men products
    Given Men category in the home page
    When User hovers above men dropdown, selects tops and selects jackets
    And Chooses one of results
    And Chooses the size, color and quantity
    And Click add to cart button
    Then See a message indicating that the product is added
    And User hovers above men dropdown, selects tops and selects Hoodies and Sweatshirts
    And Chooses one of results
    And Chooses the size, color and quantity
    And Click add to cart button
    Then See a message indicating that the product is added
    And Go to the cart and click proceed to Checkout
    Then Will see the selected products in order summary section
    And Fill the required information about the shipping
    And Selects the shipping method
    And Click on Next button
    Then Will see the selected products in order summary section
    And Click on place order button to finish the process
    Then Will Thank you for your purchase! message
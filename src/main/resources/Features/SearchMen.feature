@tag
Feature: Searching for men products
  Scenario: Searching for men pants and successfully add product
    Given Home page search bar
    When User type men pants and search
    And Choose any product from search results
    And Choose the size of the product
    And Choose the color of the product
    And Choose the quantity
    And Click add to cart button
    Then A message will appear indicating that the product is added

  Scenario: Searching for men pants and add  not available product
    Given Home page search bar
    When User type men pants and search
    And Choose any product from search results
    And Choose the size of the product that is not available
    And Choose the color of the product that is not available
    And Choose the quantity
    And Click add to cart button
    Then A message will appear indicating that the product is not available


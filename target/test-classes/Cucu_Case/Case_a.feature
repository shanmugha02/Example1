
Feature:Add_to_cart
  @tag1
  Scenario: Add to cart without login
    Given User open the web application
    And User search for the product
    And User clicks add to cart button
   	Then page redirects to login page


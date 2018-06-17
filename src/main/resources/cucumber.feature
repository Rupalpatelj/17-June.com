Feature: clearance
  As a user
  I want to select clearance product
  So I can view all clearance product with different categories

  Scenario: Select product from clearance
    Given I am on Homepage
    When I click on CLEARANCE
    And I click on "Technology"
    And I navigate on "Mobile phones and accessories (300)"
    And I select a product "By Price"
    And I select minimumprice "£30"
    And I select maximumprice "£50"
    Then I can view selected clearance product


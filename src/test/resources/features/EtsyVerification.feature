Feature: Etsy Verification


  @etsyWip
  Scenario: Etsy Title Verification
    When user is on etsy homepage
    Then User sees title "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone" is as expected.

  Scenario:Etsy Search Functionality Title Verification (without parameterization)
    When user is on etsy homepage
    And User types Wooden Spoon in the search box
    Then User clicks search button
    Then User sees Wooden Spoon is in the title

  Scenario:  Etsy Search Functionality Title Verification (with parameterization)
    When user is on etsy homepage
    And User types "Wooden Spoon" in the search box
    Then User clicks search button
    Then User sees "Wooden Spoon" is in the title

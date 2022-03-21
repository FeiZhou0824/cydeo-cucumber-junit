Feature: SmartBear order functionality

  @smartBearWIP
  Scenario: SmartBear order process
    When user on smartBear homepage
    And Enter Tester as username
    And Enter test as password
    And click login;
    And user go to Order Page
    And User selects "FamilyAlbum" from product dropdown
    Then User enters "4" to quantity
    Then User enters "John Wick" to costumer name
    Then User enters "Kinzie Ave" to street
    Then User enters "Chicago" to city
    Then User enters "IL" to state
    Then User enters "60056"
    Then User selects "Visa" as card type
    Then User enters "1111222233334444" to card number
    Then User enters "12/22" to expiration date
    Then User clicks process button
    Then go back to view all orders page
    Then User verifies "John Wick" is in the list


  @scenarioOutline
  Scenario Outline: SmartBear order process
    When user on smartBear homepage
    And Enter Tester as username
    And Enter test as password
    And click login;
    And user go to Order Page
    And User selects "<product>" from product dropdown
    Then User enters "<quantity>" to quantity
    Then User enters "<customerName>" to costumer name
    Then User enters "<street>" to street
    Then User enters "<city>" to city
    Then User enters "<state>" to state
    Then User enters "<zip>"
    Then User selects "<cardType>" as card type
    Then User enters "<cardNumber>" to card number
    Then User enters "<expirationDate>" to expiration date
    Then User clicks process button
    Then go back to view all orders page
    Then User verifies "<customerName>" is in the list
    Examples: search values we are going to be using in this scenario is as below
      | product     | quantity | customerName    | street      | city        | state | zip   | cardType | cardNumber     | expirationDate | customerName    |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | IL    | 60004 | Visa     | 3133313133315  | 12/22          | Ken Adams       |
      | FamilyAlbum | 4        | Joey Tribbiani  | State st    | Chicago     | IL    | 60656 | Visa     | 1234335333336  | 11/22          | Joey Tribbiani  |
      | ScreenSaver | 5        | Rachel Green    | Michigan st | Chicago     | IL    | 60056 | Visa     | 3353333333337  | 10/22          | Rachel Green    |
      | MyMoney     | 5        | Chandler Bing   | Erie st     | Chicago     | IL    | 60666 | Visa     | 4333333333338  | 10/22          | Chandler Bing   |
      | FamilyAlbum | 9        | Dr DrakeRamoray | Dale st     | ArL Hgths   | IL    | 60452 | Visa     | 5323333335334  | 10/22          | Dr DrakeRamoray |
      | ScreenSaver | 10       | Monica Geller   | Euclid ave  | Arl Hgths   | IL    | 60312 | Visa     | 73353333333333 | 10/22          | Monica Geller   |
      | MyMoney     | 3        | Ross Geller     | River rd    | Des Plaines | IL    | 30333 | Visa     | 833435363732   | 10/22          | Ross Geller     |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | IL    | 60312 | Visa     | 933533333531   | 12/22          | Ken Adams       |








Feature: Examples of Cucumber data table implementations


  Scenario: List of fruits I like
    Then user should see fruits I like
      | Kiwi        |
      | banana      |
      | orange      |
      | cucumber    |
      | mango       |
      | grape       |
      | pomegranate |

    #to beautify the pips above
    # control+alt+l


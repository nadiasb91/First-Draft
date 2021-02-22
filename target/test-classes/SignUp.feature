Feature: Sign up fro My Account Menu Functionality

  Scenario: Sign up successfully
  META-DATA: {dataProviderClass = DP.class, dataProvider ="signup-provider"}
    When user fill out the sign up from with valid data
    And user submits
    Then Success message should be displayed







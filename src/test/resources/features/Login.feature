
Feature: User login function


  

 # Scenario: Valid login function
  #  Given User is on login screen
   # When Enters credentials "tomsmith" and "SuperSecretPassword!"
    #Then Success message is displayed

   # Scenario Outline: Valid login function
   # Given User is on login screen
    #When Enters credentials "<username>" and "<password>"
    #Then Success message is displayed
    
    #Examples:
    
    #| username | password |
    #| tomsmith | SuperSecretPassword! |
    #| tomsmith1 | SuperSecretPassword1 |
    #| tomsmith2 | SuperSecretPassword2 |
    #| tomsmith3 | SuperSecretPassword3 |
    #| tomsmith4 | SuperSecretPassword4 |
    @SmokeTest
    Scenario: Valid login function
    Given User is on login screen
    When Enters credentials
    |username | password |
    
    | tomsmith | SuperSecretPassword! |
    Then Success message is displayed
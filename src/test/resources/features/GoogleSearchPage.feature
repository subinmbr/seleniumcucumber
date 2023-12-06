//we can give tags at feature level instead of scenario level
@phaseOne
Feature: Google Page Search Function
  


 	  Scenario: Search Java Tutorial
    Given User is on Google Home Page
    When User search Java Tutorial
    Then Should display Java Result page
    
    
    
    Scenario: Search Selenium Tutorial
    Given User is on Google Home Page
    When User search Selenium Tutorial
    Then Should display Selenium Result page
    
    







  


Feature: CRUD application
  
  Scenario: Create new deal
    Given user  logged in
    When create deals
    
@Smoketest
  Scenario: View new deal
    Given user  logged in
    When view deals
    
    
     Scenario: Delete deals
    Given user  logged in
    When delete deals
    
    

Feature: CRUD application
  
  Scenario: Create new tasks
    Given user  logged in
    When create tasks
    
@Smoketest
  Scenario: View new tasks
    Given user  logged in
    When view tasks
    
    
     Scenario: Delete tasks
    Given user  logged in
    When delete tasks
    
    
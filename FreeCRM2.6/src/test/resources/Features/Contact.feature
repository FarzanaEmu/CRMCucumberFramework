#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verify contact Page

  
   
   Background:
    Given Application is launched
    When User navigated to the Login page
    And User enters the userid and password
    And User clicks Login button
     Then Verify user is logged in home page
    When User clicks the contact button
    Then User navigate to the Contact Page

  @smoke @regression 
   Scenario Outline: contact page verification

   
    Then User clicks the create button
    Then User put the contactform  <firstname> and <lastname>
    Then User clicks the save button
    Then User click delete button
     Examples: 
      |firstname|lastname|
      |farzana|sharmin|
      
      
       @tag1
   Scenario Outline: Add the contact without entering mandatory feilds and verify the error message 

   
  
    Then User clicks the create button
    Then User leaves the firstname and lastname empty
    Then User clicks the save button
    Then User gets the error message
     Examples: 
      |firstname|lastname|
      |farzana|sharmin|
      
   
   
    Scenario Outline: Add the contact with entering mandatory feilds and non mandetory field.

  
  
    Then User clicks the create button
    Then User put the contactform  <firstname> and <lastname>
    And User send the Email 
    Then User selects the SOcial Chanel
    Then User put the Address 
    Then User Checks Do not call is Displayed
    And User Verifys Do nor Text is Displayed
    Then User Checking Do not Email is Displayed or not
    Then User clicks the save button
    
     Examples: 
      |firstname|lastname|
      |farzana|sharmin|
    
     
    
   
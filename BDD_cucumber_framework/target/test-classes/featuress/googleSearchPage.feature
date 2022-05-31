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
#@tag
Feature: Perform Google Search based on requirement
  I want to use this template for my feature file

 # @tag1
  Scenario: Search 'tata motor' in Google
    Given User is already in Google search page
    When user types 'tata motor' in search input field and clicks on search button
    Then user gets search result page with the title 'tata motor - Google Search'
    And close the opened browser


#  @tag2
  Scenario Outline: Title of your scenario outline
    Given User is already in Google search page
    When user types <textToBeSearched> in search input field, clicks on search button
    Then  user reached to search result page with the title <expectedTitle>
    And close the opened browser

    Examples: 
      | textToBeSearched  | expectedTitle 												|
      | Selenium 3.0 			|     Selenium 3.0 - Google Search   		| 
      | maruti share		  |     maruti share - Google Search		  | 
            
      

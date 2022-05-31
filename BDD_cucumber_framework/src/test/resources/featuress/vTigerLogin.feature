Feature: As a end user I want to verify vTiger application login functionality

Scenario: Verify Vtiger application login page
    Given User has a valid application URL
    When User hits a login page url
    Then User should reach to login page with title "vtiger"
		And  close the browser for vtiger
		
Scenario: Verify user is able to login in the application with valid credentials
	Given User having valid application URL "https://demo.vtiger.com/vtigercrm/index.php"
	When User hits a login page url
	 And Enter the username as "admin"
	 And  Enter the password as "Test@123"
	 And Click on Signin button
	Then User should reach to home page with title "Dashboard"
	 And close the browser for vtiger
	 
Scenario Outline: Verify user is able to login in the application with <credentials>
	Given User has a valid application URL <appUrl>
    When User hits a login page url
    And Enter the username as <username>
    And Enter the password as <password>
    And Click on Signin button
	 Then User should remain in login page with title <pageTitle>
    And close the browser for vtiger
    
    
  Examples: 
  | credentials         | appUrl                                      | username | password | pageTitle |
  | valid credentials   | https://demo.vtiger.com/vtigercrm/index.php | admin    | Test@123 | Dashboard |
  | invalid credentials | https://demo.vtiger.com/vtigercrm/index.php | admin123 | Test@123 | vtiger    |  
    
    
     
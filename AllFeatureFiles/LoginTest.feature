@Regression
Feature: Login Test 

Background: 
	Given User navigate to the Website 
	
@High 
Scenario Outline: Login as a new sign-up user with valid data 
	Given User entered the user name "<UserNameInput>" 
	And User entered the password "<PWD>" 
	When click on the sign-in button 
	Then validate user successfully logged-in by reading title 
	And LogOut from Actitime 
	Examples: 
		|UserNameInput|PWD |
		|admin| manager |
		|trainee| trainee|
		
@Low 
Scenario: Login as a new sign-up user with invalid data 
	When User entered the user name "admin123" 
	And User entered the password "test123" 
	And click on the sign-in button 
	Then validate user unsuccessful logged-in by reading title
	
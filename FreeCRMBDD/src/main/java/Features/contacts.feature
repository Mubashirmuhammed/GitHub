
@tag
Feature: FreeCRM create a new contact

Scenario Outline: Free CRM Create a new contact scenario

	Given user is already on Login Page
	When title of login page is Free CRM
	Then user enters "<username>" and "<password>"
	Then user clicks on login button
	Then user is on home page
	Then user moves to new contact page
	Then user enters contact details "<title>" and "<firstname>" and "<lastname>"
	Then Close the browser


    Examples: 
			| username 					| password | title 	| firstname 	| lastname 	|
			| mubcrmautomation  | Test@123 | Dr.	 	|	Tom 	 			| Peter			|
			| mubcrmautomation  | Test@123 | Mr.		| David 	 		| Dsouza  	|
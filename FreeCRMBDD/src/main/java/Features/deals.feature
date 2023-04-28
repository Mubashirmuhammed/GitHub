Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

    Given User is allready on Login page
    When Title is FreeCRM
    Then user enters username and password
		| mubcrmautomation | Test@123 |

		And user clicks on login button
		Then user is on home page
		Then user moves to new deal page
		Then user enters deal details
		| test deal | 1000 | 50 | 10 |

		Then Close the browser
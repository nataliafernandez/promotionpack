@Fruti
Feature:login
	Scenario:successful login
		Given my credentials "admin1@gmail.com" with password "admin1"
		When i log into the application
		Then the message "Welcome to Effective Testing!" should appear
		
		
	Scenario:unsuccessful login
		Given my credentials "admin2@gmail.com" with password "admin0"
		When i log into the application
		Then the message "Log in" should appear
		
		
		
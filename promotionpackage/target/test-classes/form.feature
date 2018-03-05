Feature:form
	Scenario:complete the form
		Given my entry form
		When i fill the field name"Natalia" email"natalia.fernandez@globallogic.com" URL"https://www.globallogic.com/latam/" comment"this is a test"
		Then i submit the form and the alert "×Success your comment was posted." is shown
		
		Scenario:incomplete the form
		Given my entry form
		When i fill the field name"Natalia" email"natalia.fernandez@globallogic.com" URL" " comment" "
		Then i submit the form and the alert "×Error your comment was not posted." is shown
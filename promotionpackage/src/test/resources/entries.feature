Feature:entries
	Scenario:select an entry
		Given my entries
		When i select the entry "Test title"
		Then the "Test title" form should appear
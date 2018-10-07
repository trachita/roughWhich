@TvLandingScreen
Feature: Television page test

Background: Launching Which Television page
Given I am on Television Page "https://www.which.co.uk/reviews/televisions"

  Scenario: Validate if telvision landing Page is launching fine
    #Given I launch "https://www.which.co.uk/reviews/televisions" of Which website
    When I am on television page
    Then "All Televisions" All television  tab should be selected
    And "TV & home entertainment" TV & home Entertainment option should be selected
    And "Best Buys (57)"Best Buys tab should be available on the page
    And "Don't Buys (22)" Dont Buys tab should be available on the page
    And "Advice Guides (20)" Advice Guides tab should be available on the page
    And Page title should be "Television reviews - Which?"

  Scenario: Validate the Counts on the Television Page
    #Given I am on Television Page "https://www.which.co.uk/reviews/televisions"    
    Then Header Label Count should match the no of items displayed
    
    Scenario: Single Filter Functionality of the Television Page
    #Given I am on the Television Page "https://www.which.co.uk/reviews/televisions"
    When I select filter Category Screen Size and value "20-28"   
    Then no of items in the filter "20-28"  should match no of items on the page
	  
  
	 Scenario: Consecutive Filter Functionality of the Television Page
    #Given I am on the Television Page "https://www.which.co.uk/reviews/televisions"
    When I select filter Category Screen Size and value "20-28"   
    Then no of items in the filter "20-28"  should match no of items on the page
	  When I Clear Filter Category 
	  And I select filter Category Screen Size and value "32-34"
	  Then no of items in the filter "32-34"  should match no of items on the page 
      
	Scenario: Multiple Filter Functionality of the Television Page
   #Given I am on the Television Page "https://www.which.co.uk/reviews/televisions"
    When I select following filter Category 
    |20-28|
    |32-34|  
    |55-60|  
	  Then No of items in the filters should match no of items in the page 
	  |20-28|
    |32-34|  
    |55-60| 
	  
  Scenario: Sort Functionality of the Television Page
   #Given I am on television page "https://www.which.co.uk/reviews/televisions"
    When I select Price (low to high)
    Then All television should display in ascending price order

  Scenario: Member Options availability
    #Given I am on the Television Page_ "https://www.which.co.uk/reviews/televisions"
    And I am not Logged in
    Then Member options should be disabled

 
    


  
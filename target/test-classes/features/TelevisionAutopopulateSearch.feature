@Search
Feature: Verify Autopopulate in search functionality

  Scenario: Autopopulate search functionality verification
    Given I am on  Television Page_ "https://www.which.co.uk/reviews/televisions"
    When I go to search button
    And I enter "panasonic"
    Then I should be able to select "panasonic tv" from autopolulated list
    And It Should diaplay search result of  "panasonic tv" on search page

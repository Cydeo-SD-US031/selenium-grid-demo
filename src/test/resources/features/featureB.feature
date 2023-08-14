Feature: The application should be running 2


  @regression @test
Scenario: another search
Given I am on the home page
When I search for "useless box"
Then I should see more results

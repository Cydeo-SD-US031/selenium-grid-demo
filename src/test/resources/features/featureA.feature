Feature: The application should be running

  @smoke @test
  Scenario: simple search
    Given I am on the home page
    When I search for "wooden spoon"
    Then I should see the results


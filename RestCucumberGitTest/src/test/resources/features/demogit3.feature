#Author: Ash
#Demo Git Project: jsonplaceholder
#Demo URL: https://jsonplaceholder.typicode.com/users

@Demo @Regression
Feature: jsonplaceholder demo

  @Regression
  Scenario: json placeholder scenario
    Given the API for jsonplaceholder
    When I make a request to API
    Then the status code should be 200
    And the number of objects should be 10
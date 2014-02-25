Feature: User logs in

  @login
  Scenario Outline: Login success & failure
    Given I navigate to the application
    When I try to login with '<type>' credentials
    Then I should see that I logged in '<status>'

  Examples:
    | type             | status         |
    | valid            | successfully   |
    | invalid_username | unsuccessfully |
    | invalid_password | unsuccessfully |

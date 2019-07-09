Feature: As a Netdata user, I want to navigate to the Landing page, so I can see my monitors.

  Background: User at the Landing page.
    Given that I navigate to the 'Landing' page

  Scenario: Navigate to the Landing page.
    Then I will be redirected to the 'Landing' page

  Scenario Outline: Navigate through side menu.
    When I select the menu '<menu>'
    Then I will be redirected to the '<pane>' pane

    Examples: Menu names.
    | menu  | pane |
    | cpu   | cpu  |
    | ram   | ram  |
    | disk  | disk |
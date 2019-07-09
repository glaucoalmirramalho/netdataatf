Feature: As a Netdata user, I want to check my monitors, so I can monitor my equipment usage.

  Background: User at the Landing page.
    Given that I navigate to the 'Landing' page

  Scenario Outline: Get monitors name from System Overview.
    Then the System Overview pane will show the monitor '<monitor>'

    Examples: Monitor names.
    | monitor      |
    | Used Swap    |
    | Disk Read    |
    | Disk Write   |
    | Net Inbound  |
    | Net Outbound |
    | Used RAM     |
Feature: Denial of entry when the bar is full

  Scenario: Mr. Pignon and Mr. Leblanc are denied entry because the bar is full
    Given Mr. Pignon and Mr. Leblanc want to enter the bar
    And there are already 9 people in the bar
    When they try to enter
    Then they are denied entry
    And the bar displays "full"
    
  Scenario: Mr. Pignon and Mr. Leblanc arrive with 8 people already in the bar
    Given Mr. Pignon and Mr. Leblanc want to enter the bar
    And there are already 8 people in the bar
    When they enter the bar
    Then the person behind them cannot enter
    And the bar displays "full"


  Scenario: Mr. Pignon and Mr. Leblanc arrive with 3 people already in the bar
    Given Mr. Pignon and Mr. Leblanc want to enter the bar
    And there are already 3 people in the bar
    When they enter the bar
    Then they find seats

  @tag2
  Scenario Outline: Title of your scenario outline
    Given A number <a> of person in the bar
    When <b> people want to enter
    Then I verify the <status> of the bar

    Examples: 
      | a | b | status   |
      | 9 | 2 | full     |
      | 8 | 2 | not full |
      | 0 | 1 | not full |

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
    When they try to enter
    And the person behind try enter
    Then the bar displays "full"


  Scenario: Mr. Pignon and Mr. Leblanc arrive with 3 people already in the bar
    Given Mr. Pignon and Mr. Leblanc want to enter the bar
    And there are already 3 people in the bar
    When they try to enter
    Then the bar displays "not full"

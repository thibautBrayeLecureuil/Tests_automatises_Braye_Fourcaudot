Feature: Ordering and paying for multiple cocktails

  Scenario: Mr. Pignon and Mr. Leblanc each order a cocktail of the month
    Given Mr. Pignon and Mr. Leblanc are in the bar
    When they each order a cocktail of the month for 10€
    And they pay separately
    Then they each pay 10€ for their drinks

  Scenario: Mr. Leblanc orders more cocktails and pays
    Given Mr. Pignon and Mr. Leblanc ordered 2 cocktails at 10€ each
    When Mr. Leblanc orders 2 more cocktails of the month for his bill
    Then Mr. Leblanc checks the bill and pays 40€
    
  Scenario: Mr. Pignon and Mr. Leblanc each order a cocktail of the month
    Given Mr. Pignon and Mr. Leblanc are in the bar
    When they each order a cocktail of the month for 10€
    Then Mr. Leblanc pays 20€ for both
    
    
Feature: Ordering and paying for multiple cocktails

  Scenario: Mr. Pignon and Mr. Leblanc each order a cocktail of the month
    Given Mr. Pignon and Mr. Leblanc are in the bar
    When Mr. Pignon and Mr. Leblanc order 2 cocktails at 10€ each
    And They pay separatly
    Then They each pays 10€

  Scenario: Mr. Leblanc orders more cocktails and pays
    Given Mr. Pignon and Mr. Leblanc are in the bar
    When Mr. Pignon and Mr. Leblanc order 2 cocktails at 10€ each
    And Mr. Leblanc order 2 cocktails at 10€ each
    Then Mr. Leblanc pays 40€
    
  Scenario: Mr. Pignon and Mr. Leblanc each order a cocktail of the month
    Given Mr. Pignon and Mr. Leblanc are in the bar
    When Mr. Pignon and Mr. Leblanc order 2 cocktails at 10€ each
    Then Mr. Leblanc pays 20€
    
    
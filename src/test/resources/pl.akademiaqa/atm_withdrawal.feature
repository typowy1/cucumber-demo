Feature: Atm Withdrawal

#  kroki które się powtarzają można wyciągnąć do Background
  Background: I have positive balance
    Given I have 100 PLN in my account
#    but zależność
    But my account is loced

  Scenario: I have positive balance so I should be able to withdraw money
#    w krokach zamiast given when than można przekazać gwiazdki
#    When I request 20 PLN
    * I request 20 PLN
    Then 20 PLN should be dispensed
    And 80 PLN should be stay on my account

  Scenario: I should be able to withdrow all money.
    When I request 100 PLN
    Then 100 PLN should be dispensed

#    w Rule możemy dodać wymaganie biznesowe i pod nim kilka scenariuszy
  Rule: Locked account
#    gwiazdke można stosować do powtórzen
    Scenario: Multiple withdrows.
      When I request 20 PLN
      * I request 20 PLN
      * I request 20 PLN
      * I request 20 PLN
      Then 100 PLN should be dispensed

    Scenario: Multiple withdrows.
      When I request 50 PLN
      * I request 30 PLN
      * I request 50 PLN
      * I request 20 PLN
      Then 100 PLN should be dispensed


#  Scenario Outline: I should be able to withdrow money
#    Given I have <AccountBalance> PLN in my account
#    When I request <RequestAmount> PLN
#    Then <DispensedAmount> PLN should be dispensed

#    Examples: Positive balance
##    scenariusz zostanie wykonant tyle razy ile danych tu mamy
#      | AccountBalance | RequestAmount | DispensedAmount |
##      pierwsza linijka odnosi do pierwszego scenariusza
#      | 100            | 20            | 20              |
##      druga linijka odnosie sie do drugiego scenariusza
#      | 100            | 100           | 100             |
#      | 0              | 10            | 0               |
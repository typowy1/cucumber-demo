@first
Feature: ATM Withdrawal single scenario

  I should be able to withdraw money from the ATM

  Background: I have positive balance
    Given I have positive balance on my account
      | account          | balance |
      | saving account   | 50      |
      | debit account    | 20      |
      | personal account | 30      |

  Scenario: I have positive balance so I should be able to withdraw money.
    When I request 20 PLN
    Then 20 PLN should be dispensed
    And 80 PLN should stay on my account

  @allMoney
  Scenario: I should be able to withdraw all money.
    When I request 100 PLN
    And I send confirmation letter
#    możemy przesyłać większy tekst za pomoca docString np json(sformatuje nam plik do jsona) lub np txt
    """txt
    Hello
    Bla bla
    bla
    bla bla
    """
    Then 100 PLN should be dispensed
    And 0 PLN should stay on my account
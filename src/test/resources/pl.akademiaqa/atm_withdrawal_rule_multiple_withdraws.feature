Feature: ATM Withdrawal rule multiple withdraws

  I should be able to withdraw money, multiple times, from the ATM

  Background: I have positive balance
    Given I have 100 PLN in my account

  Rule: Multiple withdraws

    Scenario: Multiple withdraws, positive balance.
      When I request 20 PLN
      * I request 20 PLN
      * I request 20 PLN
      Then in total 60 PLN should be dispensed
      And 40 PLN should stay on my account

    Scenario: Multiple withdraws, negative balance..
      When I request 50 PLN
      * I request 30 PLN
      * I request 50 PLN
      Then in total 100 PLN should be dispensed
      And 0 PLN should stay on my account








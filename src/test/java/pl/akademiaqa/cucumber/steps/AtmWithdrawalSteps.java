package pl.akademiaqa.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.akademiaqa.dto.AccountDto;

import java.util.List;

public class AtmWithdrawalSteps {

    @Given("I have {int} PLN in my account(s)/bank")
    public void i_have_pln_in_my_account(Integer balance) {
        System.out.println("Mam w banku: " + balance);
    }

    @Given("I have positive balance on my accounts")
    public void i_have_positive_balance_on_my_accounts(List<AccountDto> accounts) {
        // 1. LISTA LIST
        // 2. LISTA MAP
        // 3. TRANSFORMERS

        for (AccountDto account: accounts) {
            System.out.println(account.getAccount() + " " + account.getBalance());
        }
    }

    @When("I send confirmation letter")
    public void i_send_confirmation_letter(String docString) {
        System.out.println(docString);
    }

    @When("I request {int} PLN")
    public void i_request_pln(Integer int1) {

    }

    @Then("{int} PLN should be dispensed")
    public void pln_should_be_dispensed(Integer int1) {

    }

    @Then("{int} PLN should stay on my account")
    public void pln_should_stay_on_my_account(Integer int1) {

    }
}

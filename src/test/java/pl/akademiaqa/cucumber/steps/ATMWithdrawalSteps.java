package pl.akademiaqa.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.akademiaqa.dto.AccountDto;

import java.util.List;
import java.util.Map;

public class ATMWithdrawalSteps {


    //    wyrażenia regularne
//    @Given("^I have (.*) PLN in my account$") // .* przekazemy jakiś znak dowolną ilość razy
//    @Given("^I have ([0-9]*) PLN in my account$") //  przekazemy zakres danych tylko liczby
//    @Given("^I have (\\d*) PLN in my account$")// bedziemy używac tylko digits, liczb, d - liczba, w - słowo, s - znak, spacja tabulator
//    @Given("^I have (\\d*) PLN in my (?:account|accounts|bank)$")// mozemy użyć tych wartosci account|account|bank
//    @Given("^I have (\\d+) PLN in my (?:account|accounts|bank)$")// +wymusza ze musi być jakaś wartość
//    public void iHavePLNInMyAccount(Integer balance) {
//        System.out.println(balance);
//
//    }

//    bedzie działało dla liczby pojedyńczej  konta i liczby mnogiej kont
//      / pozwala na zmiane słowa w tym momencie bedzie działało z account, accounts i bank
//    @Given("I have {int} PLN in my account(s)/bank")
    @Given("I have {int} PLN in my account(s)")
    public void iHavePLNInMyAccount(Integer balance) {
        System.out.println(balance);
    }


//    @Given("I have positive balance on my account")
//    public void iHavePositiveBalanceOnMyAccount(DataTable dataTable) {
        //1 podejscie lista list nie polecane
//        List<List<String>> lists = dataTable.asLists();//pracowanie z lista list, sposob nie polecany
//
//        for (List<String> columns : lists) {
//            System.out.println(columns.get(0) + " " + columns.get(1));
//        }

//        2. podejscie lista map, czytelmiejsze
//        Polecany sposób to lista map, zwieksza czytelnosc poprzez dodania naglowka w tabeli, mozesz wyciagac wartosci po nazwie klucza

//        List<Map<String, String>> maps = dataTable.asMaps(); //posiada klucz i wartosc dzieki naglowka w tabeli, naglowki sa kluczami
//        for (Map<String, String> columns : maps) {
//            System.out.println(columns.get("account") + " " + columns.get("balance")); //wyciągamy wartości za pomocą klucza
//        }
        //tak wygląda lista map
//        [
//          {"account": "saving account", "balance": "50"},
//          {"account": "debit account", "balance": "20"},
//          {"account": "personal accoun", "balance": "30"}
//        ]
//    }

//    podejscie 3 użycie transformersa ktory zamieni nam data table na nasze dto
    @Given("I have positive balance on my account")
    public void iHavePositiveBalanceOnMyAccount(List<AccountDto> accounts) {

        for (AccountDto account : accounts) {
            System.out.println("Transformer: " + account.getAccount() + " " + account.getBalance());
        }
    }

    @When("I send confirmation letter")
    public void i_send_confirmation_letter(String docString) {
        System.out.println(docString);
    }

    @When("I request {int} PLN")
    public void iRequestPLN(Integer int1) {

    }

    @Then("{int} PLN should be dispensed")
    public void plnShouldBeDispensed(Integer int1) {

    }

    @Then("{int} PLN should stay on my account")
    public void plnShouldStayOnMyAccount(Integer int1) {

    }
}

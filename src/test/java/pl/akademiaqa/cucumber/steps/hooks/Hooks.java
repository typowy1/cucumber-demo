package pl.akademiaqa.cucumber.steps.hooks;

import io.cucumber.java.BeforeStep;

public class Hooks {

    @BeforeStep(value = "@allMoney") //uruchamianie hooku przed stepem z danym tagiem
    public void beforeStep(){
        System.out.println("Before step hook");
    }
}

package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListStep extends BaseTest {

    @When("User click Humberger button")
    public void userClickHumbergerButton() {
        list.HumbergerButton();
    }

    @Then("User click list")
    public void userClickList() {
        list.clickListMenu();
    }

    @And("User Choosing and long press in the list")
    public void userChoosingAndLongPressInTheList() {
        list.longPressInTheListMenu();
    }

    @Then("User Choosing and Multiple tap in the list")
    public void userChoosingAndMultipleTapInTheList() {
        list.tapMultipleTimesInTheSecondMenu();
        list.tapMultipleTimesInTheSecondMenu1();
    }
}

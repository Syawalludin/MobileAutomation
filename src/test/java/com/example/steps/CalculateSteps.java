package com.example.steps;

import com.example.BaseTest;
import com.example.app.CalculatorAutomation.Calculation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateSteps extends BaseTest{

    //Penjumlahan
    @Given("User input number1 {int}")
    public void userInputNumberNumber1(int Number1) {
        calculation.inputNumber1(String.valueOf(Number1));
    }

    @Given("User input number2 {int}")
    public void userInputNumberNumber2(int Number2) {
        calculation.inputNumber2(String.valueOf(Number2));
    }

    @When("User clik button calculate")
    public void userClikButtonCalculate() {
        calculation.clickButtonCalculate();
    }

    @And("user expected {string}")
    public void userExpected(String expected) {
        String titleText = calculation.GetText();
        Assertions.assertEquals(expected, titleText);
    }

    //Pengurangan
    @When("User click drop down button")
    public void userClickDropDownButton() {
        choosing.clickDropdownButton();
    }

    @Then("User click substraction")
    public void userClickSubstraction() {
        choosing.clickiconMin();
    }

    @And("User expected for subtraction {string}")
    public void userExpectedForSubtraction(String expected) {
        String titleText = calculation.GetText();
        Assertions.assertEquals(expected, titleText);
    }

    //Pembagian
    @Then("User click distribution")
    public void userClickDistribution() {
        choosing.clickiconSlash();
    }

    @And("User expected for distribution {string}")
    public void userExpectedForDistribution(String expected) {
        String titleText = calculation.GetText();
        Assertions.assertEquals(expected, titleText);
    }

    //Perkalian
    @Then("User click multiplication")
    public void userClickMultiplication() {
        choosing.clickiconMultiple();
    }
    @And("User expected for multiplication {string}")
    public void userExpectedForMultiplicationHasil(String expected) {
        String titleText = calculation.GetText();
        Assertions.assertEquals(expected, titleText);
    }
}

package com.example;

import com.example.app.CalculatorAutomation.Calculation;
import com.example.app.CalculatorAutomation.Choosing;
import com.example.app.CalculatorAutomation.List;
import com.example.app.CalculatorAutomation.LoginPage;

public class BaseTest {

  public LoginPage loginPage = new LoginPage();
  public Calculation calculation = new Calculation();
  public Choosing choosing = new Choosing();
  public List list = new List();

}

package com.example.app.CalculatorAutomation;


import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class Calculation extends BasePageObject {
    public void inputNumber1(String Number1){
        type(MobileBy.id("et_1"), Number1 );
    }
    public void inputNumber2(String Number2){
        type(MobileBy.id("et_2"), Number2 );
    }
    public void clickButtonCalculate(){
        click(MobileBy.id("acb_calculate"));
    }
    public String GetText(){
        return getText(MobileBy.id("tv_result"));
    }


}

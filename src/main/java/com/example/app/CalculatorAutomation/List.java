package com.example.app.CalculatorAutomation;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class List extends BasePageObject {

    public void HumbergerButton(){
        click(MobileBy.AccessibilityId("Open navigation drawer"));
    }

    public void clickListMenu(){
        click(MobileBy.id("et_2"));
    }
    public void longPressInTheListMenu() {
        longPressObject(findElements(MobileBy.id("text_view")).get(6));
    }

    public void tapMultipleTimesInTheSecondMenu() {
        tapMultipleTimes(findElements(MobileBy.id("text_view")).get(4));
    }

    public void tapMultipleTimesInTheSecondMenu1(){
        tapMultipleTimes(findElements(MobileBy.id("text_view")).get(5));
    }


}

package com.example.app.CalculatorAutomation;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class Choosing extends BasePageObject {
    public void clickDropdownButton(){
        click(MobileBy.id("spinner_1"));
    }

    public void clickiconMin(){
        click(MobileBy.xpath("//android.widget.TextView[2]"));
    }

    public void clickiconSlash(){
        click(MobileBy.xpath("//android.widget.TextView[3]"));
    }

    public void clickiconMultiple(){
        click(MobileBy.xpath("//android.widget.TextView[4]"));
    }
}

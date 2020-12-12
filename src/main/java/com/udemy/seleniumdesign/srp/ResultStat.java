package com.udemy.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultStat extends AbstractComponents{

    @FindBy(css = "serp-adv__found")
    WebElement status;



    public ResultStat(WebDriver driver) {
        super(driver);
    }

    public String getStatus(){
        return status.getText();
    }

    @Override
    public boolean isDisplayed() {
        return wait.until((d)-> status.isDisplayed());
    }
}

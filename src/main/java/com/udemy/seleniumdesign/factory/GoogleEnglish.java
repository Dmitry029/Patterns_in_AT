package com.udemy.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

class GoogleEnglish extends GooglePage {

    public GoogleEnglish(WebDriver driver) {
        super(driver);
    }


    @Override
    public void launchSite() {
        driver.get("https://www.google.com/");
    }
}

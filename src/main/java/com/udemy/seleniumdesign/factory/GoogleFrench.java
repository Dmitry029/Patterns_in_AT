package com.udemy.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

class GoogleFrench extends GooglePage {

    public GoogleFrench(WebDriver driver) {
        super(driver);
    }

    @Override
    public void launchSite() {
        driver.get("https://www.google.fr/");
        language.click();
    }
}

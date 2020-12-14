package com.udemy.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

class GoogleES extends GooglePage {

    public GoogleES(WebDriver driver) {
        super(driver);
    }

    @Override
    public void launchSite(){
        this.driver.get("https://www.google.es");
        this.language.click();
    }

}

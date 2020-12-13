package com.udemy.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleFrench extends GooglePage {


    public GoogleFrench(WebDriver driver) {
        super(driver);
     }

    @Override
    public void launchSite() {
        driver.get("https://www.google.fr/");
    }
 }

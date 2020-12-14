package com.udemy.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class GoogleArabic extends GooglePage {

    @FindBy(css = ".hOoLGe")
    WebElement keyboardIcon;

    @FindBy(css = "#kbd")
    WebElement keyboard;


    public GoogleArabic(WebDriver driver){
        super(driver);
    }


    @Override
    public void launchSite() {
        driver.get("https://www.google.com.sa/");
        language.click();
    }

    public void search(String keyword){
        wait.until((d) -> keyboardIcon.isDisplayed());
        keyboardIcon.click();
        wait.until((d) -> keyboard.isDisplayed());
        super.search(keyword);
    }
}

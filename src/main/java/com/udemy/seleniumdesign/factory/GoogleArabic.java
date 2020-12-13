package com.udemy.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleArabic extends GooglePage {


    @FindBy(name = "btnI")
    WebElement searchButton;

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
    }

    public void search(String keyword){
        wait.until((d) -> keyboardIcon.isDisplayed());
        keyboardIcon.click();
        wait.until((d) -> keyboard.isDisplayed());

        searchBox.sendKeys(keyword);
        wait.until((d) -> searchButton.isDisplayed());
        searchButton.click();

        //super.search(keyword);
    }

}

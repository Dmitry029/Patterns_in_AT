package com.udemy.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleEnglish extends GooglePage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(name = "btnK")
    WebElement searchButton;

    @FindBy(css = ".rc")
    List<WebElement> results;


    public GoogleEnglish(final WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }


    @Override
    public void launchSite() {
        driver.get("https://www.google.com/");
    }

    @Override
    public void search(String keyword) {
        searchBox.sendKeys(keyword);
        wait.until((d) -> searchButton.isDisplayed());
        searchButton.click();
    }

    @Override
    public int getResultCount() {
        wait.until((d) -> this.results.size() > 1);
        return this.results.size();
    }
}

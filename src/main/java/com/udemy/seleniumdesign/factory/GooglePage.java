package com.udemy.seleniumdesign.factory;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class GooglePage {

    public WebDriver driver;
    public WebDriverWait wait;

    @FindBy(css = "div#gws-output-pages-elements-homepage_additional_languages__als a")
    WebElement language;

    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(name = "btnK")
    WebElement searchButton;

    @FindBy(css = ".rc")
    List<WebElement> results;

    public GooglePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }


    public abstract void launchSite();

    public void search(String keyword){
        //searchBox.sendKeys(keyword);

        for(char ch : keyword.toCharArray()){
            Uninterruptibles.sleepUninterruptibly(5, TimeUnit.MILLISECONDS);
            this.searchBox.sendKeys(ch + "");
        }

        wait.until((d) -> searchButton.isDisplayed());
        searchButton.click();
    };

    public int getResultCount(){
        wait.until((d) -> this.results.size() > 1);
        return this.results.size();
    };
}

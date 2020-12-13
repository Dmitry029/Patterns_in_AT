package com.udemy.seleniumdesign.srp.mainPage;

import com.udemy.seleniumdesign.srp.common.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageSearchWidget extends AbstractComponents {


    @FindBy(css = "#text")
    private WebElement searchBox;


    public MainPageSearchWidget(final WebDriver driver) {
        super(driver);
    }

    public void enter(String keyword) {
        this.searchBox.clear();

        /*for(char ch : keyword.toCharArray()){
            Uninterruptibles.sleepUninterruptibly(20, TimeUnit.MILLISECONDS);
            this.searchBox.sendKeys(ch + "");
        }
        searchBox.sendKeys(" ");*/
        this.searchBox.sendKeys(keyword);
    }


    @Override
    public boolean isDisplayed() {
        return this.wait.until((driver) -> this.searchBox.isDisplayed());
    }
}

package com.udemy.seleniumdesign.srp.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchSuggestion extends AbstractComponents {

    @FindBy(css = "li[class^=mini-suggest]")
    List<WebElement> suggestions;

    public SearchSuggestion(final WebDriver driver) {
        super(driver);
    }

    public void clickSuggestionByIndex(int index) {

        int count = 0;
        do{
            count++;
        }while (suggestions.size() < 9 && count < 3);

        System.out.println("**** count " + count + "   size " + suggestions.size());
        this.suggestions.get(index - 1).click();
    }


    @Override
    public boolean isDisplayed() {
        return this.wait.until((driver) -> this.suggestions.size() > 5);
    }
}

package com.udemy.seleniumdesign.srp.resultPage;

import com.udemy.seleniumdesign.srp.common.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPageSearchWidget extends AbstractComponents {

    @FindBy(css = ".input__control.mini-suggest__input")
    private WebElement resultPageSearchBox;

    public ResultPageSearchWidget(WebDriver driver) {
        super(driver);
    }

    public void enter(String keyword) {
        this.resultPageSearchBox.clear();

        /*for(char ch : keyword.toCharArray()){
            Uninterruptibles.sleepUninterruptibly(20, TimeUnit.MILLISECONDS);
            this.searchBox.sendKeys(ch + "");
        }
        searchBox.sendKeys(" ");*/
        this.resultPageSearchBox.sendKeys(keyword);
    }

    @Override
    public boolean isDisplayed() {
        return wait.until((d)-> resultPageSearchBox.isDisplayed());
    }
}

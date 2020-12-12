package com.udemy.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponents {

    @FindBy(css = ".services-new__list")
    WebElement bar;

    @FindBy(css = "[data-id ='news'] > .services-new__icon")
    WebElement newsIcon;

    @FindBy(css = "[data-id ='images'] > .services-new__icon")
    WebElement imagesIcon;

    @FindBy(css = "[data-id ='maps'] > .services-new__icon")
    WebElement mapsIcon;


    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public void goToImages(){
        imagesIcon.click();
    }

    public void goToNews(){
        newsIcon.click();
    }

    public void goToMaps(){
        mapsIcon.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.bar.isDisplayed());
    }
}

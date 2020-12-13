package com.udemy.seleniumdesign.srp.resultPage;

import com.udemy.seleniumdesign.srp.common.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPageNavigationBar extends AbstractComponents {

    @FindBy(css = ".navigation__region")
    WebElement navigationBar;

    @FindBy(xpath = "//span[@class='service__name'][text()='Новости']")
    WebElement newsWidget;

    @FindBy(xpath = "//span[@class='service__name'][text()='Картинки']")
    WebElement imagesWidget;

    @FindBy(xpath = "//span[@class='service__name'][text()='Карты']")
    WebElement mapsWidget;


    public ResultPageNavigationBar(WebDriver driver) {
        super(driver);
    }

    public void goToImages(){
        imagesWidget.click();
    }

    public void goToNews(){
        newsWidget.click();
    }

    public void goToMaps(){
        mapsWidget.click();
    }

    @Override
    public boolean isDisplayed() {
        return wait.until((d)-> navigationBar.isDisplayed());
    }
}

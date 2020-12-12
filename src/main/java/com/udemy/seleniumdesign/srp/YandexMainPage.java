package com.udemy.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class YandexMainPage {

    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public YandexMainPage (final WebDriver driver){
        this.driver = driver;
        this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
    }

    public void getTo(){
        this.driver.get("https://yandex.by/");
    }

    public SearchWidget getSearchWidget(){
        return searchWidget;
    }

    public SearchSuggestion getSearchSuggestion(){
        return searchSuggestion;
    }

}

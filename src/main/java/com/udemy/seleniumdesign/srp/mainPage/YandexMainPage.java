package com.udemy.seleniumdesign.srp.mainPage;

import com.udemy.seleniumdesign.srp.common.SearchSuggestion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class YandexMainPage {

    private WebDriver driver;
    private MainPageSearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public YandexMainPage (final WebDriver driver){
        this.driver = driver;
        this.searchWidget = PageFactory.initElements(driver, MainPageSearchWidget.class);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
    }

    public void getTo(){
        this.driver.get("https://yandex.by/");
    }

    public MainPageSearchWidget getSearchWidget(){
        return searchWidget;
    }

    public SearchSuggestion getSearchSuggestion(){
        return searchSuggestion;
    }

}

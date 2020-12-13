package com.udemy.seleniumdesign.srp.resultPage;

import com.udemy.seleniumdesign.srp.common.SearchSuggestion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class YandexResultPage {

    private SearchSuggestion searchSuggestion;
    //private SearchWidget searchWidget;
    //private NavigationBar navigationBar;
    private ResultStat resultStat;
    private ResultPageNavigationBar resultPageNavigationBar;
    private ResultPageSearchWidget resultPageSearchWidget;

    public YandexResultPage(final WebDriver driver) {
        //this.searchSuggestion = new SearchSuggestion(driver); // I can use this way or other
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
        //this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
        //this.navigationBar = PageFactory.initElements(driver, NavigationBar.class);
        this.resultStat = PageFactory.initElements(driver, ResultStat.class);
        this.resultPageNavigationBar = PageFactory.initElements(driver, ResultPageNavigationBar.class);
        this.resultPageSearchWidget = PageFactory.initElements(driver,ResultPageSearchWidget.class);
    }

    /*public SearchWidget getSearchWidget() {
        return searchWidget;
    }*/

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    /*public NavigationBar getNavigationBar() {
        return navigationBar;
    }*/

    public ResultStat getResultStat() {
        return resultStat;
    }

    public ResultPageNavigationBar getResultPageNavigationBar() {
        return resultPageNavigationBar;
    }

    public ResultPageSearchWidget getResultPageSearchWidget(){
        return resultPageSearchWidget;
    }
}

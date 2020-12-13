package com.udemy.seleniumdesign.test.srp;

import com.udemy.seleniumdesign.srp.mainPage.YandexMainPage;
import com.udemy.seleniumdesign.srp.resultPage.YandexResultPage;
import com.udemy.seleniumdesign.test.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class YandexTest extends BaseTest {

    private YandexMainPage yandexMainPage;
    private YandexResultPage yandexResultPage;

    @BeforeTest
    public void setupPages() {
        this.yandexMainPage = new YandexMainPage(driver);
        this.yandexResultPage = new YandexResultPage(driver);
    }

    @Test(dataProvider = "getData")
    public void yandexWorkFlow(String keyword, int index) {

        yandexMainPage.getTo();
        assertTrue(yandexMainPage.getSearchWidget().isDisplayed());

        yandexMainPage.getSearchWidget().enter(keyword);
        assertTrue(yandexMainPage.getSearchSuggestion().isDisplayed());

        yandexMainPage.getSearchSuggestion().clickSuggestionByIndex(index);
        assertTrue(yandexResultPage.getResultPageNavigationBar().isDisplayed());

        yandexResultPage.getResultPageSearchWidget().enter(keyword);
        assertTrue(yandexResultPage.getSearchSuggestion().isDisplayed());

        yandexResultPage.getSearchSuggestion().clickSuggestionByIndex(index);
        System.out.println(yandexResultPage.getResultStat().getStatus());

        //yandexResultPage.getResultPageNavigationBar().goToNews();
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"selenium", 3},
                {"docker", 2}
        };
    }
}

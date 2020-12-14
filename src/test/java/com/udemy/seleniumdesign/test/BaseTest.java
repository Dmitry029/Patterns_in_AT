package com.udemy.seleniumdesign.test;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setDriver() {
        //System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        //this.driver = new FirefoxDriver();


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterTest
    public void quitDriver() {
       // Uninterruptibles.sleepUninterruptibly(2, SECONDS);
        this.driver.quit();
    }

}

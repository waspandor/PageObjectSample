package com.bbc.testcases;

import com.bbc.pages.HomePage;
import com.bbc.pages.NewsPage;
import com.bbc.pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Waseem on 8/21/2016.
 */
public class verifyTopNav {

    WebDriver driver;

    @Before
    public void startUp() {
        driver = new FirefoxDriver();

    }


    @After
    public void finish() {

        driver.quit();
    }


    @Test
    public void VerifyTopNav() {

//        HomePage home = new HomePage(driver);
//        home.navigateToHomePage();
//        NewsPage news = home.clickOnNews();
//        System.out.println(news.verifyOnNewsPage());
//        SportsPage sports = home.clickOnSports();
//        System.out.println(sports.verifyOnSportsPage());


    }


}

package com.bbc.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Waseem on 8/21/2016.
 */
public class Page {

    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage navigateToHomePage() {

        driver.get("http://www.bbc.co.uk");
        return new HomePage(driver);
    }
}

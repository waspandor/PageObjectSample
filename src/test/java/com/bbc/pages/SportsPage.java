package com.bbc.pages;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by Waseem on 8/21/2016.
 */
public class SportsPage extends Page {

    public SportsPage(WebDriver driver) {
        super(driver);
        assertTrue(getTitle().equals("Home - BBC Sport"));
    }

    public String getTitle() {
        return driver.getTitle();
    }
}

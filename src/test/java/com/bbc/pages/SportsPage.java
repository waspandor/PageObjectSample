package com.bbc.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Waseem on 8/21/2016.
 */
public class SportsPage extends Page {

    public SportsPage(WebDriver driver) {
        super(driver);

    }

    public String verifyOnSportsPage() {
        return driver.getCurrentUrl();
    }
}

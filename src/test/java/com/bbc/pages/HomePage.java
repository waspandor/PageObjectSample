package com.bbc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by Waseem on 8/21/2016.
 * <p>
 * Will stote locators and methofs
 */
public class HomePage extends Page {

    public HomePage(WebDriver driver) {
        super(driver);


    }


    public NewsPage clickOnNews() {
        driver.findElement(By.className("orb-nav-news")).click();
        return new NewsPage(driver);
    }


    public SportsPage clickOnSports(){

        driver.findElement(By.className("orb-nav-sport")).click();
        return new SportsPage(driver);
    }
}

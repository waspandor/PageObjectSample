package com.bbc.pages;

import org.openqa.selenium.By;
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

    public SportsPage navigateToSportsPage() {
        driver.findElement(By.className("orb-nav-sport")).click();
        return new SportsPage(driver);
    }

    public NewsPage clickOnNews() {
        driver.findElement(By.className("orb-nav-news")).click();
        return new NewsPage(driver);
    }

    public AccountPage navigateToAccountPage() {
        driver.findElement(By.id("idcta-link")).click();
        return new AccountPage(driver);
    }


}

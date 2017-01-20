package com.bbc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

    public HomePage(WebDriver driver) {
        super(driver);


    }


    public NewsPage clickOnNews() {
        driver.findElement(By.className("orb-nav-news")).click();
        return new NewsPage(driver);
    }


    public void verifyUserLoggedIn(String username){

        System.out.println("Useris logged in");

    }

}

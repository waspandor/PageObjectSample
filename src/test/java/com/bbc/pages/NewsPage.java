package com.bbc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Waseem on 8/21/2016.
 */
public class NewsPage extends Page {

    public NewsPage(WebDriver driver) {
        super(driver);
        verifyOnNewsPage();

    }

    public String verifyOnNewsPage() {
        return driver.getCurrentUrl();
    }


    public void tested() {

        System.out.println("News Test");
    }

}

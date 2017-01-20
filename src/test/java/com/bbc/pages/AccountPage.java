package com.bbc.pages;

import com.bbc.pages.NewsPage;
import com.bbc.pages.Page;
import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class AccountPage extends Page {

    public String validUsername = "pandor@putsbox.com";
    String validPassword = "password321";

    public AccountPage(WebDriver driver) {
        super(driver);
        //assertTrue(getTitle().equals("BBC – Sign in"));
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void enterValidUserName(){
        driver.findElement(By.id("username-input")).sendKeys(validUsername);
    }

    public void enterValidPassword(){
        driver.findElement(By.id("password-input")).sendKeys(validPassword);
    }

    public HomePage clickSignIn (){
        driver.findElement(By.id("submit-button")).click();
        return new HomePage(driver);
    }

    public void clickOnUserSetting(){

        driver.findElement(By.linkText("Continue to settings")).click();
    }

    public void verifyCorrectUserLoggedIn(){
        /*
        Although this assertion does work, it is extremely primitive and not something i would normally use
        Given more time I would look to implement something more stable and reliable
         */
        assertTrue(driver.getPageSource().contains(validUsername));
    }

    public void forgottenPasswordLink(){

        driver.findElement(By.linkText("Need help signing in?")).click();
        driver.findElement(By.linkText("I've forgotten my password")).click();
        driver.findElement(By.id("email-input")).sendKeys(validUsername);
        driver.findElement(By.id("submit-button")).click();

    }


    public void inputNewPassword(){

        driver.findElement(By.id("password-input")).sendKeys("Password123");
        driver.findElement(By.id("submit-button")).click();
    }


}
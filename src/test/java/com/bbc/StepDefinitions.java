package com.bbc;

import com.bbc.pages.HomePage;
import com.bbc.pages.NewsPage;
import com.bbc.pages.SportsPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by pandorw on 19/01/2017.
 */
public class StepDefinitions {


    HomePage homePage;
    SportsPage sportsPage;

    WebDriver driver;


    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void runDown() {

        driver.quit();
    }

    @Given("^The user navigates to the BBC homepage$")
    public void the_user_navigates_to_the_BBC_homepage() {
        homePage = new HomePage(driver);
        homePage.navigateToHomePage();

    }

    @Then("^clicks on the sports page$")
    public void clicks_on_the_sports_page() {
        sportsPage = homePage.clickOnSports();
    }


}

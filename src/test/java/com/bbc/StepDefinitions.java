package com.bbc;

import com.bbc.pages.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by pandorw on 19/01/2017.
 */
public class StepDefinitions {

    AccountPage accountPage;
    Page page;
    HomePage homePage;
    SportsPage sportsPage;
    NewsPage newsPage;

    WebDriver driver;


    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void runDown() {

        //   driver.quit();
    }

    @Given("^The user navigates to the BBC homepage$")
    public void the_user_navigates_to_the_BBC_homepage() {
        homePage = new HomePage(driver).navigateToHomePage();

    }


    @Then("^clicks on the sign in link$")
    public void clicks_on_the_sign_in_link() {
        accountPage = homePage.navigateToAccountPage();
    }


    @When("^enters valid username$")
    public void enters_valid_username() {
        accountPage.enterValidUserName();
    }

    @When("^enters valid password$")
    public void enters_valid_password() {
        accountPage.enterValidPassword();
    }

    @When("^clicks the sign in button$")
    public void clicks_the_sign_in_button() {
        homePage = accountPage.clickSignIn();
    }

    @Then("^the user is logged in$")
    public void the_user_is_logged_in() {
        homePage.verifyUserLoggedIn("Test");
    }

    @Then("^navigate to the user settings page$")
    public void navigate_to_the_user_settings_page() {
        accountPage.clickOnUserSetting();

    }

    @Then("^verify the correct user is logged in$")
    public void verify_the_correct_user_is_logged_in() {
        accountPage.verifyCorrectUserLoggedIn();
    }


    @Then("^submits the correct username$")
    public void submits_the_correct_username() {

    }


    @Then("^clicks on the forgotten password link$")
    public void clicks_on_the_forgotten_password_link() {
        accountPage.forgottenPasswordLink();
    }

    @Then("^follows the link from within the received email$")
    public void follows_the_link_from_within_the_received_email() {

        driver.manage().deleteAllCookies();
        driver.get("http://putsbox.com/pandor/inspect");
        String test = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/table/tbody/tr/td[4]/a[2]")).getAttribute("href");
        driver.get(test);
        String waseem = driver.getPageSource();
        String result = waseem.substring(waseem.indexOf("token") - 43, waseem.indexOf("GB") + 2);
        System.out.println(result);
        driver.get(result);
    }


    @Then("^enters the new password$")
    public void enters_the_new_password() {
        accountPage.inputNewPassword();

    }


    ////////////////////////////////////////////////////////

    @Then("^clicks on the sports page$")
    public void clicks_on_the_sports_page() {
        sportsPage = homePage.navigateToSportsPage();
    }

    @Then("^click on the News page$")
    public void click_on_the_News_page() {

        newsPage = sportsPage.clickOnNews();
        newsPage.tested();
    }

}

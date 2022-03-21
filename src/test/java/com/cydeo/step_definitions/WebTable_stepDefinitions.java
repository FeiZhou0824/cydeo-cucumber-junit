package com.cydeo.step_definitions;

import com.cydeo.page.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTable_stepDefinitions {



    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.inputUserName.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginButton.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String pw) {
       webTableLoginPage.login(username,pw);
    }

    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {
//        webTableLoginPage.inputUserName.sendKeys(credentials.get("username"));
//        webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
//        webTableLoginPage.loginButton.click();

        webTableLoginPage.login(credentials.get("username"),credentials.get("password"));

    }
}

/*
TC #: Login scenario
1- Open a chrome browser
2- Go to: https://web-table-2.cydeo.com/login
3- Enter username: Test
4- Enter password: Tester
5- Verify URL:
Expected: URL should end with “orders”

Note: Follow POM
Try different ways of implementing this step:


TC #: Login scenario using maps/ alternative practice

Scenario: User should be able to see all 12 months in
months
dropdown
  Given User is on the login page of Web table app
  When User enters below credentials
    | username     | Test   |
    | password     | Tester |
  Then User should see url contains orders
 */

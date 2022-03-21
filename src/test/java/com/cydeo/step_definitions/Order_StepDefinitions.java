package com.cydeo.step_definitions;

import com.cydeo.page.BasePage;
import com.cydeo.page.OrderPage;
import com.cydeo.page.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.support.ui.Select;

public class Order_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();
    OrderPage orderPage = new OrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {

        //Getting the page using the URL from configuration.properties
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));

        //Calling our login method to log in to web table app
        webTableLoginPage.login();

        //Clicking to "order"link to go order page
        basePage.order.click();



    }

    @When("user selects product type {string}")
    public void userSelectsProductType(String string) {
        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);
    }

    @And("user enters quantity {string}")
    public void userEntersQuantity(String string) {
    }

    @And("user enters costumer name {string}")
    public void userEntersCostumerName(String arg0) {
    }

    @And("user enters street {string}")
    public void userEntersStreet(String arg0) {
    }

    @And("user enters city {string}")
    public void userEntersCity(String arg0) {
    }

    @And("user enters state {string}")
    public void userEntersState(String arg0) {
    }

    @And("user enters zipcode {string}")
    public void userEntersZipcode(String arg0) {
    }

    @And("user selects credit card type {string}")
    public void userSelectsCreditCardType(String arg0) {
    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String arg0) {
    }

    @And("user enters expiry date {string}")
    public void userEntersExpiryDate(String arg0) {
    }

    @And("user enters process order button")
    public void userEntersProcessOrderButton() {
    }

    @Then("user should see {string} in first row of the web table")
    public void userShouldSeeInFirstRowOfTheWebTable(String arg0) {
    }
}

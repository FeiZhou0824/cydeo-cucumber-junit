package com.cydeo.step_definitions;

import com.cydeo.page.BasePage;
import com.cydeo.page.OrderPage;
import com.cydeo.page.ViewAllOrdersPage;
import com.cydeo.page.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Order_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();
    OrderPage orderPage = new OrderPage();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

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

//    @And("user enters quantity {string}")
//    public void userEntersQuantity(String string) {
//        orderPage.inputQuantity.sendKeys(string);
//    }

    @And("user enters quantity {int}")
    public void userEntersQuantity(int arg0) {

        //accepting int argument and sending it using sendKeys()method
        //since sendKeys() method only accepts string, we need to either concat with ""
        //or send String.valueOf(int);
       // orderPage.inputQuantity.sendKeys(arg0+"");

        //clear()method will delete whatever is in the input box
        orderPage.inputQuantity.clear();
        orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);
        orderPage.inputQuantity.sendKeys(String.valueOf(arg0));
    }

    @And("user enters costumer name {string}")
    public void userEntersCostumerName(String string) {
        orderPage.inputName.sendKeys(string);

    }

    @And("user enters street {string}")
    public void userEntersStreet(String string) {
        orderPage.inputStreet.sendKeys(string);
    }

    @And("user enters city {string}")
    public void userEntersCity(String string) {
        orderPage.inputCity.sendKeys(string);
    }

    @And("user enters state {string}")
    public void userEntersState(String string) {
        orderPage.inputState.sendKeys(string);
    }

    @And("user enters zipcode {string}")
    public void userEntersZipcode(String string) {
        orderPage.inputZip.sendKeys(string);
    }

    @And("user selects credit card type {string}")
    public void userSelectsCreditCardType(String expectedCardType) {
       List<WebElement> cardTypes = orderPage.cardType;
        for (WebElement each : cardTypes) {
            if(each.getAttribute("value").equalsIgnoreCase(expectedCardType)){
                each.click();
            }

        }
    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String string) {
        orderPage.inputCreditCardNumber.sendKeys(string);
    }

    @And("user enters expiry date {string}")
    public void userEntersExpiryDate(String string) {
        orderPage.inputExpireDate.sendKeys(string);
    }

    @And("user enters process order button")
    public void userEntersProcessOrderButton() {
        orderPage.processOrderButton.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void userShouldSeeInFirstRowOfTheWebTable(String expectedName) {
        String actualName = viewAllOrdersPage.newCustomerNameCell.getText();
        Assert.assertEquals(expectedName,actualName);




    }



}

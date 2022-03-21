package com.cydeo.step_definitions;

import com.cydeo.page.SmartBearOrderPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_stepDefinitions {
    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();

    @When("user on smartBear homepage")
    public void user_on_smart_bear_homepage() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?Return\n" +
                "Url=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx ");

    }

    @And("Enter Tester as username")
    public void enterTesterAsUsername() {
        smartBearOrderPage.userName.sendKeys("Tester");
    }

    @And("Enter test as password")
    public void enterTestAsPassword() {
        smartBearOrderPage.passWord.sendKeys("test");
    }
    @And("click login;")
    public void clickLogin() {
        smartBearOrderPage.login.click();
    }
    @And("user go to Order Page")
    public void userGoToOrderPage() {
        smartBearOrderPage.orderPage.click();
    }


    @And("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String dropDown) {
        Select selectObj = new Select(smartBearOrderPage.dropDown);
        selectObj.selectByValue(dropDown);
    }


    @Then("User enters {string} to quantity")
    public void userEntersToQuantity(String quantity) {
        smartBearOrderPage.quantity.sendKeys(quantity);
    }

    @Then("User enters {string} to costumer name")
    public void userEntersToCostumerName(String customerName) {
        smartBearOrderPage.customerName.sendKeys(customerName);
    }

    @Then("User enters {string} to street")
    public void userEntersToStreet(String street) {
        smartBearOrderPage.street.sendKeys(street);
    }

    @Then("User enters {string} to city")
    public void userEntersToCity(String city) {
        smartBearOrderPage.city.sendKeys(city);
    }

    @Then("User enters {string} to state")
    public void userEntersToState(String state) {
        smartBearOrderPage.state.sendKeys(state);
    }

    @Then("User enters {string}")
    public void userEnters(String zipcode) {
        smartBearOrderPage.zipCode.sendKeys(zipcode);
    }

    @Then("User selects {string} as card type")
    public void userSelectsAsCardType(String arg0) {
        smartBearOrderPage.selectVisa.click();
    }

    @Then("User enters {string} to card number")
    public void userEntersToCardNumber(String cardNumber) {
        smartBearOrderPage.cardNumber.sendKeys(cardNumber);
    }

    @Then("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String expireDate) {
        smartBearOrderPage.expireDate.sendKeys(expireDate);
    }

    @Then("User clicks process button")
    public void userClicksProcessButton() {
        smartBearOrderPage.processButton.click();
    }
    @Then("go back to view all orders page")
    public void goBackToViewAllOrdersPage() {
        smartBearOrderPage.viewAllOrdersPage.click();
    }



    @Then("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String verifyCustomerName) {
        Assert.assertTrue(smartBearOrderPage.verifyCustomerName.isDisplayed());
        System.out.println("smartBearOrderPage.JohnWick.getText() = " + smartBearOrderPage.verifyCustomerName.getText());
    }






}

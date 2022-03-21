package com.cydeo.step_definitions;

import com.cydeo.page.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_stepDefinitions {
    EtsySearchPage etsySearchPage = new EtsySearchPage();


    @When("user is on etsy homepage")
    public void user_is_on_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com/");


    }

    @Then("User sees title {string} is as expected.")
    public void userSeesTitleIsAsExpected(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().equals(string));
        Assert.assertEquals(Driver.getDriver().getTitle(),string);
    }

    @And("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
        etsySearchPage.searchBox.sendKeys(" Wooden Spoon");

    }

    @Then("User clicks search button")
    public void userClicksSearchButton() {
        etsySearchPage.searchButton.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        Assert.assertEquals("Wooden Spoon",Driver.getDriver().getTitle());
    }

    @And("User types {string} in the search box")
    public void userTypesInTheSearchBox(String string) {
        etsySearchPage.searchBox.sendKeys(string);
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String string) {
        Assert.assertEquals(string,Driver.getDriver().getTitle());
    }
}

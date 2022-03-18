package com.cydeo.step_definitions;

import com.cydeo.page.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_step_definition {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://wikipedia.org");
    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        wikiSearchPage.searchBox.sendKeys(string);

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();

    }
    @Then("user sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {

        //verify actual title contains string(coming from feature file)
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }


    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String string) {
        Assert.assertTrue(wikiSearchPage.mainHeader.isDisplayed());

        Assert.assertTrue(wikiSearchPage.mainHeader.getText().equals(string));
    }

    @Then("user see  {string} in the wiki title")
    public void userSeeInTheWikiTitle(String arg0) {
    }
}

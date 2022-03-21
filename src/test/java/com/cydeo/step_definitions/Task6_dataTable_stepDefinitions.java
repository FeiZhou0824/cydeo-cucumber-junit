package com.cydeo.step_definitions;

import com.cydeo.page.Task6DropDownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task6_dataTable_stepDefinitions {
    Task6DropDownPage task6DropDownPage = new Task6DropDownPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown ");
    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonth) {
        List<String> actualMonths = BrowserUtils.dropdownOptionsAsString(task6DropDownPage.monthDropDown);

        Assert.assertEquals(expectedMonth,actualMonths);
        //Assert will check the size of the lists first, If it is matching it will check content 1 by 1.






    }


}

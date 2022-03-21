package com.cydeo.step_definitions;

import com.cydeo.page.Task6DropDownPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
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
    public void user_should_see_below_info_in_month_dropdown(List<String> month) {
        Select allMonth = new Select(task6DropDownPage.monthDropDown);
        task6DropDownPage.monthDropDown.click();

        List<String> allMonthText = new ArrayList<>();
        allMonthText = Collections.singletonList(task6DropDownPage.monthDropDown.getText());
       // System.out.println(month);




    }


}

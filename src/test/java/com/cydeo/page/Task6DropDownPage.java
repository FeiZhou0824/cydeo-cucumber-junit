package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task6DropDownPage {

    public Task6DropDownPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "month")
    public WebElement monthDropDown;


}

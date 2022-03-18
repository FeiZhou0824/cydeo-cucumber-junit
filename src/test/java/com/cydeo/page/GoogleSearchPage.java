package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    //create constructor
    // initialize the driver instance and this class ' instance using PageFactorty.initElements
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //We can start locating web elements using @Findby annotation

    //@FindBy(xpath = )
    @FindBy(name = "q")
    public WebElement searchBox;
}
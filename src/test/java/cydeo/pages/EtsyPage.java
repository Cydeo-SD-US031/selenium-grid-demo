package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {


    public EtsyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "[id*='search-query']")
    public WebElement searchBox;

    @FindBy(xpath="//button[normalize-space()='Accept']")
    public WebElement accept;

}

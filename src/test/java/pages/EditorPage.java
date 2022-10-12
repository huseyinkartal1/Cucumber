package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {

    public void EditorPage(){


        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"example_wrapper\"]/div[1]/button[1]")
    public WebElement newButton;


@FindBy (id = "DTE_Field_first_name") public WebElement firstname;
}

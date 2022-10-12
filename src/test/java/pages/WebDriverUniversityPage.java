package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriverUniversityPage {

    public WebDriverUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"login-portal\"]/div/div[1]/h1") public WebElement loginPortal;
    @FindBy(xpath = "//*[@id=\"text\"]") public  WebElement username;
    @FindBy(xpath = "//*[@id=\"login-button\"]") public  WebElement login;


   /* @FindBy(xpath = "(//div[@class='section-title'])[2]")
    public WebElement webUniversityLoginPortal;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement webUniversityUserNameButton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement webUniversityPasswordButton;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement webUniversityButton;*/

}

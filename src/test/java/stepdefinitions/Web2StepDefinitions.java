package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import pages.Web2Page;
import utilities.Driver;

public class Web2StepDefinitions {

        Web2Page web2Page=new Web2Page();


    @Then("click on the loginYeni button")
    public void clickOnTheLoginYeniButton() {
        web2Page.loginYENI.click();
    }

    @Then("accept alert")
    public void acceptAlert() {
        try {
            web2Page.loginYENI.click();
        } catch (UnhandledAlertException f) {
            try {
                Alert alert = Driver.getDriver().switchTo().alert();
                String alertText = alert.getText();
                System.out.println("Alert data: " + alertText);
                alert.accept();
            } catch (NoAlertPresentException e) {
                e.printStackTrace();
            }
        }
    }

    @Given("kullanici sayfaya gider")
    public void kullaniciSayfayaGider() {
        Driver.getDriver().get("http://webdriveruniversity.com/Login-Portal/index.html?");
    }
}

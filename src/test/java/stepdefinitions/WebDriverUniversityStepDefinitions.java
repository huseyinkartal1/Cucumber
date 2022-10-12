package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.WebDriverUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;



import java.util.Set;

public class WebDriverUniversityStepDefinitions  {

    WebDriverUniversityPage university=new WebDriverUniversityPage();
    String handle;
    String ikinci;
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();


    @Given("go to login portal")
    public void go_to_login_portal() {
      //  actions.moveToElement(university.loginPortal).perform();

        ReusableMethods.hover(university.loginPortal);
    }

    @Then("click on the login portal button")
    public void click_on_the_login_portal_button() {
       university.loginPortal.click();
    }

    @Then("switch to new window")
   public void switch_to_new_window() {

    /*    var windowHandles = Driver.getDriver().getWindowHandles();
        for (String each:windowHandles){
            handle=Driver.getDriver().getWindowHandle();
            if (each!=handle){
                ikinci=Driver.getDriver().getWindowHandle();
              Driver.getDriver().switchTo().window(each);
            }
        }*/


    ReusableMethods.switchToWindow("WebDriver | Login Portal");
    }
    @Then("write a {string} and a {string}")
    public void write_a_username_and_a_password(String string,String string2) {

        university.username.sendKeys(faker.name().username(), Keys.TAB,faker.internet().password());

    }

    @Then("click on the login button")
    public void click_on_the_login_button() {
  university.login.click();
    }

  /*  @Then("verify {string}")
    public void verify(String string) {
        var text = Driver.getDriver().switchTo().alert().getText();
        System.out.println(string);
        String expected="validation failed";
        System.out.println(text);
        Assert.assertTrue(text.contains(expected));
    }*/


    @Then("Click on pop-up ok")
    public void click_on_pop_up_ok() {
        Driver.getDriver().switchTo().alert().accept();
    /*    try {

        }catch (Exception e){

        }*/
    }

    @Then("Go back the first page")
    public void go_back_the_first_page() {
        switch_to_new_window();
    }

    @Then("Verify the first page")
    public void verify_the_first_page() {
        String title="WebDriverUniversity.com";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }


    @Then("verify {string}")
    public void verify(String arg0) {
        String

             pop= Driver.getDriver().switchTo().alert().getText();
            String text="validation failed";
            Assert.assertTrue(pop.contains(text));





    }


}

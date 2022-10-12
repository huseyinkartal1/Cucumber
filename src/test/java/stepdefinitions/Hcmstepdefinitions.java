package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HMCPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hcmstepdefinitions {

    HMCPage hcm = new HMCPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string ) {
        Driver.getDriver().get(ConfigurationReader.getProperty(string));
    }


    @Then("kullanici adi {string} girer")
    public void kullanici_adi_girer(String string ) {
        Driver.getDriver().get(ConfigurationReader.getProperty(string));
    }


    @Then("kullanici sifresi {string} girer")
    public void kullaniciSifresiGirer(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty(string));

    }


}

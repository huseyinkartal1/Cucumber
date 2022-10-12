package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage=new AmazonPage();


    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("AmazonURL"));
    }
    @Given("iphone icin arama yapar")
    public void iphone_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }
    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarin_iphone_icerdigini_test_eder() {
        var sonucIcerigi = amazonPage.sonucIcerigi.getText();
        Assert.assertTrue(sonucIcerigi.contains("iphone"),"iphone bulunamadı");
    }
    @Given("teapot icin arama yapar")
    public void teapot_icin_arama_yapar() {
            amazonPage.aramaKutusu.sendKeys("teapot", Keys.ENTER);
    }
    @Then("sonuclarin teapot icerdigini test eder")
    public void sonuclarin_teapot_icerdigini_test_eder() {
            var sonucIcerigi = amazonPage.sonucIcerigi.getText();
        Assert.assertTrue(sonucIcerigi.contains("teapot"),"teapot bulunamadı");
    }
    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("flower", Keys.ENTER);
    }
    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarin_flower_icerdigini_test_eder() {
        var sonucIcerigi = amazonPage.sonucIcerigi.getText();
        Assert.assertTrue(sonucIcerigi.contains("flower"),"flower bulunamadı");
    }

    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String arananKelime) {
        String sonuc=amazonPage.sonucIcerigi.getText();
        Assert.assertTrue(sonuc.contains(arananKelime));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
    @Given("{string} icin arama yapar")
    public void icin_arama_yapar(String arananKelime) {
            amazonPage.aramaKutusu.sendKeys(arananKelime, Keys.ENTER);
    }


}

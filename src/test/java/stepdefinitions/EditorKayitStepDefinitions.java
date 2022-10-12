package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.EditorPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import com.github.javafaker.Faker;




public class EditorKayitStepDefinitions {

    Faker faker = new Faker();
    EditorPage editor=new EditorPage();


@Given ("new butonuna basar")
    public void new_butonuna_basar(){
        editor.newButton.click();
    }


    @And("bilgileri doldururur")
    public void bilgileriDoldururur() {


    editor.firstname.sendKeys(faker.name().firstName(), Keys.TAB,faker.name().lastName(),
            Keys.TAB,faker.job().position(),Keys.TAB,faker.business().toString(),Keys.TAB,
            faker.team().toString(),Keys.TAB,faker.date().toString(),Keys.TAB,faker.random().nextInt(1000,5000).toString());
    }


}

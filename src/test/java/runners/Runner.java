package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin={"html:target\\Runner-reports.html"},
        glue = "stepdefinitions",
        tags = "@runner",
        dryRun = false
)


public class Runner {

}

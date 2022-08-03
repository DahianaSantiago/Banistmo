package co.com.banitsmo.automationtest.runner;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "co.com.banitsmo.automationtest.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class PdfValidation {
}

package choucair.automatizacion.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/softwareTester.feature",
        tags = "@tag1",
        glue = "choucair.automatizacion.reto.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}




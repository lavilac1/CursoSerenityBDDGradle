package co.com.CRUD.runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/consumoConToken.feature",
    glue = {"co.com.CRUD.stepsDefinition","co.com.CRUD.setup" },
      tags = "@Caso1",
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    plugin = {
        "pretty",
        "summary",
        "json:target/cucumber-report.json"
    },
    monochrome = true
)
public class ConsumirEnpointAutorizacion {
    
}

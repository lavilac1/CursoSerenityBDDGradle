package co.com.CRUD.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/usuario.feature",
    glue = "co.com.CRUD.stepsDefinition",
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    plugin = {
        "pretty",
        "summary",
        "json:target/cucumber-report.json"
    },
    monochrome = true
)
public class UsuarioRunner {
    
}

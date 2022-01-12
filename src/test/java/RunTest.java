import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/home/poojan/IdeaProjects/Amazon/src/test/resources/features", plugin = {"json:target/cucumber.json", "pretty",
        "de.monochromata.cucumber.report.PrettyReports:target/cucumber"}, publish = true)
public class RunTest {
}
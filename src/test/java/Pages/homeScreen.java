package Pages;

import Amazon_org.BrowserSelector;
import Amazon_org.Page.Welcome;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.junit.AfterClass;
import org.junit.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class homeScreen extends BrowserSelector {

    static Welcome obj = new Welcome();

    @Before
    public static void setUpClass() {
        BrowserSelector.setUp();

    }

    @When("User try to sign up from web link")
    public static void redirectedToAmazon() {
        obj.redirection();
    }

    @When("User click on sign up link")
    public static void redirectedToSignUp() {
        obj.signUp();
    }

    @Then("User should redirected to signup link")
    public static void verifySignupPage() throws InterruptedException {
        String url = "https://www.amazon.in/ap/signin";
        String currentUrl = driver.getCurrentUrl();
        sleep(3);
        Assert.assertTrue("Not redirected to amazon sign in", currentUrl.contains(url));
    }

    @After
    public static void tearDownClass() {
        BrowserSelector.tearDown();
    }

    @AfterClass
    public static void report() {
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/site/cucumber.json");
        File reportOutputDirectory = new File("target/site");
//        String buildNumber = "101";
        String projectName = "Amazon";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
//        configuration.setBuildNumber(buildNumber);
//        configuration.addClassifications("Environment","QA");
//        configuration.addClassifications("Browser", LoadProps.getProperty("browser"));
//        configuration.addClassifications("Platform",System.getProperty("os.name").toUpperCase());
//        configuration.setSortingMethod(SortingMethod.NATURAL);
//        configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
//        configuration.setTrendsStatsFile(new File("target/test-classes/demo-trends.json"));
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();


    }

}

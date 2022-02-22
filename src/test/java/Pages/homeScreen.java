package Pages;

import Amazon_org.BrowserSelector;
import Amazon_org.Page.Welcome;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class homeScreen extends BrowserSelector {

    static Welcome welcomeObj = new Welcome();


    @When("User try to sign up from web link")
    public static void redirectedToAmazon() {
        welcomeObj.redirection();
    }

    @When("User click on sign up link")
    public static void redirectedToSignUp() {
        welcomeObj.signUp();
    }

    @Then("User should redirected to signup link")
    public static void verifySignupPage() throws InterruptedException {
        String url = "https://www.amazon.in/ap/signin";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue("Not redirected to amazon sign in", currentUrl.contains(url));
    }





}

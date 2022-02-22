package Pages;

import Amazon_org.BrowserSelector;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void before() {
        BrowserSelector.setUp();
    }

    @After
    public void after() {
        BrowserSelector.tearDown();
    }

}

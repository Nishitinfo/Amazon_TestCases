package Amazon_org;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelector extends baseClass {
    public static LoadProps loadProp = new LoadProps();
    public static final String browsers = loadProp.getProperty("browser");

    public static void setUp() {
        System.out.println(browsers);
        if (browsers.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.silentOutput", "true");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();


        } else {
            System.out.println("No Browser found.");
        }

    }

    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}

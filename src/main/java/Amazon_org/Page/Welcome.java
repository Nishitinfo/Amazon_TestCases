package Amazon_org.Page;

import Amazon_org.baseClass;
import org.openqa.selenium.By;

public class Welcome extends baseClass {
    public By user = By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span");

    public void redirection() {
        driver.get("https://www.amazon.in/");
    }

    public void signUp() {
        driver.findElement(user).click();
    }

}

package bg.credissimo.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by emilgeorgiev on 7/11/17.
 */
public class BasePage {

    public WebDriver driver;
    public String PAGE_URL;
    public String PAGE_TITLE;

    public BasePage (WebDriver driver) {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        this.driver = driver;
    }

    public void loadPage () {
        driver.get(PAGE_URL);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void setElementText(WebElement element, String text) {
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(text);
//        Assert.assertEquals(element.getAttribute("value"), text);
    }

    public String getPAGE_TITLE() {
        return PAGE_TITLE;
    }

}
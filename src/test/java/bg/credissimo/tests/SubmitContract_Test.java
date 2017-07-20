package bg.credissimo.tests;

import bg.credissimo.pages.HomePage;
import bg.credissimo.utills.RandomParameters;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static bg.credissimo.pages.HomePage.*;

/**
 * Created by emilgeorgiev on 7/19/17.
 */
public class SubmitContract_Test {

    public WebDriver driver;
    HomePage homePage;
    RandomParameters random;

    @BeforeClass(alwaysRun = true)
    public void setUp () {
        this.driver = new FirefoxDriver();
        homePage = PageFactory.initElements(driver, HomePage.class);
        random = PageFactory.initElements(driver, RandomParameters.class);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown () {
        this.driver.quit();
    }

    @Test(groups = {"p1", "pageLoads"})
    public void loadPage () {
        driver.manage().deleteAllCookies();
        homePage.loadPage();
    }

    @Test(groups = "p1", dependsOnMethods = "loadPage")
    public void submitApplication () {
        homePage.setPlusAmountAndPeriod(random.randomAmount("Plus"), random.randomPeriod("Plus"));
        homePage.fillSmallFormPlus();
        homePage.submitSmallForm_Plus();

        try {
            Thread.sleep(9000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

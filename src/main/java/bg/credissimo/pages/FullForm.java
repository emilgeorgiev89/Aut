package bg.credissimo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FullForm {

    @FindBy(id = "social_id") private WebElement egn;
    @FindBy(id = "name") private WebElement name;
    @FindBy(id = "prezime") private WebElement surname;
    @FindBy(id = "family") private WebElement family;

}

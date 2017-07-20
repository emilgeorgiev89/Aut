package bg.credissimo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by emilgeorgiev on 7/13/17.
 */
public class HomePage extends BasePage{

    public HomePage (WebDriver driver) {
        super(driver);
        this.PAGE_TITLE = "Credissimo - пари навреме! Онлайн кредити до 2 500 лева";
        this.PAGE_URL = "https://gl3.credissimo.bg";
    }

    //Product tabs
    @FindBy(id = "_url4") public WebElement plusTab;
    @FindBy(css = "li.kdz > #_url4") public WebElement salaryTab;

    //Plus fields
    @FindBy(id = "email_plus") public WebElement emailPlus;
    @FindBy(id = "phone_plus") public WebElement phonePlus;

    //Salary fields
    @FindBy(id = "email_salary") public WebElement emailSalary;
    @FindBy(id = "phone_salary") public WebElement phoneSalary;

    //Plus period and amount
    @FindBy(id = "plusAmount") public WebElement plusAmount;
    @FindBy(id = "plusPeriod") public WebElement plusPeriod;

    //Salary period and amount
    @FindBy(id = "salaryAmount") public WebElement salaryAmount;
    @FindBy(id = "salaryPeriod") public WebElement salaryPeriod;

    //SubmitButtons
    @FindBy(xpath = "(//button[@type='submit'])[4]") public WebElement salarySubmitButton;
    @FindBy(xpath = "(//button[@type='submit'])[2]") public WebElement plusSubmitButton;

    public void chooseProduct (WebElement element) {
        clickElement(element);
    }

    /*Fill the small form*/
    public void fillSmallFormPlus() {
        clickElement(plusTab);
        setElementText(emailPlus,"e.georgiev@credissimo.bg");
        setElementText(phonePlus,"0883484790");
    }
    public void fillSmallFormSalary () {
        clickElement(salaryTab);
        setElementText(emailSalary,"e.georgiev@credissimo.bg");
        setElementText(phoneSalary,"0883484790");
    }

    public void setPlusAmountAndPeriod(int amount, int period) {
        clickElement(plusTab);
        setElementText(plusAmount, String.valueOf(amount));
        setElementText(plusPeriod, String.valueOf(period));
    }

    public void setSalaryAmountAndPeriod(String amount, String period) {
        clickElement(salaryTab);
        setElementText(salaryAmount, amount);
        setElementText(salaryPeriod, period);
    }

    public void submitSmallForm_Plus () {
        clickElement(plusSubmitButton);
    }

    public void submitSmallForm_Salary () {
        clickElement(salarySubmitButton);
    }

}

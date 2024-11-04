package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormaPage {
    @FindBy (id = "firstName")
    private WebElement firstNameEl;
    @FindBy (id = "lastName")
    private WebElement lastNameEl;
    @FindBy (id = "userEmail")
    private WebElement userEmailEl;
    @FindBy (id = "userNumber")
    private WebElement userNumberEl;
    @FindBy (id = "currentAddress")
    private WebElement currentAddressEl;

    public static WebDriver driver;

    public FormaPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstNameEl(String a)
    {
        firstNameEl.sendKeys(a);
    }

    public void setLastNameEl(String a)
    {
        lastNameEl.sendKeys(a);
    }
    public void setUserEmailEl(String a)
    {
        userEmailEl.sendKeys(a);
    }
    public void setUserNumberEl(String a)
    {
        userNumberEl.sendKeys(a);
    }
    public void setCurrentAddressEl(String a)
    {
        currentAddressEl.sendKeys(a);
    }
}

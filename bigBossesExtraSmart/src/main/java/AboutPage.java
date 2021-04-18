import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {
    public AboutPage() {
        PageFactory.initElements(SingletonDriver.getDriver(), this);
    }

    @FindBy(css = "#prev-btn")
    private WebElement leftSlider;

    @FindBy(css = "#prev-btn")
    private WebElement leftSlider2;

    @FindBy(css = "#next-btn")
    private WebElement rightSlider;

    @FindBy(css = "#header > div > div > nav > div > ul > li:nth-child(3) > a")
    private WebElement aboutPageButton;

    @FindBy(css = "#header > div > div > div > a")
    private WebElement headerLogoButton;

    @FindBy(css = "body > section > div > div > div:nth-child(1)")
    private WebElement UserCard;


    public void waitElementToClickable(WebElement element) {
        new WebDriverWait(SingletonDriver.getDriver(), 60).until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void enterAboutPage () {
        waitElementToClickable(aboutPageButton);
        //    SingletonDriver.getDriver().get("http://localhost:8080/questions.html");}
    }

    public void checkSlider () {
        waitElementToClickable(leftSlider);
        waitElementToClickable(leftSlider2);
        waitElementToClickable(rightSlider);

}
public void navigateToHomePage () {
    headerLogoButton.click();
    Assert.assertTrue(UserCard.isDisplayed());
}
}



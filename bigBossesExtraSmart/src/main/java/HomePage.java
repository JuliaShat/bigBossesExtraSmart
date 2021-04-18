import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter

public class HomePage {
    public HomePage() {
        PageFactory.initElements(SingletonDriver.getDriver(), this);
    }

    WebDriverWait wait;

    @FindBy(css = "body > section > div > div > div:nth-child(1) > div.userCard__edit > img")
    private WebElement buttonEdit;

    @FindBy(css = "body > section > div > div > div:nth-child(1) > div.form-user.form-user-active.blockOpacity > form > input.form-user__ageform")
    private WebElement FieldAge;

    @FindBy(css = "body > section > div > div > div:nth-child(1) > div.form-user.form-user-active.blockOpacity > form > input.form-user__likecolor")
    private WebElement FieldColor;

    @FindBy(css = "body > section > div > div > div:nth-child(1) > div.form-user.form-user-active.blockOpacity > form > input.form-user__it")
    private WebElement FieldExp;

    @FindBy(css = "body > section > div > div > div:nth-child(1) > div.form-user.form-user-active.blockOpacity > form > input.form-user__hobbie")
    private WebElement FieldHobby;

    @FindBy(css = "body > section > div > div > div:nth-child(1) > div.form-user.form-user-active.blockOpacity > form > button")
    private WebElement buttonChange;

    @FindBy(css = "#header > div > div > nav > div > ul > li:nth-child(2) > a")
    private WebElement buttonHoverQuestions;

    @FindBy(css = "#header > div > div > div > a > img")
    private WebElement headerLogo;

    @FindBy(css = "#header > div > div > div > p.header__teamName")
    private WebElement teamName;

    @FindBy(css = "#header > div > div > div > p.header__teamSlogan")
    private WebElement teamSlogan;



    public void waitElementToClickable(WebElement element) {
        new WebDriverWait(SingletonDriver.getDriver(), 60).until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void waitForVisibility(WebElement element) {
        new WebDriverWait(SingletonDriver.getDriver(), 60).until(ExpectedConditions.visibilityOf(element));}


    public void checkPresenceOfElements () {
    Assert.assertTrue(headerLogo.isDisplayed());
        Assert.assertTrue(teamName.isDisplayed());
        Assert.assertTrue(teamSlogan.isDisplayed());
    }

    public void editUserCard (){
        waitElementToClickable(buttonEdit);
        waitForVisibility (FieldAge);
        FieldAge.sendKeys("18");
        waitForVisibility (FieldColor);
        FieldColor.sendKeys("Сиреневый");
        waitForVisibility (FieldExp);
        FieldExp.sendKeys("Базовый");
        waitForVisibility (FieldHobby);
        FieldHobby.sendKeys("Виноделие");
        waitElementToClickable(buttonChange);
    }






}

import com.sun.org.apache.xalan.internal.xsltc.dom.SingletonIterator;
import lombok.Getter;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

@Getter


    public class QuestionPage {
        public QuestionPage() {
            PageFactory.initElements(SingletonDriver.getDriver(), this);
        }

        WebDriverWait wait;

        @FindBy(css="#header > div > div > nav > div > ul > li:nth-child(2) > a")
        private WebElement NavigateToQuestionButton;
        @FindBy(css="#header > div > div > div.headerFooter > div.headerFilter > select.header__filter-type")
        private WebElement typeFileFilter;
        @FindBy(css="#header > div > div > div.headerFooter > div.headerFilter > select.header__filter-theme")
        private WebElement topicFilter;
        @FindBy(css="#header > div > div > div.headerFooter > div.headerQuestionCreateButton > button")
        private WebElement CreateQuestionButton;
        @FindBy(css="body > section > div > div > div > div.questions__edit > img")
        private WebElement DeleteQuestionButton;
        @FindBy(css="#modalDeleteConfirmation > div > div.modalDeleteConfirmation__header > p")
        private WebElement modalDeleteConfirmationText;
        @FindBy(css="#modalDeleteConfirmation > div > div.modalDeleteConfirmation__buttons > input.confirmButton.modalDeleteConfirmation__button")
        private WebElement confirmDeleteButton;
        @FindBy(css="#modalDeleteConfirmation > div > div.modalDeleteConfirmation__buttons > input.cancelButton.modalDeleteConfirmation__button")
        private WebElement cancelDeleteButton;
        @FindBy(id="myModal")
        private WebElement modalCreateQuestion;
        @FindBy(css="#myModal > div > div.modal-header > span")
        private WebElement closeModalCreateQuestionButton;
        @FindBy(css="#myModal > div > div.modal-header > h2")
        private WebElement modalCreateQuestionHeader;
        @FindBy(css="#myModal > div > div.modal-body > form > div.questionText > input")
        private WebElement questionTextField;
        @FindBy(css="#myModal > div > div.modal-body > form > div.questionTheme > select")
        private WebElement modalQuestionThemeMenu;
        @FindBy(css="#myModal > div > div.modal-body > form > div.questionAnswer > input.TRUERadio")
        private WebElement questionAnswerTrueRadioButton;
        @FindBy(css="#myModal > div > div.modal-body > form > div.questionAnswer > input.FALSERadio")
        private WebElement questionAnswerFalseRadioButton;
        @FindBy(css="#myModal > div > div.modal-body > form > div.questionType > input.question__type-YAML")
        private WebElement YAMLTypeCheckBox;
        @FindBy(css="#myModal > div > div.modal-body > form > div.questionType > input.question__type-XML")
        private WebElement XMLTypeCheckBox;
        @FindBy(css="#myModal > div > div.modal-body > form > div.questionType > input.question__type-CSV")
        private WebElement CSVTypeCheckBox;
        @FindBy(css="#myModal > div > div.modal-body > form > div.questionButtons > button.questionCreate")
        private WebElement questionCreateButton;
        @FindBy(css="#myModal > div > div.modal-body > form > div.questionButtons > button.questionCancel")
        private WebElement questionCancelCreatingButton;
        @FindBy(css="#header > div > div > div.headerFooter > div.headerFilter > select.header__filter-type > option:nth-child(4)")
        private WebElement CSVOptionFilter;
        @FindBy(css="#header > div > div > div.headerFooter > div.headerFilter > select.header__filter-theme > option:nth-child(2)")
        private WebElement HTMLOptionTopic;
        @FindBy(css="#myModal > div > div.modal-body > form > div.questionTheme > select > option:nth-child(5)")
        private WebElement EruditionOptionTopic;
        @FindBy(css="#header > div > div > div.headerFooter > div.headerFilter > select.header__filter-type > option:nth-child(3)")
        private WebElement XMLOptionFilter;
        @FindBy(css="#header > div > div > div.headerFooter > div.headerFilter > select.header__filter-theme > option:nth-child(6)")
        private WebElement EruditionTopicFilter;




        public void waitForVisibility(WebElement element) {
            new WebDriverWait(SingletonDriver.getDriver(), 60).until(ExpectedConditions.visibilityOf(element));
        }

        public void waitToBeClickable(WebElement element) {
            new WebDriverWait(SingletonDriver.getDriver(), 30).until(ExpectedConditions.elementToBeClickable(element));
        }


         public void enterQuestionPage () {
      //  waitToBeClickable(NavigateToQuestionButton);
      //  getNavigateToQuestionButton().click();
             SingletonDriver.getDriver().get("http://localhost:8080/questions.html");
    }

        public void createQuestion () {
          // new WebDriverWait (SingletonDriver.getDriver(), 60).until(ExpectedConditions.elementToBeClickable(CreateQuestionButton)).click();
        //    SingletonDriver.getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            waitToBeClickable(CreateQuestionButton);
            getCreateQuestionButton().click();
           waitForVisibility(modalCreateQuestionHeader);
            getQuestionTextField().sendKeys("question1");
           getModalQuestionThemeMenu().click();
            getQuestionAnswerTrueRadioButton().click();
            getCSVTypeCheckBox().click();
            getQuestionCreateButton().click();
        }

        public void createQuestion2 () {
            // new WebDriverWait (SingletonDriver.getDriver(), 60).until(ExpectedConditions.elementToBeClickable(CreateQuestionButton)).click();
            waitToBeClickable(CreateQuestionButton);
            getCreateQuestionButton().click();
            waitForVisibility(modalCreateQuestionHeader);
            getQuestionTextField().sendKeys("question2");
            getModalQuestionThemeMenu().click();
            getEruditionOptionTopic().click();
            getQuestionAnswerFalseRadioButton().click();
            getXMLTypeCheckBox().click();
            getQuestionCreateButton().click();
        }

        public void fileSystemSelection () {
            waitToBeClickable(typeFileFilter);
            getTypeFileFilter().click();
            getCSVOptionFilter().click();

        }

        public void topicSelection () {
            waitToBeClickable(topicFilter);
            getTopicFilter().click();
            getHTMLOptionTopic().click();
            getTopicFilter().click();
        }

        public void fileSystemSelection2 () {
            waitToBeClickable(typeFileFilter);
            getTypeFileFilter().click();
            getXMLOptionFilter().click();

        }

        public void topicSelection2 () {
            waitToBeClickable(topicFilter);
            getTopicFilter().click();
            getEruditionTopicFilter().click();
            getTopicFilter().click();
        }

        public void deleteQuestion () {
            waitForVisibility (DeleteQuestionButton);
            DeleteQuestionButton.click();
            waitForVisibility (modalDeleteConfirmationText);
            getConfirmDeleteButton().click();
        }

    }



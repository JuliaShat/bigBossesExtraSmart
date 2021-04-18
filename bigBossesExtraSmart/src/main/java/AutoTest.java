import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class AutoTest {


    @Test
    public void test_homePage() {
        HomePage hp = new HomePage();
        hp.checkPresenceOfElements ();
        hp.editUserCard ();
    }


    @Test
    public void test_questionPage() {
        QuestionPage qp = new QuestionPage();
        qp.enterQuestionPage();
        qp.createQuestion();
        qp.createQuestion2 ();
        qp.fileSystemSelection ();
        qp.topicSelection();
        qp.fileSystemSelection2 ();
        qp.topicSelection2 ();
        qp.deleteQuestion ();

    }
    @Test
    public void test_aboutPage() {
        AboutPage ap = new AboutPage();
        ap.enterAboutPage ();
        ap.checkSlider();
        ap.navigateToHomePage ();
    }

    @After
    public void finish() {
        SingletonDriver.quit();
    }
}

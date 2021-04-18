import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {
    public static WebDriver wd = null;
    public static String browser = "chrome";

    public static WebDriver getDriver() {
        if (wd == null) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/main/Driver/chromedriver.exe");
                wd = new ChromeDriver();
            }
            wd.manage().window().maximize();
            wd.get("http://localhost:8080/index.html");
        } return wd;
    }


    public static void quit() {
        wd.quit();
        wd = null;
    }
}

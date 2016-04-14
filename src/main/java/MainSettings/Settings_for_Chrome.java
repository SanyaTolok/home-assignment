package MainSettings;
import Pages.HomePage;
import TrackReporting.CaptureScreenShotOnFailureListener;
import TrackReporting.LoggingEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(CaptureScreenShotOnFailureListener.class)
public class Settings_for_Chrome {
    protected static WebDriver driver;
    protected String baseURL = "http://ddi-dev.com";
    private static final WebDriverEventListener eventListener = new LoggingEventListener();
    protected HomePage mainPage;

    @BeforeMethod
    public void setUp()
    {
        driver = new EventFiringWebDriver(new ChromeDriver()).register(eventListener);
        getDriver().get(baseURL);
        mainPage = new HomePage();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    public static void waitInSeconds (int seconds)
    {
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

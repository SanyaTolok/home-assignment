package MainSettings;

import Pages.HomePage;
import TrackReporting.CaptureScreenShotOnFailureListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(CaptureScreenShotOnFailureListener.class)
public class Settings {
    protected static WebDriver driver;
    protected String baseURL = "http://ddi-dev.com";
   // private static final WebDriverEventListener eventListener = new LoggingEventListener();
    public StringBuffer verificationErrors = new StringBuffer();
    protected HomePage mainPage;

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();
        getDriver().get(baseURL);
        mainPage = new HomePage();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            Assert.fail(verificationErrorString);
        }
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

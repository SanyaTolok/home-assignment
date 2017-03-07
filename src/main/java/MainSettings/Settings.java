package MainSettings;

import Pages.HomePage;
import TrackReporting.LoggingEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Settings {
    protected static WebDriver driver;
    private String baseURL = "http://ddi-dev.com";
    private StringBuffer verificationErrors = new StringBuffer();
    private HomePage mainPage;
    private static final WebDriverEventListener eventListener = new LoggingEventListener();
    @BeforeMethod
    public void setUp()
    {
        driver = new EventFiringWebDriver(new ChromeDriver()).register(eventListener);
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
    public static void waitUntillElementClickable(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}

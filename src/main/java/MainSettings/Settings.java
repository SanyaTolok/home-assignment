package MainSettings;

import TrackReporting.LoggingEventListener;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class Settings {
    protected static WebDriver driver;
    private String baseURL = "http://ddi-dev.com";
    public static ChromeDriverService service;
    //private HomePage mainPage;
    private static final WebDriverEventListener eventListener = new LoggingEventListener();
@BeforeMethod
public static void createAndStartService() {
    service = new ChromeDriverService.Builder().usingDriverExecutable(new File("/usr/local/share/chromedriver")).usingAnyFreePort()
            .withSilent(true)
            .withVerbose(false)
            .withEnvironment(ImmutableMap.of("DISPLAY",":10"))
            .build();
    try {
        service.start();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    @BeforeMethod
    public void setUp() throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new EventFiringWebDriver(new RemoteWebDriver(service.getUrl(), capabilities)).register(eventListener);
        driver.manage().window().maximize();
        //driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
        driver.get(baseURL);
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
        service.stop();
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

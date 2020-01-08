package MainSettings;
import TrackReporting.LoggingEventListener;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

public class Settings {
    private static final WebDriverEventListener eventListener = new LoggingEventListener();
    protected static String baseURL = System.getProperty("webdriver.base.url");
    //protected static String baseURL = System.getProperty("http://google.com/");
    protected static WebDriver driver;
    protected static ChromeDriverService service;

    @BeforeMethod
    public static void createAndStartService() {
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome-stable");
        service = new ChromeDriverService.Builder().usingAnyFreePort()
        //service = new ChromeDriverService.Builder().usingDriverExecutable(new File("/usr/bin/google-chrome-stable")).usingAnyFreePort()
                .withSilent(true)
                .withVerbose(false).withEnvironment(ImmutableMap.of("DISPLAY", ":99"))
                .build();
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void waitInSeconds(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--fast");
        options.addArguments("window-size=1936,1056");
        options.addArguments("--user-agent=Chrome Web app testing");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        options.addArguments("--headless");
        driver = new EventFiringWebDriver(new RemoteWebDriver(service.getUrl(), options)).register(eventListener);
        driver.manage().deleteAllCookies();
        driver.get(baseURL);
        String uAgent = (String)((JavascriptExecutor) driver).executeScript("return navigator.userAgent;");
        System.out.println(uAgent);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        service.stop();
    }
}
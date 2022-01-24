package MainSettings;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Settings {
    protected static WebDriver driver;

    @BeforeMethod

    public static WebDriver getDriver() {
        return driver;
    }

    public static void waitInSeconds(int seconds) {
        try {
            Thread.sleep(1000L * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void setUp() {
        String DRIVERS_PATH = "Drivers";
        WebDriverManager.firefoxdriver().cachePath(DRIVERS_PATH).setup();
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.manage().deleteAllCookies();
        driver.get("https://google.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
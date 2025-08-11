package MainSettings;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
        WebDriverManager.chromedriver().cachePath(DRIVERS_PATH).setup();
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless"); // Run in headless mode
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.get("https://google.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
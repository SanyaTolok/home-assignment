package MainSettings;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Settings {
    protected static WebDriver driver;
    public static Logger log = LogManager.getLogger("Assertion objects on pages");
    protected static String baseUrl = "https://scale.neptune.ai/o/examples/org/LLM-Pretraining/runs/details?viewId=standard-view&detailsTab=attributes&runIdentificationKey=llm_train-v945&type=experiment&compare=uMlyIDUTmecveIHVma0eEB95Ei5xu8F_9qHOh0nynbtM";

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

     @Parameters({"browser", "testName"})
    public void launchBrowser(@Optional("browser") String browserType, @Optional("TestCaseNameNotSet") String testName) throws MalformedURLException {
        DesiredCapabilities caps;
        switch (browserType) {
            case "Chrome":
                log.info("Launching Browser");
                String DRIVERS_PATH = "Drivers";
                WebDriverManager.chromedriver().cachePath(DRIVERS_PATH).setup();
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
            // options.addArguments("--headless"); // Run in headless mode
                options.addArguments("--window-size=1920,1080");
                driver = new ChromeDriver(options);
                driver.navigate().to(baseUrl);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                break;}}


    public void tearDown() {
        driver.quit();
    }
}
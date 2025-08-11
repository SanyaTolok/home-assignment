import MainSettings.Settings;
import Pages.*;

import java.net.MalformedURLException;
import java.util.concurrent.TimeoutException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCasesAttributestPage extends Settings {

    @BeforeClass
    @Parameters({"browser", "testName"})
    public void FileReadBrowserLaunch(@Optional("Chrome") String browser, @Optional("Account test cases") String testName) throws MalformedURLException {
        System.out.println("Testing Account");
        launchBrowser(browser, testName);
    }

    @Test(priority = 1, groups = "smoke")
    public void attibute_page_tests() throws TimeoutException {
        Attributes.closeDialog();
    }

    @Test(priority = 2, groups = "smoke")
    public void search_attribute_tests() throws TimeoutException {
    }

    @Test(priority = 3, groups = "smoke")
    public void attibute_types_tests() throws TimeoutException {
    }

    @AfterClass
    public void TerminateTestCase() {
        driver.quit();
    }

    

}

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
    public void attibute_page_tests() {
        Asserts.AssertsAttributes.assertCoockiesDialogShown();
        Attributes.acceptCookies();
        Attributes.closeDialog();
        Asserts.AssertsAttributes.assertAttributesPageTabs();
    }

    @Test(priority = 2, groups = "smoke")
    public void search_attribute_date_time_value_test() {
        Attributes.searchForAttribute("sys/creation_time");
        Asserts.AssertsAttributes.assertAttributeFound("sys/creation_time");
        Attributes.selectSearchResult();
        Asserts.AssertsAttributes.assertAttributeValue("2025/07/18 13:55:09");
    }

    @Test(priority = 3, groups = "smoke")
    public void search_attribute_single_int_value(){
        driver.navigate().to(baseUrl);
        Attributes.searchForAttribute("config/data/batch_size");
        Asserts.AssertsAttributes.assertAttributeFound("config/data/batch_size");
        Attributes.selectSearchResult();
        Asserts.AssertsAttributes.assertAttributeValue("1024");
        
    }

    @AfterClass
    public void TerminateTestCase() {
        driver.quit();
    }

    

}

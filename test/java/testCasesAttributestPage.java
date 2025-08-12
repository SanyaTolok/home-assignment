import MainSettings.Settings;
import Pages.*;
import java.net.MalformedURLException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCasesAttributestPage extends Settings {

    @BeforeClass
    @Parameters({"browser", "testName"})
    public void FileReadBrowserLaunch(@Optional("Chrome") String browser, @Optional("Attributes test cases") String testName) throws MalformedURLException {
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
    public void search_attribute_time_value_test() {
        Attributes.searchForAttribute("sys/running_time_seconds");
        Asserts.AssertsAttributes.assertAttributeFound("sys/running_time_seconds");
        Attributes.selectSearchResult();
        Asserts.AssertsAttributes.assertAttributeValue("0d 00h 03m 12s");
    }

    @Test(priority = 4, groups = "smoke")
    public void search_attribute_single_int_value(){
        driver.navigate().to(baseUrl);
        Attributes.searchForAttribute("config/data/batch_size");
        Asserts.AssertsAttributes.assertAttributeFound("config/data/batch_size");
        Attributes.selectSearchResult();
        Asserts.AssertsAttributes.assertAttributeValue("1024");
        
    }

    @Test(priority = 5, groups = "smoke")
    public void search_attribute_single_float_value(){
        driver.navigate().to(baseUrl);
        Attributes.searchForAttribute("config/model/dropout");
        Asserts.AssertsAttributes.assertAttributeFound("config/model/dropout");
        Attributes.selectSearchResult();
        Asserts.AssertsAttributes.assertAttributeValue("0.13");
    }

     @Test(priority = 6, groups = "smoke")
    public void search_attribute_single_string_value(){
        driver.navigate().to(baseUrl);
        Attributes.searchForAttribute("sys/custom_run_id");
        Asserts.AssertsAttributes.assertAttributeFound("sys/custom_run_id");
        Attributes.selectSearchResult();
        Asserts.AssertsAttributes.assertAttributeValue("llm_train-v945-run_0_1_1_1");
        
    }

    @Test(priority = 7, groups = "smoke")
    public void search_attribute_single_boolean_value(){
        driver.navigate().to(baseUrl);
        Attributes.searchForAttribute("sys/experiment/is_head");
        Asserts.AssertsAttributes.assertAttributeFound("sys/experiment/is_head");
        Attributes.selectSearchResult();
        Asserts.AssertsAttributes.assertAttributeValue("True");
        driver.navigate().to(baseUrl);
        Attributes.searchForAttribute("sys/failed");
        Asserts.AssertsAttributes.assertAttributeFound("sys/failed");
        Attributes.selectSearchResult();
        Asserts.AssertsAttributes.assertAttributeValue("False");
    }

    @Test(priority = 8, groups = "smoke")
    public void search_attribute_which_not_exist(){
        driver.navigate().to(baseUrl);
        Attributes.searchForAttribute("sys/experiment/is_head/");
        Asserts.AssertsAttributes.assertAttributeNotFound();
    }

    @Test(priority = 9, groups = "smoke")
    public void search_attribute_chart_diagramm_float(){
        driver.navigate().to(baseUrl);
        Attributes.searchForAttribute("debug/activation/layer_0");
        Asserts.AssertsAttributes.assertAttributeFound("debug/activation/layer_0");
        Attributes.selectSearchResult();
        Asserts.AssertsAttributes.assertChartDiagram();
    }

     @Test(priority = 9, groups = "smoke")
    public void search_attribute_tags(){
        driver.navigate().to(baseUrl);
        Attributes.searchForAttribute("sys/tags");
        Asserts.AssertsAttributes.assertAttributeFound("sys/tags");
        Attributes.selectSearchResult();
        Asserts.AssertsAttributes.assertAttributeTag("AdamW");
        Asserts.AssertsAttributes.assertAttributeTag("BPE");
        Asserts.AssertsAttributes.assertAttributeTag("Lion");
        Asserts.AssertsAttributes.assertAttributeTag("SentencePiece");
        Asserts.AssertsAttributes.assertAttributeTag("gelu");
        Asserts.AssertsAttributes.assertAttributeTag("gelu_new");
        Asserts.AssertsAttributes.assertAttributeTag("relu");
        Asserts.AssertsAttributes.assertAttributeTag("silu");
    }
    

    @AfterClass
    public void TerminateTestCase() {
        driver.quit();
    }
}

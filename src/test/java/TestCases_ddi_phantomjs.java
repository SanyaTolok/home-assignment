import MainSettings.Settings_PhantomJS;
import Pages.Services;
import org.testng.annotations.Test;

public class TestCases_ddi_phantomjs extends Settings_PhantomJS {
    @Test(priority = 0)
    public void test_services_form()
    {
        Services.get_request_from_services_page();
    }
}

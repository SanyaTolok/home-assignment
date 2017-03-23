import MainSettings.Settings;
import Pages.Management;
import org.testng.annotations.Test;

public class TestCase1 extends Settings {
    @Test(priority = 1, groups = "smoke")
    public void verify_links_management_CEO()
    {
        Management.verify_links_CEO();
    }
}

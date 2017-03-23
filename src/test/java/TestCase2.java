import MainSettings.Settings;
import Pages.Management;
import org.testng.annotations.Test;

public class TestCase2 extends Settings {
    @Test(priority = 1, groups = "smoke")
    public void verify_links_head_marketing()
    {
                Management.verify_links_head_marketing_department();

    }
}

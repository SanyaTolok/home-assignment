import MainSettings.Settings;
import Pages.*;
import org.testng.annotations.Test;

public class testCasesUI extends Settings {

    @Test(priority = 1, groups = "smoke")
    public void test_1() {
        Blog.get("https://google.com");
    }

}

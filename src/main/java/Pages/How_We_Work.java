package Pages;

import Enums.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class How_We_Work extends MainSettings.Settings
{
    public static void how_we_work_present() {
        WebElement how_we_work_link = null;

        try {
            how_we_work_link = getDriver().findElement(By.xpath(Variables.HOW_WE_WORK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(how_we_work_link != null, "Test case is FAILED - BLOG LINK is ABSENT!!!");

    }
}

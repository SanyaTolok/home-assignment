package Pages;

import Elements.Button;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.Assert;

import java.util.Set;

/**
 * Created by ddidev on 12.04.16.
 */
public class Technology extends Settings {
    private static Button close_subscription_popup= new Button(By.xpath(Variables.SUBSCRIPTION_POPUP.toString()));
    private static Button technology_link = new Button(By.xpath(Variables.TECHNOLOGY_LINK.toString()));
    public static void get_coockie() {
        technology_link.click();
        boolean subscription_added = false;
        Set<Cookie> all_cookie;
        Settings.waitInSeconds(15);
        close_subscription_popup.click();
        driver.navigate().refresh();
        Settings.waitInSeconds(2);
        try {
            all_cookie=driver.manage().getCookies();
            all_cookie.toArray();
            if (all_cookie.contains("subscribePopUP=1")) subscription_added = true;
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(subscription_added == false, "Test case is FAILED -subscription not added");
    }
}

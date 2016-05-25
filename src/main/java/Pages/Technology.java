package Pages;
import Elements.Button;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import java.util.Set;
public class Technology extends Settings {
    private static Button close_subscription_popup= new Button(By.xpath(Variables.SUBSCRIPTION_POPUP.toString()));
    private static Button technology_link = new Button(By.xpath(Variables.TECHNOLOGY_LINK.toString()));
    public static void get_cookies() {
        technology_link.click(); // clicking on the link
        boolean subscription_added = false;// boolean variable for validation
        Set<Cookie> all_cookie;
        Settings.waitInSeconds(15);
        close_subscription_popup.click();
        driver.navigate().refresh();//refreshing of page
        Settings.waitInSeconds(2);
        try {
            all_cookie=driver.manage().getCookies();//getting all cookies
            all_cookie.toArray();// convert cookies to array
            if (all_cookie.contains("subscribePopUP=1")) subscription_added = true;//searching of needed record
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(subscription_added == false, "Test case is FAILED - subscription not added");//showing error message in the log if cookies subscribePopUP=1 not founded
    }
}

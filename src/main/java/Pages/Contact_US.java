package Pages;

import Elements.Button;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;

public class Contact_US extends Settings
{
    private static Button close_subscription_popup= new Button(By.xpath(Variables.SUBSCRIPTION_POPUP.toString()));
    private static Button contact_us= new Button(By.xpath(Variables.CONTACTS_LINK.toString()));
    public static Contact_US send_request()
    {
        contact_us.click();
        return new Contact_US();
    }
}

package Pages;

import Elements.Button;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings_PhantomJS;
import org.openqa.selenium.By;

public class Services extends Settings_PhantomJS {
    private static Button services_link = new Button(By.xpath(Variables.OPEN_MENU_SERVISES.toString()));
    private static Button contact_us= new Button(By.xpath(Variables.CONTACTS_LINK.toString()));
    private static Button send=new Button(By.xpath(Variables.SEND_SERVICES_FORM.toString()));
    private static TextField name = new TextField(By.xpath(Variables.NAME_SERVICES_FORM.toString()));
    private static TextField email = new TextField(By.xpath(Variables.EMAIL_SERVICES_FORM.toString()));
    private static TextField phone = new TextField(By.xpath(Variables.PHONE_SERVICES_FORM.toString()));
    private static TextField description=new TextField(By.xpath(Variables.DESCRIPTION_SERVICES_FORM.toString()));
    private static Button custom=new Button(By.xpath(Variables.CUSTOM_SERVICES.toString()));
    private static Button close_subscription_popup= new Button(By.xpath(Variables.SUBSCRIPTION_POPUP.toString()));
    public static Services get_request_from_services_page()
    {
        Settings_PhantomJS.waitInSeconds(15);
        close_subscription_popup.click();
        contact_us.click();
        services_link.click();
        custom.click();
        name.enterText("DDI TEST NAME");
        phone.enterText("17183559302");
        email.enterText("test@ddi-dev.com");
        description.enterText("Automation test of services form");
        send.click();
        return new Services();
    }
}

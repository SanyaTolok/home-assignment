package Pages;
import Elements.Button;
import Elements.Element;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static Enums.Variables.SEND_SERVICES_FORM;


public class Services extends Settings {
    private static Button services_link = new Button(By.xpath(Variables.OPEN_MENU_SERVISES.toString()));
    private static Button contact_us= new Button(By.xpath(Variables.CONTACTS_LINK.toString()));
    private static Button send=new Button(By.xpath(SEND_SERVICES_FORM.toString()));
    private static Element send1=new Element(By.xpath(SEND_SERVICES_FORM.toString()));
    private static TextField name = new TextField(By.xpath(Variables.NAME_SERVICES_FORM.toString()));
    private static TextField email = new TextField(By.xpath(Variables.EMAIL_SERVICES_FORM.toString()));
    private static TextField phone = new TextField(By.xpath(Variables.PHONE_SERVICES_FORM.toString()));
    private static TextField description=new TextField(By.xpath(Variables.DESCRIPTION_SERVICES_FORM.toString()));
    private static Button custom=new Button(By.xpath(Variables.CUSTOM_SERVICES.toString()));
    private static Button close_subscription_popup= new Button(By.xpath(Variables.SUBSCRIPTION_POPUP.toString()));
    public static Services get_request_from_services_page()
    {
        contact_us.click();
        services_link.click();
        Settings.waitInSeconds(2);
        custom.click();
        Settings.waitInSeconds(15);
        close_subscription_popup.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,3500);");//Scroll down
        name.enterText("DDI TEST NAME");
        phone.enterText("17183559302");
        email.enterText("test@ddi-dev.com");
        description.enterText("Automation test of services form");
        try {
            Actions action = new Actions(driver);//creating of new action
            Actions actions;
            actions = action.moveToElement(driver.findElement(By.xpath(String.valueOf(SEND_SERVICES_FORM)))).click();//This action move to element by xpath
            actions.perform();// This action hover on button send
            //send.click();
        }
        catch (ElementNotVisibleException e)
        {
            Assert.fail("button is not visible it is impossible to hover on it");
        }

        Settings.waitInSeconds(5);
        contact_us.click();
        return new Services();
    }
}

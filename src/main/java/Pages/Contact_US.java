package Pages;
import Elements.Button;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;

public class Contact_US extends Settings
{
    private static Button close_subscription_popup= new Button(By.xpath(Variables.SUBSCRIPTION_POPUP.toString()));
    private static Button contact_us= new Button(By.xpath(Variables.CONTACTS_LINK.toString()));
    private static TextField email=new TextField(By.xpath(Variables.EMAIL_INPUT.toString()));
    private static TextField phone=new TextField(By.xpath(Variables.PHONE_INPUT.toString()));
    private static TextField name=new TextField(By.xpath(Variables.NAME_INPUT.toString()));
    private static TextField message=new TextField(By.xpath(Variables.MESSAGE_TEXTFIELD.toString()));
    private static Button sent= new Button(By.xpath(Variables.SENT_BUTTON.toString()));
    //private static TextField add_file= new TextField(By.xpath(Variables.ADD_FILE.toString()));
    private static Button zoom_in=new Button(By.xpath(Variables.ZOOM_IN.toString()));
    private static Button zoom_out=new Button(By.xpath(Variables.ZOOM_OUT.toString()));
    private static Button change_to_usa_location= new Button(By.xpath(Variables.CHANGE_TO_USA_LOCATION.toString()));
    public static Contact_US send_request() {
        contact_us.click();
        Settings.waitInSeconds(12);
        close_subscription_popup.click();
        name.enterText("DDI TEST NAME");
        phone.enterText("17183559302");
        email.enterText("test@ddi-dev.com");
        message.enterText("Automation test of contact us form");
        //add_file.enterText("home\\ddidev\\Downloads\\Kak_testiruyut_v_Google.pdf");
        Settings.waitInSeconds(5);
        sent.click();
        return new Contact_US();
    }
    public static Contact_US zoom_in_and_zoom_out_map()
    {
        contact_us.click();
        Settings.waitInSeconds(2);
        change_to_usa_location.click();
        driver.switchTo().frame("usa-map");
        Settings.waitInSeconds(3);
        zoom_in.click();
        zoom_in.click();
        zoom_out.click();
        zoom_out.click();
        return new Contact_US();
    }
    }


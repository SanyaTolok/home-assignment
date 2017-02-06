package Pages;
import Elements.Button;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Contact_US extends Settings
{
    private static Button contact_us= new Button(By.xpath(Variables.CONTACTS_LINK.toString()));
    private static TextField email=new TextField(By.xpath(Variables.EMAIL_INPUT.toString()));
    private static TextField phone=new TextField(By.xpath(Variables.PHONE_INPUT.toString()));
    private static TextField name=new TextField(By.xpath(Variables.NAME_INPUT.toString()));
    private static TextField message=new TextField(By.xpath(Variables.MESSAGE_TEXTFIELD.toString()));
    private static Button zoom_in=new Button(By.xpath(Variables.ZOOM_IN.toString()));
    private static Button zoom_out=new Button(By.xpath(Variables.ZOOM_OUT.toString()));
    private static Button change_to_usa_location= new Button(By.xpath(Variables.CHANGE_TO_USA_LOCATION.toString()));
    public static Contact_US send_request() {
        contact_us.click();
        Settings.waitInSeconds(3);
        name.enterText("DDI TEST NAME");
        phone.enterText("17183559302");
        email.enterText("test@ddi-dev.com");
        message.enterText("Automation test of contact us form(I am not robot ignored)");
        try {
            Robot robot = new Robot();
            robot.mouseMove(1177,904);
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            waitInSeconds(5);
            robot.mouseMove(844,745);
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(845,655);
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(845,560);
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(1101,1044);
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            waitInSeconds(3);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        Settings.waitInSeconds(7);
        Actions actions = new Actions(driver);
        WebElement sent= driver.findElement(By.xpath(Variables.SENT_BUTTON.toString()));
        actions.moveToElement(sent).click().build().perform();
        waitInSeconds(5);
        return new Contact_US();
    }
    public static Contact_US zoom_in_and_zoom_out_map()
    {
        contact_us.click();
        Settings.waitInSeconds(2);
        change_to_usa_location.click();
        driver.switchTo().frame("usa-map");
        Settings.waitInSeconds(5);
        zoom_in.click();
        zoom_in.click();
        zoom_out.click();
        zoom_out.click();
        return new Contact_US();
    }
    }


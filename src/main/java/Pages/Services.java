package Pages;
import Elements.Button;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static Enums.Variables.SEND_SERVICES_FORM;
public class Services extends Settings {

    private static Button send=new Button(By.xpath(SEND_SERVICES_FORM.toString()));
    private static TextField name = new TextField(By.xpath(Variables.NAME_SERVICES_FORM.toString()));
    private static TextField email = new TextField(By.xpath(Variables.EMAIL_SERVICES_FORM.toString()));
    private static TextField phone = new TextField(By.xpath(Variables.PHONE_SERVICES_FORM.toString()));
    private static TextField description=new TextField(By.xpath(Variables.DESCRIPTION_SERVICES_FORM.toString()));
    public static Services get_request_from_services_page()
    {
        Actions action = new Actions(driver);
        WebElement management = driver.findElement(By.xpath(Variables.SERVICES_LINK.toString()));
        action.moveToElement(management).moveToElement(driver.findElement(By.xpath(Variables.CUSTOM_SERVICES.toString()))).click().build().perform();
        Settings.waitInSeconds(5);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,3500);");//Scroll down
        waitInSeconds(2);
        name.enterText("DDI TEST NAME");
        phone.enterText("17183559302");
        email.enterText("test@ddi-dev.com");
        description.enterText("Automation test of services form");
        try {
            WebElement send_hover = driver.findElement(By.xpath(Variables.SEND_SERVICES_FORM.toString()));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", send_hover);
            send.click();
        }
        catch (ElementNotVisibleException e)
        {
            Assert.fail("button is not visible it is impossible to hover on it");
        }
        return new Services();
    }
}

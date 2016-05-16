package Pages;
import Elements.Button;
import Elements.Element;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;

public class HomePage extends Settings {

    private static Button start_project=new Button((By.xpath(Variables.START_PROJECT.toString())));
    private static Button close=new Button(By.xpath(Variables.START_PROJECT_CLOSE.toString()));
    private static Button send=new Button(By.xpath(Variables.START_PROJECT_SEND_BUTTON.toString()));
    private static TextField name=new TextField(By.xpath(Variables.START_PROJECT_NAME.toString()));
    private static TextField email=new TextField(By.xpath(Variables.START_PROJECT_EMAIL.toString()));
    private static TextField phone=new TextField(By.xpath(Variables.START_PROJECT_PHONE.toString()));
    private static TextField message=new TextField(By.xpath(Variables.START_PROJECT_MESSAGE.toString()));
    private static TextField subscribe=new TextField(By.xpath(Variables.SUBSCRIBE.toString()));
    private static Button sign_in=new Button(By.xpath(Variables.SIGN_UP.toString()));
    private static Element congrats=new Element(By.xpath(Variables.CONGRATS.toString()));
    public static void services_link_present() {
        WebElement services_link = null;
        try {

            services_link = getDriver().findElement(By.xpath(Variables.SERVICES_LINK.toString()));
            services_link.click();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(services_link != null, "Test case is FAILED - Services LINK is ABSENT!!!");

    }

    public static void technology_link_present() {
        WebElement technology_link = null;
        try {
            technology_link = getDriver().findElement(By.xpath(Variables.TECHNOLOGY_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(technology_link != null, "Test case is FAILED - TECHNOLOGY LINK is ABSENT!!!");

    }

    public static void blog_link_present() {
        WebElement blog_link = null;
        try {
            blog_link = getDriver().findElement(By.xpath(Variables.BLOG_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(blog_link != null, "Test case is FAILED - BLOG LINK is ABSENT!!!");

    }

    public static void company_link_present() {
        WebElement company_link = null;
        try {
            company_link = getDriver().findElement(By.xpath(Variables.COMPANY_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(company_link != null, "Test case is FAILED - CCOMPANY LINK is ABSENT!!!");

    }

    public static void contuct_us_link_present() {
        WebElement contuct_us_link = null;
        try {
            contuct_us_link = getDriver().findElement(By.xpath(Variables.CONTACTS_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(contuct_us_link != null, "Test case is FAILED - CONTACT US LINK is ABSENT!!!");

    }


    public static void portfolio_link_present() {
        WebElement portfolio_link = null;
        try {
            portfolio_link = getDriver().findElement(By.xpath(Variables.PORTFOLIO_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(portfolio_link != null, "Test case is FAILED -PORTFOLIO LINK is ABSENT!!!");

    }
    public static HomePage send_request()
    {
        start_project.click();
        name.enterText("DDI DEV TEST START PROJECT");
        email.enterText("ddi-dev@test.com");
        phone.enterText("17183559302");
        message.enterText("short test message");
        send.click();
        return new HomePage();
    }
    public static HomePage subscribe_email()
    {
        subscribe.enterText("ddi-dev@test.com");
        sign_in.click();
        congrats.isPresent();
        return new HomePage();
    }
}




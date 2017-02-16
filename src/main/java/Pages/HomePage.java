package Pages;
import Elements.Button;
import Elements.Element;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertTrue;

public class HomePage extends Settings {

    private static Button start_project=new Button((By.xpath(Variables.START_PROJECT.toString())));
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
        services_link.click();
        waitInSeconds(2);
        verify_response();
    }

    public static void technology_link_present() {
        WebElement technology_link = null;
        try {
            technology_link = getDriver().findElement(By.xpath(Variables.TECHNOLOGY_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(technology_link != null, "Test case is FAILED - TECHNOLOGY LINK is ABSENT!!!");
        technology_link.click();
        waitInSeconds(2);
        verify_response();
    }

    public static void blog_link_present() {
        WebElement blog_link = null;
        try {
            blog_link = getDriver().findElement(By.xpath(Variables.BLOG_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(blog_link != null, "Test case is FAILED - BLOG LINK is ABSENT!!!");
       blog_link.click();
        waitInSeconds(2);
        verify_response();
    }

    public static void company_link_present() {
        WebElement company_link = null;
        try {
            company_link = getDriver().findElement(By.xpath(Variables.COMPANY_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(company_link != null, "Test case is FAILED - COMPANY LINK is ABSENT!!!");
        company_link.click();
        waitInSeconds(2);
        verify_response();
    }

    public static void contuct_us_link_present() {
        WebElement contuct_us_link = null;
        try {
            contuct_us_link = getDriver().findElement(By.xpath(Variables.CONTACTS_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(contuct_us_link != null, "Test case is FAILED - CONTACT US LINK is ABSENT!!!");
        contuct_us_link.click();
        waitInSeconds(2);
        verify_response();
    }


    public static void portfolio_link_present() {
        WebElement portfolio_link = null;
        try {
            portfolio_link = getDriver().findElement(By.xpath(Variables.PORTFOLIO_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(portfolio_link != null, "Test case is FAILED -PORTFOLIO LINK is ABSENT!!!");
        portfolio_link.click();
        waitInSeconds(2);
        verify_response();
    }
    public static HomePage send_request()
    {
        Settings.waitInSeconds(3);
        start_project.click();
        Settings.waitInSeconds(2);
        name.isClickable();
        name.enterText("DDI DEV TEST START PROJECT");
        email.isClickable();
        email.enterText("ddi-dev@test.com");
        phone.isClickable();
        phone.enterText("17183559302");
        message.isClickable();
        message.enterText("short test message");

        try {
            Robot robot = new Robot();
            robot.mouseMove(784,689);
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
            waitInSeconds(10);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        return new HomePage();
    }
    public static HomePage subscribe_email()
    {
        Settings.waitInSeconds(2);
        subscribe.enterText("ddi-dev@test.com");
        sign_in.click();
        congrats.isPresent();
        return new HomePage();
    }
    static void verify_response()
    {
        URL url = null;
        try {
            url = new URL(driver.getCurrentUrl());
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
        HttpURLConnection httpCon = null;
        try {
            if (url != null) {
                httpCon = (HttpURLConnection)url.openConnection();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            if (httpCon != null) {
                if (httpCon.getResponseMessage().contains("OK")) {
                    System.out.println("\n Response Message is " + httpCon.getResponseMessage());
                    httpCon.disconnect();
                } else {
                    Assert.fail("\n Response Message isn't OK, response is " + httpCon.getResponseMessage());
                    httpCon.disconnect();
                }
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}




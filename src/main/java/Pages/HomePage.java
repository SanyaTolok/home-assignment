package Pages;

import Elements.Button;
import Enums.Variables;
import MainSettings.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class HomePage extends Settings {
    private static Button close_subscription_popup= new Button(By.xpath(Variables.SUBSCRIPTION_POPUP.toString()));
    public static void services_link_present() {
        WebElement services_link = null;
        try {
            close_subscription_popup.click();
            services_link = getDriver().findElement(By.xpath(Variables.SERVICES_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(services_link == null, "Test case is FAILED - Services LINK is ABSENT!!!");

    }

    public static void technology_link_present() {
        WebElement technology_link = null;
        try {
            technology_link = getDriver().findElement(By.xpath(Variables.TECHNOLOGY_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(technology_link == null, "Test case is FAILED - TECHNOLOGY LINK is ABSENT!!!");

    }

    public static void blog_link_present() {
        WebElement blog_link = null;
        try {
            blog_link = getDriver().findElement(By.xpath(Variables.BLOG_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(blog_link == null, "Test case is FAILED - BLOG LINK is ABSENT!!!");

    }

    public static void company_link_present() {
        WebElement company_link = null;
        try {
            company_link = getDriver().findElement(By.xpath(Variables.COMPANY_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(company_link == null, "Test case is FAILED - CCOMPANY LINK is ABSENT!!!");

    }

    public static void contuct_us_link_present() {
        WebElement contuct_us_link = null;
        try {
            contuct_us_link = getDriver().findElement(By.xpath(Variables.CONTACTS_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(contuct_us_link == null, "Test case is FAILED - CONTACT US LINK is ABSENT!!!");

    }


    public static void portfolio_link_present() {
        WebElement portfolio_link = null;
        try {
            portfolio_link = getDriver().findElement(By.xpath(Variables.PORTFOLIO_LINK.toString()));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        assertTrue(portfolio_link == null, "Test case is FAILED -PORTFOLIO LINK is ABSENT!!!");

    }

    public static void get_coockie() {
        boolean subscription_added = false;
        Cookie subscription;
        try {
            subscription = driver.manage().getCookieNamed("subscribePopUP");
            if (subscription.getValue() == String.valueOf(1)) subscription_added = true;
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(subscription_added == false, "Test case is FAILED -subscription not added");
    }
}




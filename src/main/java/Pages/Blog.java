package Pages;
import Elements.Button;
import Elements.TextField;
import Enums.Variables;
import MainSettings.Settings;
import bsh.Console;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class Blog extends Settings {
    private static Button blog_link= new Button(By.xpath(Variables.BLOG_LINK.toString()));
    private static Button share_facebook= new Button(By.xpath(Variables.SHARE_FACEBOOK.toString()));
    private static Button cancel_facebook= new Button(By.xpath(Variables.CANCEL_FACEBOOK.toString()));
    private static Button article= new Button(By.xpath(Variables.ARTICLE_LINK.toString()));
    private static Button share_tweet= new Button(By.xpath(Variables.SHARE_TWEET.toString()));
    private static Button share_linkedin= new Button(By.xpath(Variables.SHARE_LINKED_IN.toString()));
    private static Button share_google= new Button(By.xpath(Variables.SHARE_GOOGLE.toString()));
    private static Button share_email= new Button(By.xpath(Variables.SHARE_EMAIL.toString()));
    private static Button close_subscription_popup= new Button(By.xpath(Variables.SUBSCRIPTION_POPUP.toString()));
    private static Button previous=new Button(By.xpath(Variables.PREVIOUS_PAGE.toString()));
    private static Button next_page=new Button(By.xpath(Variables.NEXT_PAGE.toString()));

    public static Blog all_tabs_exsist()
    {
        blog_link.click();
        Settings.waitInSeconds(12);
        close_subscription_popup.click();
        return new Blog();
    }
    public static Blog share_facebook()
    {
        blog_link.click();
        Settings.waitInSeconds(15);
        close_subscription_popup.click();
        article.waitForElementIsPresent();
        article.click();
        share_facebook.waitForElementIsPresent();
        share_facebook.click();
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
       while(iterator.hasNext())
        {
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        String url = driver.getCurrentUrl();// get popup url
        boolean share_facebook=false;
        if(url.contains("https://www.facebook.com/login.php")) {
            share_facebook = true;
            Assert.assertTrue(share_facebook, "Test passed");
            cancel_facebook.click();
                    }
        else
        {
            Assert.assertTrue(share_facebook!=true,"Test failed");
        }

        driver.switchTo().window(parentWindowHandler);  // switch back to parent window
        return new Blog();
    }
    public static Blog share_tweet()
    {
        blog_link.click();
        Settings.waitInSeconds(15);
        close_subscription_popup.click();
        article.waitForElementIsPresent();
        article.click();
        share_tweet.waitForElementIsPresent();
        share_tweet.click();
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while(iterator.hasNext())
        {
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        String url_tweet = driver.getCurrentUrl();
        boolean share_tweet=false;
        if(url_tweet.contains("https://twitter.com")) {
            share_tweet = true;
            Assert.assertTrue(share_tweet, "Test passed");
            driver.close();
        }
        else
        {
            Assert.assertTrue(share_tweet!=true,"Test failed");
        }
        driver.switchTo().window(parentWindowHandler);
        return new Blog();
    }
    public static Blog test_paging()
    {

        return new Blog();
    }
}
